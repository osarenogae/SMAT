package io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.filechooser.FileFilter;

import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import RiskMatrixModel.RiskMatrix;
import careProcess_model.CareProcess;
import careProcess_model.Project;
import careProcess_model.Repository;
import graphEditor.CellStepConnector;
import main.Main;

public class InputOutput {

	public static Repository loadRepository(String path, String extension)
			throws org.eclipse.emf.common.util.WrappedException {
		// Register the XMI resource factory for the extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(extension, new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createURI(path), true);

		Repository repository = (Repository) resource.getContents().get(0);
		return repository;
	}

	public static void saveRepository(Repository repositroy, String path, String extension) {
		// Register the XMI resource factory for the extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(extension, new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(path));

		resource.getContents().add(repositroy);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Load the risk matrix from the file with the given path.
	 * 
	 * @param path
	 *            the filepath to the risk matrix file
	 * @param extension
	 *            the file extension of this type of file
	 * @return the loaded RiskMatrix instance
	 * @throws org.eclipse.emf.common.util.WrappedException
	 */
	public static RiskMatrix loadRiskMatrix(String path, String extension)
			throws org.eclipse.emf.common.util.WrappedException {

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(extension, new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.getResource(URI.createFileURI(path), true);

		RiskMatrix p = (RiskMatrix) resource.getContents().get(0);
		return p;
	}

	/**
	 * As {@link #loadRiskMatrix(String, String)}, but loading the RiskMatrix
	 * instance from a string instead of a file.
	 * 
	 * @param xmlString
	 * @param extension
	 * @return the loaded RiskMatrix
	 * @throws IOException
	 */
	public static RiskMatrix loadRiskMatrixFromString(String xmlString, String extension) throws IOException {

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(extension, new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.createResource(URI.createURI("*." + extension));
		resource.load(new URIConverter.ReadableInputStream(xmlString), null);

		return (RiskMatrix) resource.getContents().get(0);
	}

	/**
	 * Get the XMI string for the given RiskMatrix instance. Used to store the
	 * RiskMatrix in a project's data
	 * 
	 * @param matrix
	 * @return
	 * @throws IOException
	 */
	public static String getRiskMatrixString(RiskMatrix matrix) throws IOException {
		// Register the XMI resource factory for the extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		// create a resource
		Resource resource = resSet.createResource(URI.createURI("*"));
		resource.getContents().add(matrix);

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		resource.save(outputStream, null);
		return outputStream.toString();
	}

	/**
	 * Check whether the saved version of the project matches the open one.
	 * @param projectIn
	 * The currently open project.
	 * @param projectFilePath
	 * The path to the saved project file.
	 * @param projectFileExtension
	 * The file extension of the project file.
	 * @return
	 * true if the two versions match, false otherwise.
	 * @throws IOException
	 */
	public static boolean isProjectSaved(Project projectIn, String projectFilePath, String projectFileExtension)
			throws IOException {
		// Load the currently saved version of the project.
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(projectFileExtension, new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createFileURI(projectFilePath), true);
		Project p = (Project) resource.getContents().get(0);
		loadGraphData(p);

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		resource.save(outputStream, null);
		String savedVersion = outputStream.toString();

		// Get the string version of the current project.
		Resource.Factory.Registry reg2 = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m2 = reg.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
		ResourceSet resSet2 = new ResourceSetImpl();
		Resource resource2 = resSet.createResource(URI.createURI("*"));
		resource.getContents().add(projectIn);

		ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
		resource.save(outputStream, null);
		String currentVersion = outputStream2.toString();
		
		return currentVersion.equals(savedVersion);
	}

	public static Project loadProject(String path, String extension) {

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(extension, new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		
		XMIResource resource = new XMIResourceImpl(URI.createFileURI(path));
		try {
			resource.load(null);
		} catch (IOException e) {
			System.out.println("File Opened With Errors");
			e.printStackTrace();
		}
		
		Project p = (Project) resource.getContents().get(0);
		loadGraphData(p);
		return p;
	}

	public static void loadGraphData(Project p) {
		CellStepConnector c = new CellStepConnector();
		Iterator<CareProcess> careProcessIterator = p.getCareProcesses().iterator();
		while (careProcessIterator.hasNext()) {
			c.deserialiseDataMapTable(careProcessIterator.next().getProcessGraph().getDataMap());
		}
		c.populateStepUUIDMapTable(p);
	}

	public static void saveProject(Project project, String path, String extension) throws IOException {
		// Register the XMI resource factory for the extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(extension, new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		// create a resource
		Resource resource = resSet.createResource(URI.createFileURI(path));
		resource.getContents().add(project);

		resource.save(Collections.EMPTY_MAP);
	}

	public static FileFilter getFileFilter() {
		FileFilter logFilefilter = new FileFilter() {
			public boolean accept(File file) {
				if (file.getName().endsWith("." + Main.ProjectExtension)) {
					return true;
				}
				if(file.isDirectory()) {
					return true;
				}
				return false;
			}

			@Override
			public String getDescription() {
				return "Project files";
			}
		};
		return logFilefilter;
	}

	public static FileFilter getRiskMatrixFileFilter() {
		FileFilter logFilefilter = new FileFilter() {
			public boolean accept(File file) {
				if (file.getName().endsWith("." + Main.DEFAULT_RISK_MATRIX_EXTENSION)) {
					return true;
				}
				return false;
			}

			@Override
			public String getDescription() {
				return "Risk Matrix files";
			}
		};
		return logFilefilter;
	}
}

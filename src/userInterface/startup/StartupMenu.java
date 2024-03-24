package userInterface.startup;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.AbstractAction;
import javax.swing.BoxLayout;
import javax.swing.JFileChooser;

import java.awt.Color;
import guiComponents.IconDescriptionButton;
import io.InputOutput;
import main.Main;
import userInterface.CardPanelProcessSectionHome;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

import javax.swing.JLabel;

public class StartupMenu extends JFrame {

	private JPanel contentPane;
	private final JFileChooser fc;

	/**
	 * Create the frame.
	 */
	public StartupMenu() {
		setTitle(ResourceBundle.getBundle("userInterface.messages").getString("global.application_title"));
		
		//Create a file chooser and set it to select only project files
		fc = new JFileChooser();
		fc.setFileFilter(InputOutput.getFileFilter());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 10));
		
		IconDescriptionButton newProjectButton = new IconDescriptionButton(true,true,StartupMenu.class.getResource("/res/pencil-2x.png"), "New Project", "Create a new safety case project");
		panel.add(newProjectButton);
		newProjectButton.setAction(new NewProjectAction());
		
		IconDescriptionButton loadProjectButton = new IconDescriptionButton(true,true,StartupMenu.class.getResource("/res/folder-2x.png"), "Load Project", "Load an existing project");
		panel.add(loadProjectButton);
		loadProjectButton.setAction(new LoadProjectAction());
	}

	
	private void newProject(){
		
		int returnVal = fc.showSaveDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
           File file = fc.getSelectedFile();
           Main.setProjectFilepath(file.getName(), file.getPath()+"."+Main.ProjectExtension);
           Main.newProject();
           dispose();
        }
	}
	
	private void loadProject(){
		int returnVal = fc.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
           File file = fc.getSelectedFile();
           Main.setProjectFilepath(file.getName(), file.getPath());
           Main.loadProject();
           dispose();
        }
	}
	
	
	/**
	 * 
	 * Actions
	 * 
	 */
	
	private class NewProjectAction extends AbstractAction {
		public void actionPerformed(ActionEvent e) {
			newProject();
		}
	}
	
	private class LoadProjectAction extends AbstractAction {
		public void actionPerformed(ActionEvent e) {
			loadProject();
		}
	}
}

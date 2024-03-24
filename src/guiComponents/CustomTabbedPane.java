package guiComponents;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

import careProcess_model.CareProcess;
import graphEditor.GraphEditorPanel2;
import userInterface.EditorDataPanel;

public class CustomTabbedPane extends JTabbedPane {
	
	public CustomTabbedPane(int type) {
		super(type);
	}

	public void addTab(String title, Icon icon, EditorDataPanel editorDataPanel, GraphEditorPanel2 graphEditorPanel2, String tip){
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.5);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setRightComponent(editorDataPanel);
		splitPane.setLeftComponent(graphEditorPanel2);
		addTab(title,icon,splitPane,tip);
		

	}
	
	public CareProcess getCareProcessAtTabIndex(int index){
		return ((GraphEditorPanel2)((JSplitPane)this.getComponentAt(index)).getLeftComponent()).getCareProcess();
	}

}

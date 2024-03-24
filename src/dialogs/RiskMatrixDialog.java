package dialogs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import RiskMatrixModel.LikelihoodLevel;
import RiskMatrixModel.RiskMatrix;
import RiskMatrixModel.RiskRatingInstance;
import guiComponents.MatrixTableModel;
import io.InputOutput;
import main.Main;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.BoxLayout;
import javax.swing.ScrollPaneConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class RiskMatrixDialog extends JDialog {
	
	private static final String UNNACCEPTABLE_LABEL = "Unacceptable Risk Level";
	
	private final JFileChooser fc;

	private final JPanel contentPanel = new JPanel();
	private JTable matrixTable;
	private JTable likelihoodLableTable;

	private int maxValue;
	private boolean maxFound = false;
	private int minValue;
	private boolean minFound = false;
	private final Action importAction = new ImportAction();
	private final Action okAction = new OKAction();
	private final Action cancelAction = new CancelAction();
	private JScrollPane scrollPane;
	private JLabel unacceptableLabel;
	
	private RiskMatrix currentMatrix = Main.getRiskMatrix();
	
	public RiskMatrixDialog() {
		
		//Create a file chooser and set it to select only risk matrix files
		fc = new JFileChooser();
		fc.setFileFilter(InputOutput.getRiskMatrixFileFilter());
		
		this.setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Project Risk Matrix");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			scrollPane = new JScrollPane();
			{
				matrixTable = new JTable(){
					 @Override
					    public Component prepareRenderer(TableCellRenderer renderer, int row, int col) {
					        Component component = super.prepareRenderer(renderer, row, col);
					        Object value = getModel().getValueAt(row, col);
					        int v=0;
					        if(value instanceof Integer){
					        	v = (int) value;
					        }
					        component.setBackground(getColorForValue(v, currentMatrix));
					        
					        return component;
					 }
				};
				matrixTable.setFillsViewportHeight(true);
				matrixTable.setRowSelectionAllowed(false);
				scrollPane.setViewportView(matrixTable);
			}
			{
				likelihoodLableTable = new JTable();
				likelihoodLableTable.setRowSelectionAllowed(false);
				likelihoodLableTable.setFillsViewportHeight(true);
				scrollPane.setRowHeaderView(likelihoodLableTable);
			}
		}
		{
			unacceptableLabel = new JLabel(UNNACCEPTABLE_LABEL);
		}
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
				.addComponent(unacceptableLabel, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(unacceptableLabel)
					.addContainerGap())
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.SOUTH);
			panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
			{
				JPanel importButtonPane = new JPanel();
				FlowLayout flowLayout = (FlowLayout) importButtonPane.getLayout();
				flowLayout.setAlignment(FlowLayout.LEFT);
				panel.add(importButtonPane);
				{
					JButton btnImport = new JButton("Import");
					btnImport.setAction(importAction);
					importButtonPane.add(btnImport);
				}
			}
			{
				JPanel buttonPane = new JPanel();
				panel.add(buttonPane);
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				{
					JButton okButton = new JButton("OK");
					okButton.setAction(okAction);
					okButton.setActionCommand("OK");
					buttonPane.add(okButton);
					getRootPane().setDefaultButton(okButton);
				}
				{
					JButton cancelButton = new JButton("Cancel");
					cancelButton.setAction(cancelAction);
					cancelButton.setActionCommand("Cancel");
					buttonPane.add(cancelButton);
				}
			}
		}
		
		
		if(currentMatrix!=null){
			populateRiskMatrixTable(currentMatrix);
		}
				
		//Make sure the dialog is centred in the screen
		this.setLocationRelativeTo(null);
	}

	public Color getColorForValue(float i, RiskMatrix rm){
		//Less severe colour
		Color a = Color.getHSBColor(0.28f, 0.33f, 0.9f);
		//More severe colour
		Color b = Color.getHSBColor(0f, 0.5f, 0.9f);
		
		int Ar = a.getRed();
		int Ag = a.getGreen();
		int Ab = a.getBlue();
		
		int Br = b.getRed();
		int Bg = b.getGreen();
		int Bb = b.getBlue();
		
		int max = findMaxValue(rm);
		int min = findMinValue(rm);
		
		float bProportion = i/max;
		float aProportion = 1-bProportion;
		
		float[] hsb = new float[3];
		Color.RGBtoHSB((int)(bProportion*Br + aProportion*Ar), (int)(bProportion*Bg + aProportion*Ag), (int)(bProportion*Bb + aProportion*Ab), hsb);
		return Color.getHSBColor(hsb[0],hsb[1],hsb[2]);		
	}
	
	public int findMaxValue(RiskMatrix rm){
		if(maxFound){
			return maxValue;
		}
		for(RiskRatingInstance r:rm.getRiskratinginstance()){
			if(r.getRiskValue()>maxValue){
				maxValue = (int) r.getRiskValue();
			}
		}		
		maxFound = true;
		return maxValue;
	}
	
	public int findMinValue(RiskMatrix rm){
		if(minFound){
			return minValue;
		}
		for(RiskRatingInstance r:rm.getRiskratinginstance()){
			if(r.getRiskValue()<minValue){
				minValue = (int) r.getRiskValue();
			}
		}		
		minFound = true;
		return minValue;
	}
	
	public void populateRiskMatrixTable(RiskMatrix rm){
		maxFound = false;
		minFound = false;
		
		unacceptableLabel.setText(UNNACCEPTABLE_LABEL+": "+Integer.toString(rm.getMinUnacceptableRisk()));
		
		int likelihoods = rm.getLikelihoodlevel().size();
		int severities = rm.getSeveritylevel().size();
		
		Object[][] tableContent = new Object[likelihoods][severities];
		Object[][] likelihoodLabelContent = new Object[likelihoods][1];		
		Object[] severityLabels = new Object[severities];
		
		Iterator<LikelihoodLevel> likelihoodLevelIterator = rm.getLikelihoodlevel().iterator();
		while(likelihoodLevelIterator.hasNext()){
			LikelihoodLevel l = likelihoodLevelIterator.next();
			Iterator<RiskRatingInstance> riskRatingIterator = l.getRiskratinginstance().iterator();
			while(riskRatingIterator.hasNext()){
				RiskRatingInstance riskRating = riskRatingIterator.next();
				tableContent[l.getLevelIndex()][riskRating.getSeveritylevel().getLevelIndex()] = riskRating.getRiskValue();
				likelihoodLabelContent[l.getLevelIndex()][0] = l.getLevelName();
				severityLabels[riskRating.getSeveritylevel().getLevelIndex()] = riskRating.getSeveritylevel().getLevelName();
			}
			
		}
		
		//Fix the width of the row header column (to 100)
		Dimension d = likelihoodLableTable.getPreferredScrollableViewportSize();
		likelihoodLableTable.setPreferredSize(new Dimension(100,(int) d.getHeight()));
		d.width = likelihoodLableTable.getPreferredSize().width;
		likelihoodLableTable.setPreferredScrollableViewportSize(d);
		
		MatrixTableModel m = new MatrixTableModel(tableContent, severityLabels);
		MatrixTableModel likelihoodLabelModel = new MatrixTableModel(likelihoodLabelContent,new Object[]{null});
		matrixTable.setModel(m);
		likelihoodLableTable.setModel(likelihoodLabelModel);
		
		matrixTable.getTableHeader().setReorderingAllowed(false);
		matrixTable.getTableHeader().setResizingAllowed(false);
	}
	
	private void loadMatrix(){
		int returnVal = fc.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
           File file = fc.getSelectedFile();
           System.out.println(file.getPath());
           RiskMatrix rm = InputOutput.loadRiskMatrix(file.getPath(), Main.DEFAULT_RISK_MATRIX_EXTENSION);
           if(rm!=null){
        	   currentMatrix = rm;
        	   populateRiskMatrixTable(rm);
           }
        }
	}
	
	private class ImportAction extends AbstractAction {
		public ImportAction() {
			putValue(NAME, "Import");
			putValue(SHORT_DESCRIPTION, "Import a risk matrix from a file");
		}
		public void actionPerformed(ActionEvent e) {
			loadMatrix();
		}
	}
	private class OKAction extends AbstractAction {
		public OKAction() {
			putValue(NAME, "OK");
		}
		public void actionPerformed(ActionEvent e) {
			Main.setRiskMatrix(currentMatrix);
			dispose();
		}
	}
	private class CancelAction extends AbstractAction {
		public CancelAction() {
			putValue(NAME, "Cancel");
		}
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
}

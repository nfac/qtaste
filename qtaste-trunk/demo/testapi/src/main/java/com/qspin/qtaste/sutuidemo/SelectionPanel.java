package com.qspin.qtaste.sutuidemo;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;

final class SelectionPanel extends JPanel {

	public SelectionPanel()
	{
		super();
		setName(COMPONENT_NAME);
		
		genUI();
	}
	
	
	private void genUI()
	{
		prepareComponent();
		setLayout(new GridLayout(NUMBER_OF_COMPONENT,2, 5, 5));
		add(new JLabel("JList :"));
		add(mList);
		add(new JLabel("JSpinner :"));
		add(mSpinner);
		add(new JLabel("JSlider :"));
		add(mSlider);
		add(new JLabel("JComboBox :"));
		add(mCombo);
	}
	
	private void prepareComponent()
	{
		mSpinner.setName("SPINNER");
		mSlider.setName("SLIDER");
		mCombo.setName("COMBO_BOX");
		mCombo.setRenderer(new CustomListCellRenderer());
		mList.setName("LIST");
		mList.setCellRenderer(new CustomListCellRenderer());
	}

	private JSpinner mSpinner = new JSpinner();
	private JSlider mSlider = new JSlider();
	private JComboBox mCombo = new JComboBox(ModelBuilder.getComboBoxModel());
	private JList mList = new JList(ModelBuilder.getListModel());
	
	private static final int NUMBER_OF_COMPONENT = 4;
	public static final String COMPONENT_NAME = "SELECTION_PANEL";
	
}

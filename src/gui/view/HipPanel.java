package gui.view;

import javax.swing.SpringLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import gui.controller.HipGUI;
import java.awt.Color;

public class HipPanel extends JPanel
{
	private HipGUI hipGUI;
	private SpringLayout baseLayout;
	private JComboBox phraseComboBox;

	public HipPanel(HipGUI hipGUI)
	{
		this.hipGUI = hipGUI;
		baseLayout = new SpringLayout();
		phraseComboBox = new JComboBox<String>();

		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	
	}
	private void setupComboBox()
	{
		String [] phrases = hipGUI.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.CYAN);
		this.add(phraseComboBox);
		
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int red = (int) (Math.random() * 256);
				int green = (int)(Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				setBackground(new Color(red,green,blue));
				String updatedTitle = phraseComboBox.getSelectedItem().toString();
				hipGUI.getHipFrame().setTitle(updatedTitle);
			}
		});
	}
}

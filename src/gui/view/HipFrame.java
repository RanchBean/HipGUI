package gui.view;

import javax.swing.JFrame;
import gui.controller.HipGUI;
import javax.swing.JOptionPane;

public class HipFrame extends JFrame
{

	private HipGUI hipGUI;
	private HipPanel hipPanel;
	
	public HipFrame(HipGUI hipGUI)
	{
		this.hipGUI = hipGUI;
		hipPanel = new HipPanel(hipGUI);
		setupFrame();
	}
	public String getResponse(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prompt);
		return response;
	}
	private void setupFrame()
	{
		this.setContentPane(hipPanel);
		this.setSize(500,500);
		this.setResizable(false);
		this.setVisible(true);
	}
	public HipGUI getHipGUI()
	{
		return hipGUI;
	}
}

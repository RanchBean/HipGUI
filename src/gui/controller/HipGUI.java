package gui.controller;

import hip.model.Hipster;
import gui.view.HipFrame;
/**
 * Holds all of the frame and panel componets from view package.
 * @author ethr5627
 *
 */
public class HipGUI 
{
	private Hipster firstHipster;
	private HipFrame hipFrame;
	public HipGUI()
	{
		firstHipster = new Hipster();
		hipFrame = new HipFrame(this);
	}
	public void start()
	{
		String myName = hipFrame.getResponse("What is your name?");
		firstHipster.setName(myName);
		hipFrame.setTitle(myName + " 's Hipster object!");
	}
	
	public Hipster getFirstHipster()
	{
		return firstHipster;
	}
	
	public HipFrame getHipFrame()
	{
		return hipFrame;
	}
}

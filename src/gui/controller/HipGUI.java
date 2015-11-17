package gui.controller;

import hip.model.Hipster;
import gui.view.HipFrame;

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

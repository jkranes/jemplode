package org.jempeg.empeg.manager.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import org.jempeg.empeg.manager.Main;


public class OpenAnotherDeviceAction extends AbstractAction {
	public OpenAnotherDeviceAction() {
	}
	
	public void actionPerformed(ActionEvent _event) {
		Main.start();
	}
}

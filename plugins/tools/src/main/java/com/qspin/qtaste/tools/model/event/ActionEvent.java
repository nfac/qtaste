package com.qspin.qtaste.tools.model.event;

public class ActionEvent extends Event {
	
	public ActionEvent(Event pEvent) {
		super();
		setComponentName(pEvent.getComponentName());
		setSourceClass(pEvent.getSourceClass());
		setTimeStamp(pEvent.getTimeStamp());
		setType(pEvent.getType());
	}

	public String getId() {
		return mId;
	}
	public void setId(String id) {
		this.mId = id;
	}
	public String getActionCommand() {
		return mActionCommand;
	}
	public void setActionCommand(String actionCommand) {
		this.mActionCommand = actionCommand;
	}

	private String mId;
	private String mActionCommand;
}

package org.mukesh.test;

public enum ApplicationResponseCode {

	STATUS_OK(200, "response.ok.success"),
	BAD_REQUEST(400, "response.bad.request");	
	
	private final String messageKey;
	
	private ApplicationResponseCode(final Integer code, String messageKey){
		
		System.out.println("ApplicationResponseCode constructor called...");
		
		this.messageKey = messageKey;		
	}
	
	public String getMessageKey(){
		
		return this.messageKey;
		
	}
	
	
}

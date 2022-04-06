package com.company;

public class BRException extends Exception{
	
	private String message;
    
    public BRException(String message){
        super();
        this.message=message;
    }
	
	@Override
    public String getMessage(){
         
        return message;
         
    }

}

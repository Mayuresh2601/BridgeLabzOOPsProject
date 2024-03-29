/******************************************************************************
*  
*  Purpose: To Perform Proxy Design Pattern
*  @author  Mayuresh Sunil Sonar
*
******************************************************************************/
package com.bridgelabz.designpattern.proxydesign;

public class CommandMain {
	
	public static void main(String[] args) {
		
		CommandExecutionProxy executor = new CommandExecutionProxy("", "");
		try {
			executor.writecommand("ls -ltr");
			executor.writecommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
	}

}

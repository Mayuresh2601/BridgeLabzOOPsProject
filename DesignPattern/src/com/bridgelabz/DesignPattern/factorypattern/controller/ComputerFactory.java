package com.bridgelabz.DesignPattern.factorypattern.controller;

import com.bridgelabz.DesignPattern.factorydesign.computers.Computer;
import com.bridgelabz.DesignPattern.factorydesign.computers.PC;
import com.bridgelabz.DesignPattern.factorydesign.computers.Server;

public class ComputerFactory {
	
	public static Computer getComputer(String type, String Ram,String HDD,String CDRom) {
		
		if("PC".equalsIgnoreCase(type)) {
			return new PC(Ram,HDD,CDRom);
		}
		else if("Server".equalsIgnoreCase(type)) {
			return new Server(Ram,HDD,CDRom);
		}
		return null;
		
	}
	

}

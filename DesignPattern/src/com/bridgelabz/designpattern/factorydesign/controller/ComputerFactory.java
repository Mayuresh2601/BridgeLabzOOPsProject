package com.bridgelabz.designpattern.factorydesign.controller;

import com.bridgelabz.designpattern.factorydesign.computers.Computer;
import com.bridgelabz.designpattern.factorydesign.computers.PC;
import com.bridgelabz.designpattern.factorydesign.computers.Server;

public class ComputerFactory {
	
	/**
	 * @param type
	 * @param Ram
	 * @param HDD
	 * @param CDRom
	 * @return Computer Object Containing Details of Ram, HDD and CDRom
	 */
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

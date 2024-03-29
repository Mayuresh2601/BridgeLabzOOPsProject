/******************************************************************************
*  
*  Purpose: To Perform Reflection in Singleton Design Pattern
*  @author  Mayuresh Sunil Sonar
*
******************************************************************************/
package com.bridgelabz.designpattern.singletondesign;

import java.lang.reflect.Constructor;

public class ReflectionSingleton {
	
	public static void main(String[] args) {
        EagerInitialization instanceOne = EagerInitialization.getInstance();
        EagerInitialization instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
               
            	//Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitialization) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("HashCode1: "+instanceOne.hashCode());
        System.out.println("HashCode2: "+instanceTwo.hashCode());
    }
}

/**
 * 
 */
package com.personal;

import java.util.List;

/**
 * @author Nico
 *
 */
public class Main {


	
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		Parse x = new Parse();
		Parse y = new Parse(3, 5);
		
		List < String > linii = x.getLines();
//		for (int i = 0; i<linii.size(); i++){
//			
//			System.out.println(linii.get(i));
//		}
		for (String linie: linii){
			System.out.println(linie);
		}
		System.out.println(x.getLines());
		System.out.println(linii);
	}

}

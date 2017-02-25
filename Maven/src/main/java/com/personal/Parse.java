package com.personal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parse {
	
	private int linii;
	private int coloane;
	
	public Parse(int linii, int coloane){
		this.linii = linii;
		this.coloane = coloane;
		
	}
	
	public Parse(){}
	
	public List < String > getLines(){
		
		List < String > toate= new ArrayList<>();
	
	File file = new File("E:\\AIA\\JAVA\\Maven\\src\\main\\java\\com\\personal\\Texte.txt");
	Scanner input = null;
	try {
		input = new Scanner(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	while(input.hasNext()) {
	    String nextToken = input.next();
	    toate.add(nextToken);
	    //or to process line by line
	   // String nextLine = input.nextLine();  
	}
	
	input.close();
	return toate;
	}
	
}

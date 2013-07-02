package com.conject.bowlingscorecalculator;

import java.text.ParseException;

import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatter;

public class InputFormatter extends DefaultFormatter {
  public InputFormatter() {
    super();
  }
  
  public String valueToString(Object object) throws ParseException {
	    return super.valueToString(object);
	  }
  
  public Object stringToValue(String string) throws ParseException {
	    try {
	    
	    if(string == "X" || string == "/"){
	    	return new Integer(10);
	    }
	    else{
	      int value = Integer.parseInt(string);
	      if (value >= 0 && value < 10) {
	        return new Integer(value);
	      }  
	      else {  	  
	    	  return new Integer(0);
	      }
	    }
	    }catch (Exception e) {
	    	return "invalid";
	    }
	  }
}


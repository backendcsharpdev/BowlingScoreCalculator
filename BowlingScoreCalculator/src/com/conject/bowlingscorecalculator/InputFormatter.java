package com.conject.bowlingscorecalculator;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class InputFormatter extends DocumentFilter {
	private int charLimit;
	
	public InputFormatter(int charLimit) {
		this.setCharLimit(charLimit);
  }

	public int getCharLimit() {
		return charLimit;
	}

	public void setCharLimit(int charLimit) {
		this.charLimit = charLimit;
	}
	
	 @Override  
     public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException  
     {
         if(fb.getDocument().getLength()+string.length()>this.getCharLimit())
         {
             return;
         }

         fb.insertString(offset, string, attr);

     }  

  
/*  public String valueToString(Object object) throws ParseException {
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
	    //}
	    }catch (Exception e) {
	    	return "invalid";
	    }
	  }*/
}


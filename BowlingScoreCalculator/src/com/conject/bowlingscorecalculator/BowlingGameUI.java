package com.conject.bowlingscorecalculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.PlainDocument;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.NumberFormat;
import java.text.ParseException;

public class BowlingGameUI extends JFrame implements PropertyChangeListener{

	private JPanel contentPane;
	private JFormattedTextField frame1_Roll1_TextField;
	private JFormattedTextField frame1_Roll2_TextField;
	private JFormattedTextField frame2_Roll1_TextField;
	private JFormattedTextField frame2_Roll2_TextField;
	private JFormattedTextField frame3_Roll2_TextField;
	private JFormattedTextField frame3_Roll1_TextField;
	private JFormattedTextField frame4_Roll2_TextField;
	private JFormattedTextField frame4_Roll1_TextField;
	private JFormattedTextField frame5_Roll2_TextField;
	private JFormattedTextField frame5_Roll1_TextField;
	private JFormattedTextField frame6_Roll2_TextField;
	private JFormattedTextField frame6_Roll1_TextField;
	private JFormattedTextField frame7_Roll2_TextField;
	private JFormattedTextField frame7_Roll1_TextField;
	private JFormattedTextField frame8_Roll2_TextField;
	private JFormattedTextField frame8_Roll1_TextField;
	private JFormattedTextField frame9_Roll2_TextField;
	private JFormattedTextField frame9_Roll1_TextField;
	private JFormattedTextField frame10_Roll2_TextField;
	private JFormattedTextField frame10_Roll1_TextField;
	private JFormattedTextField frame10_Roll3_TextField;
	private JFormattedTextField frame1_Score_TextField;
	private JFormattedTextField frame2_Score_TextField;
	private JFormattedTextField frame3_Score_TextField;
	private JFormattedTextField frame4_Score_TextField;
	private JFormattedTextField frame5_Score_TextField;
	private JFormattedTextField frame6_Score_TextField;
	private JFormattedTextField frame7_Score_TextField;
	private JFormattedTextField frame8_Score_TextField;
	private JFormattedTextField frame9_Score_TextField;
	private JFormattedTextField frame10_Score_TextField;

	private int frame1_Roll1_Score = 0;
	private int frame1_Roll2_Score = 0;
	private int frame2_Roll1_Score = 0;
	private int frame2_Roll2_Score = 0;
	private int frame3_Roll1_Score = 0;
	private int frame3_Roll2_Score = 0;
	private int frame4_Roll1_Score = 0;
	private int frame4_Roll2_Score = 0;
	private int frame5_Roll1_Score = 0;
	private int frame5_Roll2_Score = 0;
	private int frame6_Roll1_Score = 0;
	private int frame6_Roll2_Score = 0;
	private int frame7_Roll1_Score = 0;
	private int frame7_Roll2_Score = 0;
	private int frame8_Roll1_Score = 0;
	private int frame8_Roll2_Score = 0;
	private int frame9_Roll1_Score = 0;
	private int frame9_Roll2_Score = 0;
	private int frame10_Roll1_Score = 0;
	private int frame10_Roll2_Score = 0;
	private int frame10_Roll3_Score = 0;
	
	private int frame1_Score = 0;
	private int frame2_Score = 0;
	private int frame3_Score = 0;
	private int frame4_Score = 0;
	private int frame5_Score = 0;
	private int frame6_Score = 0;
	private int frame7_Score = 0;
	private int frame8_Score = 0;
	private int frame9_Score = 0;
	private int frame10_Score = 0;
	

	
	private MaskFormatter roll1_MaskFormater;
	private MaskFormatter roll2_MaskFormater;
	private MaskFormatter frame10_MaskFormater;
	private DefaultFormatterFactory roll1_DefaultFormatterFactory; 
	private DefaultFormatterFactory roll2_DefaultFormatterFactory; 
	private DefaultFormatterFactory frame10_DefaultFormatterFactory;


	/**
	 * Create the frame.
	 */
	public BowlingGameUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUpFormats();
		setBounds(100, 100, 633, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(153, 51, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setBounds(12, 13, 220, 30);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblBowlingScoreCalculator = new JLabel("Bowling Score Calculator");
		lblBowlingScoreCalculator.setForeground(new Color(255, 255, 255));
		lblBowlingScoreCalculator.setBounds(0, 0, 219, 30);
		panel.add(lblBowlingScoreCalculator);
		lblBowlingScoreCalculator.setBackground(Color.WHITE);
		lblBowlingScoreCalculator.setFont(new Font("MS Reference Sans Serif", Font.BOLD | Font.ITALIC, 15));
		
		final JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 79, 411, 115);
		contentPane.add(panel_1);
		
		frame1_Roll1_TextField = new JFormattedTextField();
		frame1_Roll1_TextField.setToolTipText("0...9 or X");	
		frame1_Roll1_TextField.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame1_Roll1_TextField.addPropertyChangeListener("value",this);
		frame1_Roll1_TextField.setBounds(20, 0, 33, 22);
		frame1_Roll1_TextField.setColumns(10);
			
		frame1_Roll2_TextField = new JFormattedTextField();
		frame1_Roll2_TextField.setToolTipText("0...9 or /");	
		frame1_Roll2_TextField.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame1_Roll2_TextField.setBounds(53, 0, 33, 22);
		frame1_Roll2_TextField.setColumns(10);
		frame1_Roll2_TextField.addPropertyChangeListener("value",this);
		
		panel_1.setLayout(null);
		panel_1.add(frame1_Roll1_TextField);
		panel_1.add(frame1_Roll2_TextField);
		
		frame2_Roll1_TextField = new JFormattedTextField();
		frame2_Roll1_TextField.setToolTipText("0...9 or X");	
		frame2_Roll1_TextField.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame2_Roll1_TextField.addPropertyChangeListener("value",this);
		frame2_Roll1_TextField.setBounds(98, 0, 33, 22);
		frame2_Roll1_TextField.setColumns(10);
		
		frame2_Roll2_TextField = new JFormattedTextField();
		frame2_Roll2_TextField.setToolTipText("0...9 or /");	
		frame2_Roll2_TextField.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame2_Roll2_TextField.addPropertyChangeListener("value",this);
		frame2_Roll2_TextField.setBounds(131, 0, 33, 22);
		frame2_Roll2_TextField.setColumns(10);
		
		panel_1.add(frame2_Roll1_TextField);
		panel_1.add(frame2_Roll2_TextField);
		
		frame3_Roll1_TextField = new JFormattedTextField();
		frame3_Roll1_TextField.setToolTipText("0...9 or X");	
		frame3_Roll1_TextField.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame3_Roll1_TextField.addPropertyChangeListener("value",this);
		frame3_Roll1_TextField.setBounds(176, 0, 33, 22);
		frame3_Roll1_TextField.setColumns(10);
		
		
		frame3_Roll2_TextField = new JFormattedTextField();
		frame3_Roll2_TextField.setToolTipText("0...9 or /");	
		frame3_Roll2_TextField.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame3_Roll2_TextField.addPropertyChangeListener("value",this);
		frame3_Roll2_TextField.setBounds(209, 0, 33, 22);
		frame3_Roll2_TextField.setColumns(10);
		
		panel_1.add(frame3_Roll1_TextField);
		panel_1.add(frame3_Roll2_TextField);
		
		frame4_Roll1_TextField = new JFormattedTextField();
		frame4_Roll1_TextField.setToolTipText("0...9 or X");	
		frame4_Roll1_TextField.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame4_Roll1_TextField.addPropertyChangeListener("value",this);
		frame4_Roll1_TextField.setBounds(254, 0, 33, 22);
		frame4_Roll1_TextField.setColumns(10);
		
		
		frame4_Roll2_TextField = new JFormattedTextField();
		frame4_Roll2_TextField.setToolTipText("0...9 or /");	
		frame4_Roll2_TextField.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame4_Roll2_TextField.addPropertyChangeListener("value",this);
		frame4_Roll2_TextField.setBounds(287, 0, 33, 22);
		frame4_Roll2_TextField.setColumns(10);
		
		panel_1.add(frame4_Roll1_TextField);
		panel_1.add(frame4_Roll2_TextField);
		
		frame5_Roll1_TextField = new JFormattedTextField();
		frame5_Roll1_TextField.setToolTipText("0...9 or X");	
		frame5_Roll1_TextField.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame5_Roll1_TextField.addPropertyChangeListener("value",this);
		frame5_Roll1_TextField.setBounds(332, 0, 33, 22);
		frame5_Roll1_TextField.setColumns(10);
		
		
		frame5_Roll2_TextField = new JFormattedTextField();
		frame5_Roll2_TextField.setToolTipText("0...9 or /");	
		frame5_Roll2_TextField.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame5_Roll2_TextField.addPropertyChangeListener("value",this);
		frame5_Roll2_TextField.setBounds(365, 0, 33, 22);
		frame5_Roll2_TextField.setColumns(10);
		
		panel_1.add(frame5_Roll1_TextField);
		panel_1.add(frame5_Roll2_TextField);
		
		frame6_Roll1_TextField = new JFormattedTextField();
		frame6_Roll1_TextField.setToolTipText("0...9 or X");	
		frame6_Roll1_TextField.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame6_Roll1_TextField.addPropertyChangeListener("value",this);
		frame6_Roll1_TextField.setBounds(0, 57, 33, 22);
		frame6_Roll1_TextField.setColumns(10);
		panel_1.add(frame6_Roll1_TextField);
		
		frame6_Roll2_TextField = new JFormattedTextField();
		frame6_Roll2_TextField.setToolTipText("0...9 or /");	
		frame6_Roll2_TextField.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame6_Roll2_TextField.addPropertyChangeListener("value",this);
		frame6_Roll2_TextField.setBounds(33, 57, 33, 22);
		frame6_Roll2_TextField.setColumns(10);
		panel_1.add(frame6_Roll2_TextField);
		
		frame7_Roll1_TextField = new JFormattedTextField();
		frame7_Roll1_TextField.setToolTipText("0...9 or X");	
		frame7_Roll1_TextField.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame7_Roll1_TextField.addPropertyChangeListener("value",this);
		frame7_Roll1_TextField.setBounds(78, 57, 33, 22);
		frame7_Roll1_TextField.setColumns(10);
		panel_1.add(frame7_Roll1_TextField);
		
		frame7_Roll2_TextField = new JFormattedTextField();
		frame7_Roll2_TextField.setToolTipText("0...9 or /");	
		frame7_Roll2_TextField.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame7_Roll2_TextField.addPropertyChangeListener("value",this);
		frame7_Roll2_TextField.setBounds(111, 57, 33, 22);
		frame7_Roll2_TextField.setColumns(10);
		panel_1.add(frame7_Roll2_TextField);
		
		frame8_Roll1_TextField = new JFormattedTextField();
		frame8_Roll1_TextField.setToolTipText("0...9 or X");	
		frame8_Roll1_TextField.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame8_Roll1_TextField.addPropertyChangeListener("value",this);
		frame8_Roll1_TextField.setBounds(156, 57, 33, 22);
		frame8_Roll1_TextField.setColumns(10);
		panel_1.add(frame8_Roll1_TextField);
		
		frame8_Roll2_TextField = new JFormattedTextField();
		frame8_Roll2_TextField.setToolTipText("0...9 or /");	
		frame8_Roll2_TextField.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame8_Roll2_TextField.addPropertyChangeListener("value",this);
		frame8_Roll2_TextField.setBounds(189, 57, 33, 22);
		frame8_Roll2_TextField.setColumns(10);
		panel_1.add(frame8_Roll2_TextField);
		
		frame9_Roll1_TextField = new JFormattedTextField();
		frame9_Roll1_TextField.setToolTipText("0...9 or X");	
		frame9_Roll1_TextField.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame9_Roll1_TextField.addPropertyChangeListener("value",this);
		frame9_Roll1_TextField.setBounds(234, 57, 33, 22);
		frame9_Roll1_TextField.setColumns(10);
		panel_1.add(frame9_Roll1_TextField);
		
		frame9_Roll2_TextField = new JFormattedTextField();
		frame9_Roll2_TextField.setToolTipText("0...9 or /");	
		frame9_Roll2_TextField.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame9_Roll2_TextField.addPropertyChangeListener("value",this);
		frame9_Roll2_TextField.setBounds(267, 57, 33, 22);
		frame9_Roll2_TextField.setColumns(10);
		panel_1.add(frame9_Roll2_TextField);
		
		frame10_Roll1_TextField = new JFormattedTextField();
		frame10_Roll1_TextField.setToolTipText("0...9 or X");	
		frame10_Roll1_TextField.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame10_Roll1_TextField.addPropertyChangeListener("value",this);
		frame10_Roll1_TextField.setBounds(312, 57, 33, 22);
		frame10_Roll1_TextField.setColumns(10);
		panel_1.add(frame10_Roll1_TextField);
		
		frame10_Roll2_TextField = new JFormattedTextField();
		frame10_Roll2_TextField.setToolTipText("0...9 or X or /");	
		frame10_Roll2_TextField.setFormatterFactory(frame10_DefaultFormatterFactory);
		frame10_Roll2_TextField.addPropertyChangeListener("value",this);
		frame10_Roll2_TextField.setBounds(345, 57, 33, 22);
		frame10_Roll2_TextField.setColumns(10);
		panel_1.add(frame10_Roll2_TextField);
		
		frame10_Roll3_TextField = new JFormattedTextField();
		frame10_Roll3_TextField.setToolTipText("0...9 or X or /");	
		//frame10_Roll3_TextField.setFormatterFactory(frame10_DefaultFormatterFactory);
		frame10_Roll3_TextField.addPropertyChangeListener("value",this);
		frame10_Roll3_TextField.setEditable(false);
		frame10_Roll3_TextField.setColumns(10);
		frame10_Roll3_TextField.setBounds(378, 57, 33, 22);
		panel_1.add(frame10_Roll3_TextField);
		
		frame1_Score_TextField = new JFormattedTextField();
		frame1_Score_TextField.setText("0");
		frame1_Score_TextField.setColumns(10);
		frame1_Score_TextField.setBounds(33, 22, 33, 22);
		frame1_Score_TextField.setEditable(false);
		panel_1.add(frame1_Score_TextField);
		
		frame2_Score_TextField = new JFormattedTextField();
		frame2_Score_TextField.setColumns(10);
		frame2_Score_TextField.setBounds(111, 22, 33, 22);
		frame2_Score_TextField.setEditable(false);
		panel_1.add(frame2_Score_TextField);
		
		frame3_Score_TextField = new JFormattedTextField();
		frame3_Score_TextField.setColumns(10);
		frame3_Score_TextField.setBounds(189, 22, 33, 22);
		frame3_Score_TextField.setEditable(false);
		panel_1.add(frame3_Score_TextField);
		
		frame4_Score_TextField = new JFormattedTextField();
		frame4_Score_TextField.setColumns(10);
		frame4_Score_TextField.setBounds(267, 22, 33, 22);
		frame4_Score_TextField.setEditable(false);
		panel_1.add(frame4_Score_TextField);
		
		frame5_Score_TextField = new JFormattedTextField();
		frame5_Score_TextField.setColumns(10);
		frame5_Score_TextField.setBounds(345, 22, 33, 22);
		frame5_Score_TextField.setEditable(false);
		panel_1.add(frame5_Score_TextField);
		
		frame6_Score_TextField = new JFormattedTextField();
		frame6_Score_TextField.setColumns(10);
		frame6_Score_TextField.setBounds(20, 80, 33, 22);
		frame6_Score_TextField.setEditable(false);
		panel_1.add(frame6_Score_TextField);
		
		frame7_Score_TextField = new JFormattedTextField();
		frame7_Score_TextField.setColumns(10);
		frame7_Score_TextField.setBounds(98, 80, 33, 22);
		frame7_Score_TextField.setEditable(false);
		panel_1.add(frame7_Score_TextField);
		
		frame8_Score_TextField = new JFormattedTextField();
		frame8_Score_TextField.setColumns(10);
		frame8_Score_TextField.setBounds(176, 80, 33, 22);
		frame8_Score_TextField.setEditable(false);
		panel_1.add(frame8_Score_TextField);
		
		frame9_Score_TextField = new JFormattedTextField();
		frame9_Score_TextField.setColumns(10);
		frame9_Score_TextField.setBounds(254, 80, 33, 22);
		frame9_Score_TextField.setEditable(false);
		panel_1.add(frame9_Score_TextField);
		
		frame10_Score_TextField = new JFormattedTextField();
		frame10_Score_TextField.setColumns(10);
		frame10_Score_TextField.setBounds(355, 80, 33, 22);
		frame10_Score_TextField.setEditable(false);
		panel_1.add(frame10_Score_TextField);
		
		JLabel finalscore_Label = new JLabel("Final Score is ");
		finalscore_Label.setBounds(12, 221, 155, 16);
		contentPane.add(finalscore_Label);
		

	}


	  private void setUpFormats() {
	        try{
	        	roll1_MaskFormater = new MaskFormatter("*");
	        	roll1_MaskFormater.setValidCharacters("0123456789X");
	        	roll1_MaskFormater.setValueClass(String.class);   
	        	roll1_DefaultFormatterFactory =new DefaultFormatterFactory(roll1_MaskFormater);
	        	
	        	roll2_MaskFormater = new MaskFormatter("*");
	        	roll2_MaskFormater.setValidCharacters("0123456789/");
	        	roll2_MaskFormater.setValueClass(String.class);   	
				roll2_DefaultFormatterFactory =new DefaultFormatterFactory(roll2_MaskFormater);
				
				frame10_MaskFormater = new MaskFormatter("*");
				frame10_MaskFormater.setValidCharacters("0123456789X/");
				frame10_MaskFormater.setValueClass(String.class);   	
				frame10_DefaultFormatterFactory =new DefaultFormatterFactory(frame10_MaskFormater);
	        }catch(ParseException pe){}
	  }
	  
	  public void propertyChange(PropertyChangeEvent e) {
	        Object source = e.getSource();
	        
	        //Frame 1
	        if (source == frame1_Roll1_TextField && (frame1_Roll1_TextField.getText().trim().length()>0)) {
	        	if(frame1_Roll1_TextField.getText().equals("X")){
	        		frame1_Roll1_Score = 10;
	        		frame1_Roll2_TextField.setText("0");
	        		frame1_Roll2_TextField.setEditable(false);
	        		frame1_Roll2_Score = 0;
	        	}
	        	else{
	        		frame1_Roll1_Score =Integer.parseInt(frame1_Roll1_TextField.getText());
	        		frame1_Roll2_TextField.setEditable(true);
	        	}
	        	frame1_Score = frame1_Roll1_Score + frame1_Roll2_Score;
		        frame1_Score_TextField.setText(Integer.toString(frame1_Score));
	        } else if (source == frame1_Roll2_TextField && (frame1_Roll2_TextField.getText().trim().length()>0)) {
	        	if(frame1_Roll2_TextField.getText().equals("/") ){
	        		frame1_Roll2_Score = 10;
	        	}
	        	else{
	        		frame1_Roll2_Score = Integer.parseInt(frame1_Roll2_TextField.getText());
	        	}
	        	frame1_Score = frame1_Roll1_Score + frame1_Roll2_Score;
		        frame1_Score_TextField.setText(Integer.toString(frame1_Score));
	        } 
	        
	        
	        //Frame 10
	        if (source == frame10_Roll1_TextField && (frame10_Roll1_TextField.getText().trim().length()>0)) {
	        	if(frame10_Roll1_TextField.getText().equals("X")){
	        		frame10_Roll1_Score = 10;
	        		frame10_Roll2_TextField.setFormatterFactory(roll1_DefaultFormatterFactory);
	        	}
	        	else{
	        		frame10_Roll1_Score =Integer.parseInt(frame10_Roll1_TextField.getText());
	        		if(frame10_Roll2_TextField.getText().trim().length()>0 && frame10_Roll2_TextField.getText().equals("X")){
	        			frame10_Roll2_TextField.setText("0");
	        		}
	        		frame10_Roll2_TextField.setFormatterFactory(roll2_DefaultFormatterFactory);
	        	}
	        } 
	        
	        else if (source == frame10_Roll2_TextField && (frame10_Roll2_TextField.getText().trim().length()>0)) {
	        	if(frame10_Roll2_TextField.getText().equals("/") || frame10_Roll2_TextField.getText().equals("X") ){
	        		if(frame10_Roll2_TextField.getText().equals("/")) {
	        			if(frame10_Roll1_TextField.getText().equals("X")){
	        				frame10_Roll1_TextField.setText("0");
	        		}
	        		}
	        		frame10_Roll3_TextField.setEditable(true);
	        		frame10_Roll3_TextField.setFormatterFactory(roll1_DefaultFormatterFactory);
	        		frame10_Roll2_Score = 10;
	        	
	        	}
	        	else{
	        		frame10_Roll2_Score = Integer.parseInt(frame10_Roll2_TextField.getText());
	        		frame10_Roll3_TextField.setFormatterFactory(roll2_DefaultFormatterFactory);
	        		frame10_Roll3_TextField.setEditable(false);
	        	}
	        } 
	        
	        else if (source == frame10_Roll3_TextField && (frame10_Roll3_TextField.getText().trim().length()>0)) {
	        	if(frame10_Roll3_TextField.getText().equals("/") || frame10_Roll3_TextField.getText().equals("X") ){
	        		frame10_Roll3_Score = 10; 		
	        	}
	        	else{
	        		frame10_Roll3_Score = Integer.parseInt(frame10_Roll3_TextField.getText());
	        	}
	        }
	       
	        /*frame1_Score = frame1_Roll1_Score + frame1_Roll2_Score;
	        frame1_Score_TextField.setText(Integer.toString(frame1_Score));*/
	        
	    }
	  
}


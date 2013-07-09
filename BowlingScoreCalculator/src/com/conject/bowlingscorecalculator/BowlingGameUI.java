package com.conject.bowlingscorecalculator;

import java.awt.Color;
import java.awt.Cursor;
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

import com.conject.bowlingscorecalculator.model.Frame;
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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.JButton;

public class BowlingGameUI extends JFrame implements PropertyChangeListener {

	private static JPanel contentPane;
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
	private JButton btnRestart;

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

	private Frame[] allFrames;
	private static List<Frame> frames;
	private static int gameScore;

	private MaskFormatter roll1_MaskFormater;
	private MaskFormatter roll2_MaskFormater;
	private MaskFormatter frame10_MaskFormater;
	private DefaultFormatterFactory roll1_DefaultFormatterFactory;
	private DefaultFormatterFactory roll2_DefaultFormatterFactory;
	private DefaultFormatterFactory frame10_DefaultFormatterFactory;

	public static final int MAX_FRAMES = 10;
	public static final int MIN_FRAME_SCORE = 0;
	
	public static final int MIN_ROLL_SCORE = 0;
	
	public static final int MAX_STRIKE_FRAME_SCORE = 10;
	public static final int MIN_STRIKE_FRAME_SCORE = 0;
	
	public static final int MAX_SPARE_FRAME_SCORE = 10;
	
	public static final int MIN_SCORE_INPUT_LENGTH = 0;
	public static final int MAX_FRAME_SCORE_FOR_NUMBER_INPUT = 9;
	
	private static final String STRIKE = "X";
	private static final String SPARE = "/";

	/**
	 * Create the frame.
	 */
	public BowlingGameUI() {
		frames = new ArrayList<Frame>();
		for (int i = 0; i < MAX_FRAMES; i++) {
			frames.add(new Frame(false, false, 0, 0));
		}

		allFrames = new Frame[10];
		allFrames[0] = new Frame(false, false, 0, 0);
		allFrames[1] = new Frame(false, false, 0, 0);
		allFrames[2] = new Frame(false, false, 0, 0);
		allFrames[3] = new Frame(false, false, 0, 0);
		allFrames[4] = new Frame(false, false, 0, 0);
		allFrames[5] = new Frame(false, false, 0, 0);
		allFrames[6] = new Frame(false, false, 0, 0);
		allFrames[7] = new Frame(false, false, 0, 0);
		allFrames[8] = new Frame(false, false, 0, 0);
		allFrames[9] = new Frame(false, false, 0, 0);

		gameScore = 0;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUpFormats();
		setBounds(100, 100, 633, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(
				153, 51, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelHeading = new JPanel();
		panelHeading.setBackground(new Color(128, 0, 0));
		panelHeading.setBounds(12, 13, 220, 30);
		contentPane.add(panelHeading);
		panelHeading.setLayout(null);

		JLabel lblBowlingScoreCalculator = new JLabel(
				"Bowling Score Calculator");
		lblBowlingScoreCalculator.setForeground(new Color(255, 255, 255));
		lblBowlingScoreCalculator.setBounds(0, 0, 219, 30);
		panelHeading.add(lblBowlingScoreCalculator);
		lblBowlingScoreCalculator.setBackground(Color.WHITE);
		lblBowlingScoreCalculator.setFont(new Font("MS Reference Sans Serif",
				Font.BOLD | Font.ITALIC, 15));

		final JPanel panelScoreCard = new JPanel();
		panelScoreCard.setBounds(12, 79, 411, 115);
		contentPane.add(panelScoreCard);

		frame1_Roll1_TextField = new JFormattedTextField();
		frame1_Roll1_TextField.setToolTipText("0...9 or X");
		frame1_Roll1_TextField
				.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame1_Roll1_TextField.addPropertyChangeListener("value", this);
		frame1_Roll1_TextField.setBounds(20, 0, 33, 22);
		frame1_Roll1_TextField.setColumns(10);

		frame1_Roll2_TextField = new JFormattedTextField();
		frame1_Roll2_TextField.setToolTipText("0...9 or /");
		frame1_Roll2_TextField
				.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame1_Roll2_TextField.setBounds(53, 0, 33, 22);
		frame1_Roll2_TextField.setColumns(10);
		frame1_Roll2_TextField.addPropertyChangeListener("value", this);
		frame1_Roll2_TextField.setEditable(false);

		panelScoreCard.setLayout(null);
		panelScoreCard.add(frame1_Roll1_TextField);
		panelScoreCard.add(frame1_Roll2_TextField);

		frame2_Roll1_TextField = new JFormattedTextField();
		frame2_Roll1_TextField.setToolTipText("0...9 or X");
		frame2_Roll1_TextField
				.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame2_Roll1_TextField.addPropertyChangeListener("value", this);
		frame2_Roll1_TextField.setBounds(98, 0, 33, 22);
		frame2_Roll1_TextField.setColumns(10);
		frame2_Roll1_TextField.setEditable(false);

		frame2_Roll2_TextField = new JFormattedTextField();
		frame2_Roll2_TextField.setToolTipText("0...9 or /");
		frame2_Roll2_TextField
				.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame2_Roll2_TextField.addPropertyChangeListener("value", this);
		frame2_Roll2_TextField.setBounds(131, 0, 33, 22);
		frame2_Roll2_TextField.setColumns(10);
		frame2_Roll2_TextField.setEditable(false);

		panelScoreCard.add(frame2_Roll1_TextField);
		panelScoreCard.add(frame2_Roll2_TextField);

		frame3_Roll1_TextField = new JFormattedTextField();
		frame3_Roll1_TextField.setToolTipText("0...9 or X");
		frame3_Roll1_TextField
				.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame3_Roll1_TextField.addPropertyChangeListener("value", this);
		frame3_Roll1_TextField.setBounds(176, 0, 33, 22);
		frame3_Roll1_TextField.setColumns(10);
		frame3_Roll1_TextField.setEditable(false);

		frame3_Roll2_TextField = new JFormattedTextField();
		frame3_Roll2_TextField.setToolTipText("0...9 or /");
		frame3_Roll2_TextField
				.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame3_Roll2_TextField.addPropertyChangeListener("value", this);
		frame3_Roll2_TextField.setBounds(209, 0, 33, 22);
		frame3_Roll2_TextField.setColumns(10);
		frame3_Roll2_TextField.setEditable(false);

		panelScoreCard.add(frame3_Roll1_TextField);
		panelScoreCard.add(frame3_Roll2_TextField);

		frame4_Roll1_TextField = new JFormattedTextField();
		frame4_Roll1_TextField.setToolTipText("0...9 or X");
		frame4_Roll1_TextField
				.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame4_Roll1_TextField.addPropertyChangeListener("value", this);
		frame4_Roll1_TextField.setBounds(254, 0, 33, 22);
		frame4_Roll1_TextField.setColumns(10);
		frame4_Roll1_TextField.setEditable(false);

		frame4_Roll2_TextField = new JFormattedTextField();
		frame4_Roll2_TextField.setToolTipText("0...9 or /");
		frame4_Roll2_TextField
				.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame4_Roll2_TextField.addPropertyChangeListener("value", this);
		frame4_Roll2_TextField.setBounds(287, 0, 33, 22);
		frame4_Roll2_TextField.setColumns(10);
		frame4_Roll2_TextField.setEditable(false);

		panelScoreCard.add(frame4_Roll1_TextField);
		panelScoreCard.add(frame4_Roll2_TextField);

		frame5_Roll1_TextField = new JFormattedTextField();
		frame5_Roll1_TextField.setToolTipText("0...9 or X");
		frame5_Roll1_TextField
				.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame5_Roll1_TextField.addPropertyChangeListener("value", this);
		frame5_Roll1_TextField.setBounds(332, 0, 33, 22);
		frame5_Roll1_TextField.setColumns(10);
		frame5_Roll1_TextField.setEditable(false);

		frame5_Roll2_TextField = new JFormattedTextField();
		frame5_Roll2_TextField.setToolTipText("0...9 or /");
		frame5_Roll2_TextField
				.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame5_Roll2_TextField.addPropertyChangeListener("value", this);
		frame5_Roll2_TextField.setBounds(365, 0, 33, 22);
		frame5_Roll2_TextField.setColumns(10);
		frame5_Roll2_TextField.setEditable(false);

		panelScoreCard.add(frame5_Roll1_TextField);
		panelScoreCard.add(frame5_Roll2_TextField);

		frame6_Roll1_TextField = new JFormattedTextField();
		frame6_Roll1_TextField.setToolTipText("0...9 or X");
		frame6_Roll1_TextField
				.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame6_Roll1_TextField.addPropertyChangeListener("value", this);
		frame6_Roll1_TextField.setBounds(0, 57, 33, 22);
		frame6_Roll1_TextField.setColumns(10);
		frame6_Roll1_TextField.setEditable(false);
		panelScoreCard.add(frame6_Roll1_TextField);

		frame6_Roll2_TextField = new JFormattedTextField();
		frame6_Roll2_TextField.setToolTipText("0...9 or /");
		frame6_Roll2_TextField
				.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame6_Roll2_TextField.addPropertyChangeListener("value", this);
		frame6_Roll2_TextField.setBounds(33, 57, 33, 22);
		frame6_Roll2_TextField.setColumns(10);
		frame6_Roll2_TextField.setEditable(false);
		panelScoreCard.add(frame6_Roll2_TextField);

		frame7_Roll1_TextField = new JFormattedTextField();
		frame7_Roll1_TextField.setToolTipText("0...9 or X");
		frame7_Roll1_TextField
				.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame7_Roll1_TextField.addPropertyChangeListener("value", this);
		frame7_Roll1_TextField.setBounds(78, 57, 33, 22);
		frame7_Roll1_TextField.setColumns(10);
		frame7_Roll1_TextField.setEditable(false);
		panelScoreCard.add(frame7_Roll1_TextField);

		frame7_Roll2_TextField = new JFormattedTextField();
		frame7_Roll2_TextField.setToolTipText("0...9 or /");
		frame7_Roll2_TextField
				.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame7_Roll2_TextField.addPropertyChangeListener("value", this);
		frame7_Roll2_TextField.setBounds(111, 57, 33, 22);
		frame7_Roll2_TextField.setColumns(10);
		frame7_Roll2_TextField.setEditable(false);
		panelScoreCard.add(frame7_Roll2_TextField);

		frame8_Roll1_TextField = new JFormattedTextField();
		frame8_Roll1_TextField.setToolTipText("0...9 or X");
		frame8_Roll1_TextField
				.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame8_Roll1_TextField.addPropertyChangeListener("value", this);
		frame8_Roll1_TextField.setBounds(156, 57, 33, 22);
		frame8_Roll1_TextField.setColumns(10);
		frame8_Roll1_TextField.setEditable(false);
		panelScoreCard.add(frame8_Roll1_TextField);

		frame8_Roll2_TextField = new JFormattedTextField();
		frame8_Roll2_TextField.setToolTipText("0...9 or /");
		frame8_Roll2_TextField
				.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame8_Roll2_TextField.addPropertyChangeListener("value", this);
		frame8_Roll2_TextField.setBounds(189, 57, 33, 22);
		frame8_Roll2_TextField.setColumns(10);
		frame8_Roll2_TextField.setEditable(false);
		panelScoreCard.add(frame8_Roll2_TextField);

		frame9_Roll1_TextField = new JFormattedTextField();
		frame9_Roll1_TextField.setToolTipText("0...9 or X");
		frame9_Roll1_TextField
				.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame9_Roll1_TextField.addPropertyChangeListener("value", this);
		frame9_Roll1_TextField.setBounds(234, 57, 33, 22);
		frame9_Roll1_TextField.setColumns(10);
		frame9_Roll1_TextField.setEditable(false);
		panelScoreCard.add(frame9_Roll1_TextField);

		frame9_Roll2_TextField = new JFormattedTextField();
		frame9_Roll2_TextField.setToolTipText("0...9 or /");
		frame9_Roll2_TextField
				.setFormatterFactory(roll2_DefaultFormatterFactory);
		frame9_Roll2_TextField.addPropertyChangeListener("value", this);
		frame9_Roll2_TextField.setBounds(267, 57, 33, 22);
		frame9_Roll2_TextField.setColumns(10);
		frame9_Roll2_TextField.setEditable(false);
		panelScoreCard.add(frame9_Roll2_TextField);

		frame10_Roll1_TextField = new JFormattedTextField();
		frame10_Roll1_TextField.setToolTipText("0...9 or X");
		frame10_Roll1_TextField
				.setFormatterFactory(roll1_DefaultFormatterFactory);
		frame10_Roll1_TextField.addPropertyChangeListener("value", this);
		frame10_Roll1_TextField.setBounds(312, 57, 33, 22);
		frame10_Roll1_TextField.setColumns(10);
		frame10_Roll1_TextField.setEditable(false);
		panelScoreCard.add(frame10_Roll1_TextField);

		frame10_Roll2_TextField = new JFormattedTextField();
		frame10_Roll2_TextField.setToolTipText("0...9 or X or /");
		frame10_Roll2_TextField
				.setFormatterFactory(frame10_DefaultFormatterFactory);
		frame10_Roll2_TextField.addPropertyChangeListener("value", this);
		frame10_Roll2_TextField.setBounds(345, 57, 33, 22);
		frame10_Roll2_TextField.setColumns(10);
		frame10_Roll2_TextField.setEditable(false);
		panelScoreCard.add(frame10_Roll2_TextField);

		frame10_Roll3_TextField = new JFormattedTextField();
		frame10_Roll3_TextField.setToolTipText("0...9 or X or /");
		// frame10_Roll3_TextField.setFormatterFactory(frame10_DefaultFormatterFactory);
		frame10_Roll3_TextField.addPropertyChangeListener("value", this);
		frame10_Roll3_TextField.setEditable(false);
		frame10_Roll3_TextField.setColumns(10);
		frame10_Roll3_TextField.setBounds(378, 57, 33, 22);
		panelScoreCard.add(frame10_Roll3_TextField);

		frame1_Score_TextField = new JFormattedTextField();
		frame1_Score_TextField.setColumns(10);
		frame1_Score_TextField.setBounds(33, 22, 33, 22);
		frame1_Score_TextField.setEditable(false);
		panelScoreCard.add(frame1_Score_TextField);

		frame2_Score_TextField = new JFormattedTextField();
		frame2_Score_TextField.setColumns(10);
		frame2_Score_TextField.setBounds(111, 22, 33, 22);
		frame2_Score_TextField.setEditable(false);
		panelScoreCard.add(frame2_Score_TextField);

		frame3_Score_TextField = new JFormattedTextField();
		frame3_Score_TextField.setColumns(10);
		frame3_Score_TextField.setBounds(189, 22, 33, 22);
		frame3_Score_TextField.setEditable(false);
		panelScoreCard.add(frame3_Score_TextField);

		frame4_Score_TextField = new JFormattedTextField();
		frame4_Score_TextField.setColumns(10);
		frame4_Score_TextField.setBounds(267, 22, 33, 22);
		frame4_Score_TextField.setEditable(false);
		panelScoreCard.add(frame4_Score_TextField);

		frame5_Score_TextField = new JFormattedTextField();
		frame5_Score_TextField.setColumns(10);
		frame5_Score_TextField.setBounds(345, 22, 33, 22);
		frame5_Score_TextField.setEditable(false);
		panelScoreCard.add(frame5_Score_TextField);

		frame6_Score_TextField = new JFormattedTextField();
		frame6_Score_TextField.setColumns(10);
		frame6_Score_TextField.setBounds(20, 80, 33, 22);
		frame6_Score_TextField.setEditable(false);
		panelScoreCard.add(frame6_Score_TextField);

		frame7_Score_TextField = new JFormattedTextField();
		frame7_Score_TextField.setColumns(10);
		frame7_Score_TextField.setBounds(98, 80, 33, 22);
		frame7_Score_TextField.setEditable(false);
		panelScoreCard.add(frame7_Score_TextField);

		frame8_Score_TextField = new JFormattedTextField();
		frame8_Score_TextField.setColumns(10);
		frame8_Score_TextField.setBounds(176, 80, 33, 22);
		frame8_Score_TextField.setEditable(false);
		panelScoreCard.add(frame8_Score_TextField);

		frame9_Score_TextField = new JFormattedTextField();
		frame9_Score_TextField.setColumns(10);
		frame9_Score_TextField.setBounds(254, 80, 33, 22);
		frame9_Score_TextField.setEditable(false);
		panelScoreCard.add(frame9_Score_TextField);

		frame10_Score_TextField = new JFormattedTextField();
		frame10_Score_TextField.setColumns(10);
		frame10_Score_TextField.setBounds(355, 80, 33, 22);
		frame10_Score_TextField.setEditable(false);
		panelScoreCard.add(frame10_Score_TextField);

		JLabel finalscore_Label = new JLabel("Final Score is ");
		finalscore_Label.setBounds(12, 221, 155, 16);
		contentPane.add(finalscore_Label);

		btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnRestart) {
					BowlingGameUI.this.dispose();
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								BowlingGameUI frame = new BowlingGameUI();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
			}
		});
		btnRestart.setBounds(334, 13, 89, 23);
		contentPane.add(btnRestart);

	}

	private void setUpFormats() {
		try {
			roll1_MaskFormater = new MaskFormatter("*");
			roll1_MaskFormater.setValidCharacters("0123456789X");
			roll1_MaskFormater.setValueClass(String.class);
			roll1_DefaultFormatterFactory = new DefaultFormatterFactory(
					roll1_MaskFormater);

			roll2_MaskFormater = new MaskFormatter("*");
			roll2_MaskFormater.setValidCharacters("0123456789/");
			roll2_MaskFormater.setValueClass(String.class);
			roll2_DefaultFormatterFactory = new DefaultFormatterFactory(
					roll2_MaskFormater);

			frame10_MaskFormater = new MaskFormatter("*");
			frame10_MaskFormater.setValidCharacters("0123456789X/");
			frame10_MaskFormater.setValueClass(String.class);
			frame10_DefaultFormatterFactory = new DefaultFormatterFactory(
					frame10_MaskFormater);
		} catch (ParseException pe) {
		}
	}

	public void propertyChange(PropertyChangeEvent e) {
		Object source = e.getSource();
		int currentFrameIndex;
		// Frame 1
		if (source == frame1_Roll1_TextField
				&& (frame1_Roll1_TextField.getText().trim().length() > MIN_SCORE_INPUT_LENGTH)) {
			currentFrameIndex = 0;
			frame1_Roll1_TextField.setEditable(false);
			frames.get(currentFrameIndex).setFrameScore(MIN_FRAME_SCORE);
			if (frame1_Roll1_TextField.getText().equals(STRIKE)) {
				frame1_Roll2_TextField.setText(Integer.toString(MIN_ROLL_SCORE));
				frame1_Roll2_TextField.setEditable(false);
				frame2_Roll1_TextField.setEditable(true);
				frames.get(currentFrameIndex).setStrike(true);
				frames.get(currentFrameIndex).setRoll1Score(MAX_STRIKE_FRAME_SCORE);
				frames.get(currentFrameIndex).setRoll2Score(MIN_STRIKE_FRAME_SCORE);
				frames.get(currentFrameIndex).setFrameScore(MAX_STRIKE_FRAME_SCORE);
			} else {
				frames.get(currentFrameIndex).setRoll1Score(
						Integer.parseInt(frame1_Roll1_TextField.getText()));
				frame1_Roll2_TextField.setEditable(true);
			}

		} else if (source == frame1_Roll2_TextField
				&& (frame1_Roll2_TextField.getText().trim().length() > MIN_SCORE_INPUT_LENGTH)) {
			currentFrameIndex = 0;
			frame1_Roll2_TextField.setEditable(false);
			frame2_Roll1_TextField.setEditable(true);
			frames.get(currentFrameIndex).setFrameScore(MIN_FRAME_SCORE);
			if (frame1_Roll2_TextField.getText().equals(SPARE)) {
				frames.get(currentFrameIndex).setSpare(true);
				frames.get(currentFrameIndex).setRoll2Score(MAX_SPARE_FRAME_SCORE);
				frames.get(currentFrameIndex).setFrameScore(MAX_SPARE_FRAME_SCORE);
			} else {
				if (((Integer.parseInt(frame1_Roll2_TextField.getText()) + frames
						.get(0).getRoll1Score()) <= MAX_FRAME_SCORE_FOR_NUMBER_INPUT)) {
					
					frames.get(currentFrameIndex).setRoll2Score(
							Integer.parseInt(frame1_Roll2_TextField.getText()));
					frames.get(currentFrameIndex).setFrameScore(
							calculateFrameScore(currentFrameIndex));
					gameScore += frames.get(currentFrameIndex).getFrameScore();

					frame1_Score_TextField.setText(Integer.toString(gameScore));
				} else if ((Integer.parseInt(frame1_Roll2_TextField.getText()) + frames
						.get(currentFrameIndex).getRoll1Score()) > MAX_FRAME_SCORE_FOR_NUMBER_INPUT) {
					if (!(frames.get(currentFrameIndex).isSpare())
							&& !(frames.get(currentFrameIndex).isStrike())) {
						frame1_Roll2_TextField.setEditable(true);
						frame2_Roll1_TextField.setEditable(false);
						frames.get(currentFrameIndex).setRoll2Score(MIN_ROLL_SCORE);
						showWrongScoreInputMessage();
					}
				}
			}
		}

		// Frame 2
		if (source == frame2_Roll1_TextField
				&& (frame2_Roll1_TextField.getText().trim().length() > MIN_SCORE_INPUT_LENGTH)) {
			currentFrameIndex = 1;
			frame2_Roll1_TextField.setEditable(false);
			frames.get(currentFrameIndex).setFrameScore(MIN_FRAME_SCORE);
			if (frame2_Roll1_TextField.getText().equals(STRIKE)) {
				frame2_Roll2_TextField.setText(Integer.toString(MIN_ROLL_SCORE));
				frame2_Roll2_TextField.setEditable(false);
				frame3_Roll1_TextField.setEditable(true);
				frames.get(currentFrameIndex).setStrike(true);
				frames.get(currentFrameIndex).setRoll1Score(MAX_STRIKE_FRAME_SCORE);
				frames.get(currentFrameIndex).setRoll2Score(MIN_STRIKE_FRAME_SCORE);
				frames.get(currentFrameIndex).setFrameScore(MAX_STRIKE_FRAME_SCORE);
				calculateFrameScoreForStrike(currentFrameIndex);
				if (frames.get(currentFrameIndex - 1).isSpare()) {
					frame1_Score_TextField.setText(Integer
							.toString(gameScore));
				}
				/*else if(frames.get(currentFrameIndex - 1).isStrike()){
					if(frames.get(currentFrameIndex - 2) != null && frames.get(currentFrameIndex - 2).isStrike()){
						frame1_Score_TextField.setText(Integer
								.toString(gameScore));
					}
				}*/
			} else {
				frames.get(currentFrameIndex).setRoll1Score(
						Integer.parseInt(frame2_Roll1_TextField.getText()));
				frame2_Roll2_TextField.setEditable(true);
			}

		} else if (source == frame2_Roll2_TextField
				&& (frame2_Roll2_TextField.getText().trim().length() > MIN_SCORE_INPUT_LENGTH)) {
			currentFrameIndex = 1;
			frame2_Roll2_TextField.setEditable(false);
			frame3_Roll1_TextField.setEditable(true);
			frames.get(currentFrameIndex).setFrameScore(MIN_FRAME_SCORE);
			if (frame2_Roll2_TextField.getText().equals(SPARE)) {
				frames.get(currentFrameIndex).setSpare(true);
				frames.get(currentFrameIndex).setRoll2Score(MAX_SPARE_FRAME_SCORE);
				frames.get(currentFrameIndex).setFrameScore(MAX_SPARE_FRAME_SCORE);
				calculateFrameScoreForSpare(currentFrameIndex);
			} else {

				if (((Integer.parseInt(frame2_Roll2_TextField.getText()) + frames
						.get(currentFrameIndex).getRoll1Score()) <= MAX_FRAME_SCORE_FOR_NUMBER_INPUT)) {
					frames.get(currentFrameIndex).setRoll2Score(
							Integer.parseInt(frame2_Roll2_TextField.getText()));
					frames.get(currentFrameIndex).setFrameScore(
							calculateFrameScore(currentFrameIndex));
					if (frames.get(currentFrameIndex - 1).isSpare()
							|| frames.get(currentFrameIndex - 1).isStrike()) {
						frame1_Score_TextField.setText(Integer
								.toString(gameScore));
					}
					gameScore += frames.get(currentFrameIndex).getFrameScore();
					frame2_Score_TextField.setText(Integer.toString(gameScore));
				} else if (((Integer.parseInt(frame2_Roll2_TextField.getText()) + frames
						.get(currentFrameIndex).getRoll1Score()) > MAX_FRAME_SCORE_FOR_NUMBER_INPUT)) {
					if (!(frames.get(currentFrameIndex).isSpare())
							&& !(frames.get(currentFrameIndex).isStrike())) {
						frame2_Roll2_TextField.setEditable(true);
						frame3_Roll1_TextField.setEditable(false);
						frames.get(currentFrameIndex).setRoll2Score(MIN_ROLL_SCORE);
						showWrongScoreInputMessage();
					}
				}
			}
		}

		// Frame 3
		if (source == frame3_Roll1_TextField
				&& (frame3_Roll1_TextField.getText().trim().length() > MIN_SCORE_INPUT_LENGTH)) {
			currentFrameIndex = 2;
			frame3_Roll1_TextField.setEditable(false);
			frames.get(currentFrameIndex).setFrameScore(MIN_FRAME_SCORE);
			if (frame3_Roll1_TextField.getText().equals(STRIKE)) {
				frame3_Roll2_TextField.setText(Integer.toString(MIN_ROLL_SCORE));
				frame3_Roll2_TextField.setEditable(false);
				frame4_Roll1_TextField.setEditable(true);
				frames.get(currentFrameIndex).setStrike(true);
				frames.get(currentFrameIndex).setRoll1Score(MAX_STRIKE_FRAME_SCORE);
				frames.get(currentFrameIndex).setRoll2Score(MIN_STRIKE_FRAME_SCORE);
				frames.get(currentFrameIndex).setFrameScore(MAX_STRIKE_FRAME_SCORE);
				calculateFrameScoreForStrike(currentFrameIndex);
				if (frames.get(currentFrameIndex - 1).isSpare()) {
					frame2_Score_TextField.setText(Integer
							.toString(gameScore));
				}
				else if(frames.get(currentFrameIndex - 1).isStrike()){
					if(frames.get(currentFrameIndex - 2) != null && frames.get(currentFrameIndex - 2).isStrike()){
						frame1_Score_TextField.setText(Integer
								.toString(gameScore));
					}
				}
			} else {
				frames.get(currentFrameIndex).setRoll1Score(
						Integer.parseInt(frame3_Roll1_TextField.getText()));
				frame3_Roll2_TextField.setEditable(true);
			}

		} else if (source == frame3_Roll2_TextField
				&& (frame3_Roll2_TextField.getText().trim().length() > MIN_SCORE_INPUT_LENGTH)) {
			currentFrameIndex = 2;
			frame3_Roll2_TextField.setEditable(false);
			frame4_Roll1_TextField.setEditable(true);
			frames.get(currentFrameIndex).setFrameScore(MIN_FRAME_SCORE);
			if (frame3_Roll2_TextField.getText().equals(SPARE)) {
				frames.get(currentFrameIndex).setSpare(true);
				frames.get(currentFrameIndex).setRoll2Score(MAX_SPARE_FRAME_SCORE);
				frames.get(currentFrameIndex).setFrameScore(MAX_SPARE_FRAME_SCORE);
			} else {

				if (((Integer.parseInt(frame3_Roll2_TextField.getText()) + frames
						.get(currentFrameIndex).getRoll1Score()) <= MAX_FRAME_SCORE_FOR_NUMBER_INPUT)) {
					frames.get(currentFrameIndex).setRoll2Score(
							Integer.parseInt(frame3_Roll2_TextField.getText()));
					frames.get(currentFrameIndex).setFrameScore(
							calculateFrameScore(currentFrameIndex));
					if (frames.get(currentFrameIndex - 1).isSpare()
							|| frames.get(currentFrameIndex - 1).isStrike()) {
						frame2_Score_TextField.setText(Integer
								.toString(gameScore));
					}
					gameScore += frames.get(currentFrameIndex).getFrameScore();
					frame3_Score_TextField.setText(Integer.toString(gameScore));
				} else if (((Integer.parseInt(frame3_Roll2_TextField.getText()) + frames
						.get(currentFrameIndex).getRoll1Score()) > MAX_FRAME_SCORE_FOR_NUMBER_INPUT)) {
					if (!(frames.get(currentFrameIndex).isSpare())
							&& !(frames.get(currentFrameIndex).isStrike())) {
						frame3_Roll2_TextField.setEditable(true);
						frame4_Roll1_TextField.setEditable(false);
						frames.get(currentFrameIndex).setRoll2Score(MIN_ROLL_SCORE);
						showWrongScoreInputMessage();
					}
				}
			}
		}
		// Frame 4
		// Frame 5
		// Frame 6
		// Frame 7
		// Frame 8
		// Frame 9
		
				
		// Frame 10
		if (source == frame10_Roll1_TextField
				&& (frame10_Roll1_TextField.getText().trim().length() > 0)) {
			if (frame10_Roll1_TextField.getText().equals("X")) {
				frame10_Roll1_Score = 10;
				frame10_Roll2_TextField
						.setFormatterFactory(roll1_DefaultFormatterFactory);
			} else {
				frame10_Roll1_Score = Integer.parseInt(frame10_Roll1_TextField
						.getText());
				if (frame10_Roll2_TextField.getText().trim().length() > 0
						&& frame10_Roll2_TextField.getText().equals("X")) {
					frame10_Roll2_TextField.setText("0");
				}
				frame10_Roll2_TextField
						.setFormatterFactory(roll2_DefaultFormatterFactory);
			}
		}

		else if (source == frame10_Roll2_TextField
				&& (frame10_Roll2_TextField.getText().trim().length() > 0)) {
			if (frame10_Roll2_TextField.getText().equals("/")
					|| frame10_Roll2_TextField.getText().equals("X")) {
				if (frame10_Roll2_TextField.getText().equals("/")) {
					if (frame10_Roll1_TextField.getText().equals("X")) {
						frame10_Roll1_TextField.setText("0");
					}
				}
				frame10_Roll3_TextField.setEditable(true);
				frame10_Roll3_TextField
						.setFormatterFactory(roll1_DefaultFormatterFactory);
				frame10_Roll2_Score = 10;

			} else {
				frame10_Roll2_Score = Integer.parseInt(frame10_Roll2_TextField
						.getText());
				frame10_Roll3_TextField
						.setFormatterFactory(roll2_DefaultFormatterFactory);
				frame10_Roll3_TextField.setEditable(false);
			}
		}

		else if (source == frame10_Roll3_TextField
				&& (frame10_Roll3_TextField.getText().trim().length() > 0)) {
			if (frame10_Roll3_TextField.getText().equals("/")
					|| frame10_Roll3_TextField.getText().equals("X")) {
				frame10_Roll3_Score = 10;
			} else {
				frame10_Roll3_Score = Integer.parseInt(frame10_Roll3_TextField
						.getText());
			}
		}
	}

	public Frame[] getAllFrames() {
		return allFrames;
	}

	public void setAllFrames(Frame[] allFrames) {
		this.allFrames = allFrames;
	}

	public static int calculateFrameScore(int currentFrameIndex) {
		ListIterator<Frame> listIterator = frames
				.listIterator(currentFrameIndex);
		Frame currentFrame = frames.get(currentFrameIndex);
		if (listIterator.hasPrevious()) {
			Frame previousFrame = listIterator.previous();
			if (previousFrame.isStrike()) {
				gameScore += previousFrame.getRoll1Score()
						+ currentFrame.getRoll1Score()
						+ currentFrame.getRoll2Score();
				previousFrame.setFrameScore(previousFrame.getRoll1Score()
						+ currentFrame.getRoll1Score()
						+ currentFrame.getRoll2Score());
			}
			if (previousFrame.isSpare()) {
				gameScore += previousFrame.getRoll2Score()
						+ currentFrame.getRoll1Score();
				previousFrame.setFrameScore(previousFrame.getRoll2Score()
						+ currentFrame.getRoll1Score());
			}
		}
		return (currentFrame.getRoll1Score() + currentFrame.getRoll2Score());
	}
	
	public static void calculateFrameScoreForStrike(int currentFrameIndex) {
		ListIterator<Frame> listIterator = frames
				.listIterator(currentFrameIndex);
		Frame currentFrame = frames.get(currentFrameIndex);
		if (listIterator.hasPrevious()) {
			Frame previousFrame = listIterator.previous();
			if (previousFrame.isStrike()) {
				if (listIterator.hasPrevious()) {
					Frame previousOfPreviousFrame = listIterator.previous();
					if (previousOfPreviousFrame.isStrike()) {
						gameScore += previousOfPreviousFrame.getRoll1Score()+ previousFrame.getRoll1Score() + currentFrame.getRoll1Score();
						previousOfPreviousFrame.setFrameScore(previousOfPreviousFrame.getRoll1Score()+ previousFrame.getRoll1Score() + currentFrame.getRoll1Score());
					}
				}
			}
			else if(previousFrame.isSpare()){
				if (listIterator.hasPrevious()) {
						Frame previousOfPreviousFrame = listIterator.previous();
						gameScore += previousOfPreviousFrame.getFrameScore()+ previousFrame.getRoll2Score() + currentFrame.getRoll1Score();
						previousOfPreviousFrame.setFrameScore(previousOfPreviousFrame.getRoll1Score()+ previousFrame.getRoll1Score() + currentFrame.getRoll1Score());
				}
				
			}
		}
		
	}
	
	public static void calculateFrameScoreForSpare(int currentFrameIndex) {
		
	}
	
	public static void showWrongScoreInputMessage() {
		JOptionPane.showMessageDialog(contentPane,
				"Please Enter Correct Value! (Maximum Frame Score can be 9)",
				"Inane error", JOptionPane.ERROR_MESSAGE);
	}
}

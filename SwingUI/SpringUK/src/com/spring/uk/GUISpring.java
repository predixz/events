package com.spring.uk;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class GUISpring extends JFrame implements ActionListener {
	String[] params = new String[3];
	JLabel l1, l2, l3, l4, l5;
	JTextField tf1, tf2, tf5;
	JButton btn1;
	JCheckBox c1, c2, c3, c4;
	JPanel fr1, fr2, pane, imgFr;

	GUISpring() {
		setSize(850, 410);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Automated Suite Execution");
		l1 = new JLabel("Chrome Extension Plugin");
		l1.setForeground(Color.blue);
		l1.setFont(new Font("Serif", Font.BOLD, 20));
		l2 = new JLabel("Event URL:");
		l3 = new JLabel("Tracking Link:");
		l4 = new JLabel("No. of Links:");
		l5 = new JLabel("Social Medias:");
		tf1 = new JTextField("");
		tf2 = new JTextField();
		tf5 = new JTextField();
		c1 = new JCheckBox("Facebook");
		c2 = new JCheckBox("Instagram");
		c3 = new JCheckBox("Twitter");
		c4 = new JCheckBox("Whatsapp");
		c1.setBackground(Color.WHITE);
		c2.setBackground(Color.WHITE);
		c3.setBackground(Color.WHITE);
		c4.setBackground(Color.WHITE);
		btn1 = new JButton("Submit");
		btn1.setBackground(Color.WHITE);
		btn1.addActionListener(this);
		l1.setBounds(10, 10, 400, 30);
		l2.setBounds(10, 70, 200, 30);
		l3.setBounds(10, 110, 200, 30);
		l4.setBounds(10, 150, 200, 30);
		tf1.setBounds(100, 70, 300, 30);
		tf2.setBounds(100, 110, 300, 30);
		tf5.setBounds(100, 150, 300, 30);
		l5.setBounds(10, 200, 300, 30);
		c1.setBounds(10, 250, 100, 30);
		c2.setBounds(110, 250, 100, 30);
		c3.setBounds(220, 250, 100, 30);
		c4.setBounds(330, 250, 100, 30);
		btn1.setBounds(300, 330, 100, 30);
		fr1 = new JPanel();
		fr1.setBackground(Color.WHITE);
		fr1.setBorder(new LineBorder(Color.black, 1));
		fr2 = new JPanel();
		fr1.setLayout(null);
		fr1.add(l1);
		fr1.add(l2);
		fr1.add(tf1);
		fr1.add(l3);
		fr1.add(tf2);
		fr1.add(l4);
		fr1.add(tf5);
		fr1.add(l5);
		fr1.add(c1);
		fr1.add(c2);
		fr1.add(c3);
		fr1.add(c4);
		fr1.add(btn1);
		pane = new JPanel(new GridLayout(1, 2));
		ImagePanel panel = new ImagePanel(new ImageIcon(getClass().getResource("/javaIcon.jpg")).getImage());
		pane.add(panel);
		pane.add(fr1);
		setContentPane(pane);
		setVisible(true);
		setResizable(false);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			@SuppressWarnings("unused")
			int x = 0;
			String s1 = tf1.getText();
			String s2 = tf2.getText();
			String s5 = tf5.getText();
			if (!s1.equals("") || !s2.equals("") || !s5.equals("")) {
				params[0] = s1;
				params[1] = s2;
				params[2] = s5;	
				String path = new File("").getAbsolutePath();
					try {
						Process p = Runtime.getRuntime().exec("java -jar "+path+"/Lib/automation.jar");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
			
//				try {
//					Login.main(params);
//				} catch (InterruptedException e2) {
//					e2.printStackTrace();
//				}
			} else {
				JOptionPane.showMessageDialog(btn1, "Please provide the mandatory inputs");
			}
		} else {
			tf1.setText("");
			tf2.setText("");
			tf5.setText("");

		}
	}

	public static void main(String args[]) {
		new GUISpring();
	}
}
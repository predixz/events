package com.spring.uk;

import javax.swing.*;
import java.awt.*;
class CreateImageBackGround {
//	public static void main(String[] args) {
//	    ImagePanel panel = new ImagePanel(
//	        new ImageIcon("resources/maxresdefault.jpg").getImage());
//
//	    JFrame frame = new JFrame();
//	    frame.getContentPane().add(panel);
//	    frame.pack();
//	    frame.setVisible(true);
//	  }
	}

	@SuppressWarnings("serial")
	class ImagePanel extends JPanel {
	  private Image img;
	  public ImagePanel(String img) {
	    this(new ImageIcon(img).getImage());
	  }

	  public ImagePanel(Image img) {
	    this.img = img;
	    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
	    setPreferredSize(size);
	    setMinimumSize(size);
	    setMaximumSize(size);
	    setSize(size);
	    setLayout(null);
	  }

	  public void paintComponent(Graphics g) {
	    g.drawImage(img, 0,0,450,410, null);
	  }

	}
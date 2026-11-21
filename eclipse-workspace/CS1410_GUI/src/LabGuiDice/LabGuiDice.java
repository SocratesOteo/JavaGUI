package LabGuiDice;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;

public class LabGuiDice extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblDiceImg = new JLabel("");
	private JButton btnRollEm = new JButton("Roll 'Em");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiDice frame = new LabGuiDice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LabGuiDice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		rollEmButton();
		lblDice();
	}
	
	
	
	
	
	
	/**
	 * Class that contains the "Roll 'Em" button
	 * with multiple parts the actionListener method, that 
	 * and an ArrayList called diceImages that holds objects of type ImageItem
	 * 
	 * 
	 * @return a ImageIcon variable of type String
	 */
	private void rollEmButton() {
		//ArrayList containing the images of each face of the dice.
		ImageIcon dieOne = new ImageIcon(LabGuiDice.class.getResource("/Images/die-1.png"));
	    ImageIcon dieTwo = new ImageIcon(LabGuiDice.class.getResource("/Images/die-2.png"));
	    ImageIcon dieThree = new ImageIcon(LabGuiDice.class.getResource("/Images/die-3.png"));
	    ImageIcon dieFour = new ImageIcon(LabGuiDice.class.getResource("/Images/die-4.png"));
	    ImageIcon dieFive = new ImageIcon(LabGuiDice.class.getResource("/Images/die-5.png"));
	    ImageIcon dieSix = new ImageIcon(LabGuiDice.class.getResource("/Images/die-6.png"));


	    ArrayList<ImageItem> diceImages = new ArrayList<ImageItem>();
	    diceImages.add(new ImageItem("One", dieOne, 1));
	    diceImages.add(new ImageItem("Two", dieTwo, 2));
	    diceImages.add(new ImageItem("Three", dieThree, 3));
	    diceImages.add(new ImageItem("Four", dieFour, 4));
	    diceImages.add(new ImageItem("Five", dieFive, 5));
	    diceImages.add(new ImageItem("Six", dieSix, 6));
		
		
		
		btnRollEm.addActionListener(new ActionListener() {
			Random r = new Random();
			int previousIndex = -1;
			 
			public void actionPerformed(ActionEvent e) {
				if (diceImages.size() < 2) {
			        return;
			    }

			    int randomIndex = r.nextInt(diceImages.size());

			    // Keep re-rolling ONLY until randomIndex is different from previousIndex
			    while (randomIndex == previousIndex) {
			        randomIndex = r.nextInt(diceImages.size());
			    }

			    previousIndex = randomIndex;
			    ImageItem current = diceImages.get(randomIndex);
			    lblDiceImg.setIcon(current.getIcon());
			    //System.out.print(current.getImgName());
			    
				
				
				// end of action listener
			}
		});
		btnRollEm.setAlignmentY(Component.TOP_ALIGNMENT);
		btnRollEm.setBorderPainted(false);
		btnRollEm.setOpaque(true);
		btnRollEm.setBackground(Color.BLACK);
		btnRollEm.setFont(new Font("PT Serif", Font.PLAIN, 33));
		btnRollEm.setForeground(Color.RED);
		btnRollEm.setMargin(new Insets(0, 0, 0, 0));
		contentPane.add(btnRollEm, BorderLayout.SOUTH);
		
		
		
	}
	
	/**
	 * Method of the Label object
	 * 
	 */
	private void lblDice() {
		
		lblDiceImg.setOpaque(true);
		lblDiceImg.setBackground(Color.WHITE);
		lblDiceImg.setIcon(new ImageIcon(LabGuiDice.class.getResource("/Images/die-1.png")));
		lblDiceImg.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblDiceImg, BorderLayout.CENTER);
	}
	
	
	/**
	 * Class ImageItem that creates a new Type
	 * creates an object that contains
	 * three variables for the name of the icon for presentation,
	 * the icon filename address, 
	 * and index number to track the number as an integer.
	 * 
	 * @param imgName of type String
	 * @param icon of type ImageIcon
	 * @param index of type integer.
	 */
	public static class ImageItem {
		private String imgName;
		private ImageIcon icon;
		private int index;
		
		
		public ImageItem(String imgName, ImageIcon icon, int index) {
			super();
			this.imgName = imgName;
			this.icon = icon;
			this.index = index;
		}
		
		public String getImgName() {
			return this.imgName;
		}
	
		public ImageIcon getIcon() {
			return this.icon;
		}
		
		
		public int getIndex() {
			return this.index;
		}
	
	}
		
	}	
	
	
	
	
	
	
	
	
	
		


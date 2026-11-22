package counter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;

public class RedCounter extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel mainPanel = new JPanel();
	private JLabel lblRedCntr = new JLabel("Red Counter: 00");
	private int count = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RedCounter frame = new RedCounter();
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
	public RedCounter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel mainPanel = main();
		
		redCounter(mainPanel);
		
		JButton btnClickMe = clickMe();
		mainPanel.add(btnClickMe);
		
		name();

	}
	
	/**
	 * Name/Title Label
	 */
	private void name() {
		JLabel lblName = new JLabel("Samuel's GUI");
		lblName.setBorder(new EmptyBorder(15, 0, 15, 0));
		lblName.setFont(new Font("Chalkboard", Font.PLAIN, 15));
		lblName.setOpaque(true);
		lblName.setBackground(new Color(220, 220, 220));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblName, BorderLayout.SOUTH);
	}

	/**
	 * Main Click Me Button
	 * @return
	 */
	private JButton clickMe() {
		JButton btnClickMe = new JButton("Click Me");
		Color green = Color.GREEN;
		Color blue = Color.BLUE;
		Color red = Color.RED;
		Color orange = Color.ORANGE;
		Color magenta = Color.MAGENTA;
		
		ArrayList<Color> ButtonColors = new ArrayList<>();
		ButtonColors.add(green);
		ButtonColors.add(blue);
		ButtonColors.add(red);
		ButtonColors.add(orange);
		ButtonColors.add(magenta);
		
		
		btnClickMe.addActionListener(new ActionListener() {
			Random r = new Random();
			int previousIndex = -1;
			public void actionPerformed(ActionEvent e) {
				 //check to see that the array has more than one color
				if (ButtonColors.size() < 2) {
					return;
				}
				
				int randomIndex = r.nextInt(ButtonColors.size());
				 while (randomIndex == previousIndex) {
				        randomIndex = r.nextInt(ButtonColors.size());
				    }
				 
		        // update lblRedCntr and colors
				 if (count < 9) {
					 previousIndex = randomIndex;
					 Color current = ButtonColors.get(randomIndex);
					 btnClickMe.setBackground(current);
					 if (current.equals(Color.RED)) {
						 count ++;
						 lblRedCntr.setText("Red Counter: 0" + count);
					 	}
					 
				    }	else if (count >= 9) {
		        		
		        		//lblRedCntr.setText("Red Counter: " + count);
		        		previousIndex = randomIndex;
		        		Color current = ButtonColors.get(randomIndex);
		        		btnClickMe.setBackground(current);
		        		if (current.equals(Color.RED)) {
		        			count ++;
		        			lblRedCntr.setText("Red Counter: " + count);
		        			}		
		        		}
			}
		});
		
		btnClickMe.setForeground(Color.WHITE);
		btnClickMe.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnClickMe.setBorderPainted(false);
		btnClickMe.setOpaque(true);
		btnClickMe.setBackground(Color.RED);
		return btnClickMe;
	}

	/**
	 * Main panel that holds the 
	 * {lblRedCntr} and {btnClickMe}
	 * 
	 * @param mainPanel
	 */
	private void redCounter(JPanel mainPanel) {
		
		lblRedCntr.setFont(new Font("Monospaced", Font.PLAIN, 21));
		lblRedCntr.setBackground(Color.LIGHT_GRAY);
		lblRedCntr.setOpaque(true);
		lblRedCntr.setHorizontalAlignment(SwingConstants.CENTER);
		mainPanel.add(lblRedCntr);
	}

	/**
	 * Main JPanel that contains both 
	 * {redCounter} and {clickMe} methods 
	 * 
	 * @return
	 */
	private JPanel main() {
		contentPane.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new GridLayout(1, 0, 0, 0));
		return mainPanel;
	}
	
	
	/**
	 * Class that holds an object of Type Color
	 * that adds functionality to the object as well.
	 * 
	 */
	public static class ButtonColor {
		private Color color;

		public ButtonColor(Color color) {
			super();
			this.color = color;
		}
		
		/**
		 * Returns the color of Type color
		 * to compare or set that specific color
		 * 
		 * @return object color of Type Color
		 */
		public Color getColor() {
			return color;
		}
		
		
		
	}
	
	

}

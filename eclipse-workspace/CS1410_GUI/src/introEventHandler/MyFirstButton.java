package introEventHandler;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


/**
 * Demo how to create a event handler for a button.
 * 
 * @author socrates
 */
public class MyFirstButton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblToggle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstButton frame = new MyFirstButton();
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
	public MyFirstButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		newButtonMyFirstButton();
		createLblToggle();
	}

	private void newButtonMyFirstButton() {
		final JButton btnNewButton = new JButton("My First Button");
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblToggle.getBackground().equals(Color.GREEN))
					lblToggle.setBackground(Color.ORANGE);
				else
				lblToggle.setBackground(Color.GREEN);
			}
		});
		btnNewButton.setOpaque(true);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnNewButton.setBackground(Color.RED);
		contentPane.add(btnNewButton, BorderLayout.CENTER);
		
		
	}

	private void createLblToggle() {
		lblToggle = new JLabel("Toggle");
		lblToggle.setOpaque(true);
		lblToggle.setBackground(Color.ORANGE);
		lblToggle.setBorder(new EmptyBorder(0, 15, 0, 15));
		contentPane.add(lblToggle, BorderLayout.WEST);
	}

}

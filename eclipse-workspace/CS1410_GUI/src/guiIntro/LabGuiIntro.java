package guiIntro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Rectangle;
import java.awt.Component;

public class LabGuiIntro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiIntro frame = new LabGuiIntro();
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
	public LabGuiIntro() {
		setBounds(new Rectangle(0, 0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 1));
		
		newLblTitle();
		newBtnWest();
		newTextPanel();
		newLblRed();
	}

	private void newLblTitle() {
		JLabel lblTitle = new JLabel("lblTitle");
		lblTitle.setAlignmentY(Component.TOP_ALIGNMENT);
		lblTitle.setOpaque(true);
		lblTitle.setBackground(Color.BLUE);
		lblTitle.setForeground(Color.GREEN);
		lblTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 33));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitle, BorderLayout.NORTH);
		
	}

	private void newBtnWest() {
		JButton btnNewButton = new JButton("WEST");
		contentPane.add(btnNewButton, BorderLayout.WEST);
	
	}

	private void newTextPanel() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		contentPane.add(panel, BorderLayout.SOUTH);
		{
			JLabel lblNewLabel = new JLabel("Name:");
			lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			panel.add(lblNewLabel);
		}
		{
			textField = new JTextField();
			textField.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			panel.add(textField);
			textField.setColumns(16);
		}
	}

	private void newLblRed() {
		JLabel lblNewLabel_1 = new JLabel("HI");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setFont(new Font("Papyrus", Font.PLAIN, 77));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1, BorderLayout.CENTER);
	}
	
	
	
	
	

}

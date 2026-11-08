package guiWindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class OteoSamuel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OteoSamuel frame = new OteoSamuel();
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
	public OteoSamuel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblhelloWorld = new JLabel("Hello World");
		lblhelloWorld.setVerticalAlignment(SwingConstants.BOTTOM);
		lblhelloWorld.setForeground(new Color(0, 0, 139));
		lblhelloWorld.setHorizontalAlignment(SwingConstants.CENTER);
		lblhelloWorld.setFont(new Font("Andale Mono", Font.PLAIN, 29));
		contentPane.add(lblhelloWorld);

	}

}

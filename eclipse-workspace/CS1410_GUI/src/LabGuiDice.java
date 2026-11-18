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
import java.awt.Rectangle;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class LabGuiDice extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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

	}

	private void rollEmButton() {
		JButton btnRollEm = new JButton("Roll 'Em");
		btnRollEm.setAlignmentY(Component.TOP_ALIGNMENT);
		btnRollEm.setBorderPainted(false);
		btnRollEm.setOpaque(true);
		btnRollEm.setBackground(Color.BLACK);
		btnRollEm.setFont(new Font("PT Serif", Font.PLAIN, 33));
		btnRollEm.setForeground(Color.RED);
		btnRollEm.setMargin(new Insets(0, 0, 0, 0));
		contentPane.add(btnRollEm, BorderLayout.SOUTH);
		
		lblDice();
	}

	private void lblDice() {
		JLabel lblDiceImg = new JLabel("");
		lblDiceImg.setOpaque(true);
		lblDiceImg.setBackground(Color.WHITE);
		lblDiceImg.setIcon(new ImageIcon(LabGuiDice.class.getResource("/Images/die-1.png")));
		lblDiceImg.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblDiceImg, BorderLayout.CENTER);
	}

}

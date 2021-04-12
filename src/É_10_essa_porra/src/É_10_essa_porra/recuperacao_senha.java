package É_10_essa_porra;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class recuperacao_senha extends JFrame {

	private JPanel contentPane;
	private JTextField txtemail;
	private JButton btnProcurar;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					recuperacao_senha frame = new recuperacao_senha();
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
	public recuperacao_senha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEncontreASua = new JLabel("Encontre a sua conta");
		lblEncontreASua.setFont(new Font("Dosis", Font.PLAIN, 20));
		lblEncontreASua.setBounds(104, 44, 179, 32);
		contentPane.add(lblEncontreASua);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(recuperacao_senha.class.getResource("/images/email-envelope-outline-shape-with-rounded-corners_icon-icons.com_56530.png")));
		label.setBounds(79, 102, 41, 25);
		contentPane.add(label);
		
		txtemail = new JTextField();
		txtemail.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtemail.setBounds(117, 102, 155, 25);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		Font dosis=null;
		try {
			dosis = Font.createFont(Font.TRUETYPE_FONT, new File("dosis-regular.ttf")).deriveFont(20f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("dosis-regular.ttf")));
		} catch(IOException | FontFormatException e){
			
		}
		btnProcurar = new JButton("Procurar");
		btnProcurar.setFont(dosis);
		btnProcurar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, Color.BLACK));
		btnProcurar.setBounds(139, 138, 89, 23);
		contentPane.add(btnProcurar);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon(recuperacao_senha.class.getResource("/images/back_112351.png")));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(0, 11, 48, 23);
		contentPane.add(btnNewButton);
	}
}

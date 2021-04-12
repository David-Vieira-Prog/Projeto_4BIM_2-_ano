package É_10_essa_porra;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
	
		
		Font fox = null;

		try {
			fox = Font.createFont(Font.TRUETYPE_FONT, new File("Fox Cavalier.otf")).deriveFont(15f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Fox Cavalier.otf")));
		} catch(IOException | FontFormatException e){
			
		}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 436);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastrarCarros = new JMenu("Carros");
		mnCadastrarCarros.setFont(fox);
		mnCadastrarCarros.setIcon(new ImageIcon(menu.class.getResource("/imagens/Cabriolet_Red_icon-icons.com_54906 (1).png")));
		menuBar.add(mnCadastrarCarros);
		
		JMenuItem mntmCadastrarCarros = new JMenuItem("Cadastrar Carros");
		mnCadastrarCarros.add(mntmCadastrarCarros);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
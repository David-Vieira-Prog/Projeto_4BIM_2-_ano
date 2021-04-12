package É_10_essa_porra;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JSeparator;

public class tela_login_cliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtlogin;
	private JLabel label_1;
	private JPasswordField txtsenha;
	private JLabel label_2;
	private JButton btEntrar;
	private JButton btnAinda;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_login_cliente frame = new tela_login_cliente();
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
	public tela_login_cliente() {
		cliente c=new cliente();
		Font dosis=null;
		try {
			dosis = Font.createFont(Font.TRUETYPE_FONT, new File("dosis-regular.ttf")).deriveFont(20f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("dosis-regular.ttf")));
		} catch(IOException | FontFormatException e){
			
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 403);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtlogin.setText("");
			}
		});
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.BLACK);
		contentPane.setToolTipText("");
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(tela_login_cliente.class.getResource("/images/user_84308 (2).png")));
		label.setBounds(58, 141, 32, 48);
		contentPane.add(label);
		txtlogin = new JTextField();
		txtlogin.setForeground(Color.BLACK);
		txtlogin.setDisabledTextColor(Color.BLACK);
		txtlogin.setHorizontalAlignment(SwingConstants.LEFT);
		txtlogin.setFont(dosis);
		txtlogin.setToolTipText("");
		JTextField texto = new JTextField(); 
		txtlogin.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtlogin.setBounds(91, 153, 145, 30);
		contentPane.add(txtlogin);
		txtlogin.setColumns(10);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(tela_login_cliente.class.getResource("/images/key-silhouette-security-tool-interface-symbol-of-password_icon-icons.com_54503.png")));
		label_1.setBounds(58, 200, 42, 42);
		contentPane.add(label_1);
		
		txtsenha = new JPasswordField();
		txtsenha.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtsenha.setBounds(91, 212, 145, 30);
		contentPane.add(txtsenha);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(tela_login_cliente.class.getResource("/images/person_user_customer_man_male_man_boy_people_1687.png")));
		label_2.setBounds(124, 75, 64, 67);
		contentPane.add(label_2);
		btEntrar = new JButton("");
		btEntrar.setBorder(null);
		btEntrar.setForeground(Color.WHITE);
		btEntrar.setBackground(Color.WHITE);
		btEntrar.setContentAreaFilled(false);
		btEntrar.setFont(dosis);
		btEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login =txtlogin.getText();
				String senha=new String (txtsenha.getPassword());
				if(c.entrar(login,senha)==true) {
					c.consultar(login, senha);
					ResultSet consulta=null;
					try {
						consulta=c.consultar(login, senha);
						
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Erro");
					}
					try {
						 	while(consulta.next()) {	
						 	}
					}catch(SQLException e2) {
						e2.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null, "Login e/ou senha inválidas");
				}
				
				
			}
		});
		btEntrar.setIcon(new ImageIcon(tela_login_cliente.class.getResource("/images/1491254399-rightarrowfowardsign_82944.png")));
		btEntrar.setBounds(235, 212, 51, 30);
		contentPane.add(btEntrar);
		btnAinda = new JButton("N\u00E3o tem conta? Cadastre-se.");
		btnAinda.setForeground(Color.BLACK);
		
		btnAinda.setVerticalTextPosition(SwingConstants.TOP);
		btnAinda.setBorder(null);
		btnAinda.setFont(dosis);
		btnAinda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					tela_cadastro_cliente frame = new tela_cadastro_cliente();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAinda.setContentAreaFilled(false);
		btnAinda.setBounds(69, 330, 186, 23);
		contentPane.add(btnAinda);
		
		lblNewLabel = new JLabel("SELLCAR");
		lblNewLabel.setFont(new Font("Fox Cavalier", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 19, 310, 23);
		contentPane.add(lblNewLabel);
		
		JButton esqueceu = new JButton("Esqueceu a sua senha?");
		
		esqueceu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					recuperacao_senha frame = new recuperacao_senha();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		esqueceu.setFont(dosis);
		esqueceu.setContentAreaFilled(false);
		esqueceu.setBorder(null);
		esqueceu.setBounds(97, 253, 139, 23);
		contentPane.add(esqueceu);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 316, 300, 3);
		contentPane.add(separator);
	}
}

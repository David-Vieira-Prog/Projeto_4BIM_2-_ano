package É_10_essa_porra;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.AbstractButton;
import javax.swing.DropMode;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.ComponentOrientation;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class tela_cadastro_cliente extends JFrame {
	private JTextField txtnome;
	private JTextField txtendereco;
	private JTextField txtlogin;
	private JPasswordField txtsenha;
	private JTextField txtemail;
	private JComboBox mes;
	private JTextField txtcidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_cadastro_cliente frame = new tela_cadastro_cliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws  
	 */
	public tela_cadastro_cliente()  {
		pessoa p=new pessoa();
		cliente c=new cliente();
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(tela_cadastro_cliente.class.getResource("/images/business_application_addmale_useradd_insert_add_user_client_2312 (2).png")));
		setType(Type.POPUP);
		setTitle("User\r\n");
		Font dosis = null;

		try {
			dosis = Font.createFont(Font.TRUETYPE_FONT, new File("dosis-regular.ttf")).deriveFont(20f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("dosis-regular.ttf")));
		} catch(IOException | FontFormatException e){
			
		}
		Font fox = null;

		try {
			fox = Font.createFont(Font.TRUETYPE_FONT, new File("Fox-Cavalier.otf")).deriveFont(20f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Fox-Cavalier.otf")));
		} catch(IOException | FontFormatException e){
			
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 615);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setFont(dosis);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel lblIdade = new JLabel("Data de Nascimento:");
		lblIdade.setBounds(298, 84, 116, 14);
		lblIdade.setFont(new Font("Dosis", Font.PLAIN, 14));
		contentPane.add(lblIdade);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(355, 121, 46, 14);
		lblCpf.setFont(dosis);
		contentPane.add(lblCpf);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(355, 151, 46, 14);
		lblRg.setFont(dosis);
		contentPane.add(lblRg);
		
		JLabel lblEndereco = new JLabel("Logradouro:");
		lblEndereco.setBounds(27, 249, 77, 23);
		lblEndereco.setFont(new Font("Dosis", Font.PLAIN, 14));
		contentPane.add(lblEndereco);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(58, 290, 46, 14);
		lblCep.setFont(new Font("Dosis", Font.PLAIN, 14));
		contentPane.add(lblCep);
		
		JLabel lblNome = new JLabel("Nome Completo:");
		lblNome.setToolTipText("");
		lblNome.setFont(new Font("Dosis", Font.PLAIN, 14));
		lblNome.setBounds(20, 80, 116, 23);
		contentPane.add(lblNome);
		txtnome = new JTextField();
		txtnome.setHorizontalAlignment(SwingConstants.LEFT);
		txtnome.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtnome.setDisabledTextColor(Color.BLACK);
		txtnome.setBackground(Color.WHITE);
		txtnome.setForeground(Color.LIGHT_GRAY);
		txtnome.setBounds(116, 81, 163, 20);
		txtnome.setFont(dosis);
		contentPane.add(txtnome);
		txtnome.setColumns(10);
		
		JFormattedTextField txtcpf = new JFormattedTextField();
		txtcpf.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		try {
			txtcpf.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("###.###.### - ##")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		txtcpf.setFont(dosis);
		txtcpf.setBounds(411, 118, 116, 20);
		contentPane.add(txtcpf);
		
		JFormattedTextField txtrg = new JFormattedTextField();
		txtrg.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		try {
			txtrg.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("#.###.### - #")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		txtrg.setBounds(411, 145, 116, 20);
		contentPane.add(txtrg);
		
		txtendereco = new JTextField();
		txtendereco.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtendereco.setBounds(116, 252, 163, 20);
		contentPane.add(txtendereco);
		txtendereco.setColumns(10);
		
		JFormattedTextField txtcep = new JFormattedTextField();
		txtcep.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		try {
			txtcep.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##### - ###")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		txtcep.setBounds(114, 288, 92, 20);
		contentPane.add(txtcep);
	JRadioButton btmasculino = new JRadioButton("Masculino");
		
		
		btmasculino.setFont(dosis);
		btmasculino.setContentAreaFilled(false);
		btmasculino.setBounds(62, 117, 109, 23);
		contentPane.add(btmasculino);
		
		JCheckBox prefiro = new JCheckBox("Prefiro n\u00E3o dizer");
		
		prefiro.setFont(dosis);
		
		prefiro.setContentAreaFilled(false);
		prefiro.setBounds(72, 143, 126, 23);
		contentPane.add(prefiro);
		
		JRadioButton btfeminino = new JRadioButton("Feminino");
				btfeminino.setFont(dosis);
		btfeminino.setContentAreaFilled(false);
		btfeminino.setBounds(150, 117, 109, 23);
		contentPane.add(btfeminino);
		txtlogin = new JTextField();
		txtlogin.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtlogin.setFont(dosis);
		txtlogin.setBounds(116, 432, 92, 20);
		contentPane.add(txtlogin);
		txtlogin.setColumns(10);
		JButton btcadastrar = new JButton("Cadastrar");
		btcadastrar.setContentAreaFilled(false);
		btcadastrar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		btcadastrar.setBorder(new CompoundBorder());
		btcadastrar.setBackground(Color.LIGHT_GRAY);
		btcadastrar.setIcon(new ImageIcon(tela_cadastro_cliente.class.getResource("/images/1486485588-add-create-new-math-sign-cross-plus_81186.png")));
		btcadastrar.setSelectedIcon(new ImageIcon(tela_cadastro_cliente.class.getResource("/images/business_application_addmale_useradd_insert_add_user_client_2312 (2).png")));
		btcadastrar.setFont(new Font("Dosis", Font.PLAIN, 20));
JFormattedTextField txttel = new JFormattedTextField();
		
		try {
			txttel.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("(##) ####-####")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		txttel.setFont(dosis);
		txttel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txttel.setBounds(411, 287, 116, 20);
		contentPane.add(txttel);
		JComboBox dia1 = new JComboBox();
		dia1.setFont(dosis);
		dia1.setBorder(null);
		dia1.addItem("Dia:");
		for(int i=1;i<=31;i++) {
			dia1.addItem(i);
		}
		dia1.setBounds(411, 82, 52, 20);
		contentPane.add(dia1);
		JComboBox mes1 = new JComboBox();
		mes1.setFont(dosis);
		mes1.addItem("Mês");
		for(int i=1;i<=12;i++) {
			mes1.addItem(i);
		}
		mes1.setBounds(473, 84, 54, 18);
		contentPane.add(mes1);
		
		JComboBox ano1 = new JComboBox();
		ano1.setFont(dosis);
		ano1.addItem("Ano:");
		for(int i=1950;i<=2019;i++) {
			ano1.addItem(i);
		}
		ano1.setBounds(543, 83, 57, 20);
		contentPane.add(ano1);
		
		JComboBox uf = new JComboBox();
		uf.setFont(new Font("Dosis", Font.PLAIN, 14));
		uf.setModel(new DefaultComboBoxModel(new String[] {"AC","AL","AM","BA","CE","DF","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"}));
		uf.setBounds(62, 330, 46, 20);
		contentPane.add(uf);
		JLabel lblCidademunicpio = new JLabel("Cidade/Munic\u00EDpio:");
		lblCidademunicpio.setFont(new Font("Dosis", Font.PLAIN, 14));
		lblCidademunicpio.setBounds(116, 330, 116, 19);
		contentPane.add(lblCidademunicpio);
		
		txtcidade = new JTextField();
		txtcidade.setFont(dosis);
		txtcidade.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtcidade.setBounds(219, 330, 126, 22);
		contentPane.add(txtcidade);
		txtcidade.setColumns(10);
		btcadastrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				String cpf=txtcpf.getText().replace(".", "");
				String cpff=cpf.replace(" - ", "");
				c.setCpf(cpff);
				if(c.validar_cpf(cpff)==true) {
					JOptionPane.showMessageDialog(null, "chegou aqui");
				}else {
					JOptionPane.showMessageDialog(null, "chegou n");
				}
				String dia=dia1.getSelectedItem().toString();
				String mes=mes1.getSelectedItem().toString();
				String ano=ano1.getSelectedItem().toString();
				String data1=dia.concat(String.format("/%s", mes));
				String data2=data1.concat(String.format("/%s", ano));
				c.setNome(txtnome.getText());
				c.setCpf(txtcpf.getText());
				c.setRg(txtrg.getText());
				c.setData_nasc(data2);
				c.setEndereco(txtendereco.getText());
				if(btmasculino.isSelected()) {
				c.setSexo("masculino");
				}
				if(btfeminino.isSelected()) {
					c.setSexo("feminino");
				}
				if(prefiro.isSelected()) {
					c.setSexo("Não selecionado");
				}
				c.setEmail(txtemail.getText());
				c.setTelefone(txttel.getText());
				c.setLogin(txtlogin.getText());;
				String senha=new String (txtsenha.getPassword());
				c.setSenha(senha);
				c.setCidade(txtcidade.getText());
				String estado=uf.getSelectedItem().toString();
				c.setEstado(estado);
				try {
					c.incluir();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,"CADASTRO REALIZADO COM SUCESSO");
				dispose();
			}
		});
		btcadastrar.setBounds(116, 505, 126, 41);
		contentPane.add(btcadastrar);
		
		JButton btcancelar = new JButton("Cancelar\r\n");
		btcancelar.setContentAreaFilled(false);
		btcancelar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		btcancelar.setBorder(new CompoundBorder());
		btcancelar.setFont(new Font("Dosis", Font.PLAIN, 20));
		btcancelar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Object[] options = { "SIM", "NÃO" };
				int Cancel = JOptionPane.showOptionDialog(null, "TEM CERTEZA QUE DESEJA CANCELAR?", "ALERTA", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE , null, options, options[0]);

				if(Cancel == JOptionPane.YES_OPTION) {
				dispose();
				}
			}
		});
		btcancelar.setBackground(Color.LIGHT_GRAY);
		btcancelar.setIcon(new ImageIcon(tela_cadastro_cliente.class.getResource("/images/1486564399-close_81512.png")));
		btcancelar.setBounds(288, 505, 126, 41);
		contentPane.add(btcancelar);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Dosis", Font.PLAIN, 14));
		lblLogin.setBounds(58, 433, 46, 17);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Dosis", Font.PLAIN, 14));
		lblSenha.setBounds(58, 473, 46, 14);
		contentPane.add(lblSenha);
		
	
		
		txtsenha = new JPasswordField();
		txtsenha.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtsenha.setBounds(116, 472, 93, 20);
		contentPane.add(txtsenha);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Dosis", Font.PLAIN, 14));
		lblEmail.setBounds(355, 254, 46, 14);
		contentPane.add(lblEmail);
		
		txtemail = new JTextField();
		txtemail.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtemail.setFont(dosis);
		txtemail.setBounds(408, 251, 140, 20);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Dosis", Font.PLAIN, 14));
		lblTelefone.setBounds(355, 290, 52, 14);
		contentPane.add(lblTelefone);
		
		
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(dosis);
		lblSexo.setBounds(20, 121, 46, 14);
		contentPane.add(lblSexo);
		
	
		
		JLabel lblNewLabel = new JLabel("DADOS PESSOAIS");
		lblNewLabel.setFont(new Font("Dosis", Font.PLAIN, 20));
		lblNewLabel.setBounds(20, 29, 259, 23);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 194, 629, 20);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("ENDERE\u00C7O");
		lblNewLabel_1.setFont(new Font("Dosis", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(20, 205, 116, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblContato = new JLabel("CONTATO");
		lblContato.setFont(new Font("Dosis", Font.PLAIN, 20));
		lblContato.setBounds(408, 215, 107, 16);
		contentPane.add(lblContato);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.LIGHT_GRAY);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(20, 374, 629, 14);
		contentPane.add(separator_1);
		
		JLabel lblLogIn = new JLabel("LOG IN");
		lblLogIn.setFont(new Font("Dosis", Font.PLAIN, 20));
		lblLogIn.setBounds(27, 399, 92, 23);
		contentPane.add(lblLogIn);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Dosis", Font.PLAIN, 14));
		lblUf.setBounds(27, 331, 34, 14);
		contentPane.add(lblUf);
		btmasculino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btmasculino.isSelected();
				btfeminino.setSelected(false);
				prefiro.setSelected(false);
				
			}
		});
		btfeminino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btfeminino.isSelected();
				btmasculino.setSelected(false);
				prefiro.setSelected(false);
			}
		});
		prefiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prefiro.isSelected();
				btmasculino.setSelected(false);
				btfeminino.setSelected(false);
				
			}
		});	
		
		
	
		
		
	}
}

package É_10_essa_porra;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JList;
import javax.swing.JTree;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JFormattedTextField;
import java.awt.Label;
import javax.swing.JButton;

public class tela_venda_carro extends JFrame {

	private JPanel contentPane;
	private JTextField txtmarca;
	private JTextField txtmodelo;
	private JTextField txtkm;
	private JTextField txtcor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_venda_carro frame = new tela_venda_carro();
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
	public tela_venda_carro() {
		carro c=new carro();
		Font dosis = null;

		try {
			dosis = Font.createFont(Font.TRUETYPE_FONT, new File("dosis-regular.ttf")).deriveFont(20f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("dosis-regular.ttf")));
		} catch(IOException | FontFormatException e){
			
		}
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 506);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox combomarca = new JComboBox();
		combomarca.setForeground(Color.BLACK);
		combomarca.setBackground(Color.WHITE);
		combomarca.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		combomarca.setFont(new Font("Dosis", Font.PLAIN, 12));
		combomarca.setModel(new DefaultComboBoxModel(new String[] {"Selecione abaixo:"}));
		combomarca.setBounds(89, 88, 122, 20);
		String marcas[] ={"Toyota","Volkswagen","Ford","Nissan","Honda","Hyundai","Chevrolet","kia"};
		String volks[]= {"Amarok","Apollo","Brasília","CC","Caravelle","Corrado","CrossFox","Eos"};
		String toyata[]= {"Avalon","Bandeirante Jipe","Bandeirante Picape ","Camry","Camry Wagon","Celica","Corolla","Corolla Fielder"};
		for(int i=0;i<8;i++) {
			combomarca.addItem(marcas[i]);
		}
		contentPane.add(combomarca);
		
		JComboBox combomodelo = new JComboBox();
		combomodelo.setBorder(new TitledBorder(null, "", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		combomodelo.setFont(new Font("Dosis", Font.PLAIN, 12));
		combomodelo.setModel(new DefaultComboBoxModel(new String[] {"Selecione abaixo:"}));
		combomodelo.setBounds(520, 88, 122, 20);
		contentPane.add(combomodelo);
		
		JLabel lblNewLabel = new JLabel("VENDA");
		lblNewLabel.setFont(new Font("Dosis", Font.PLAIN, 24));
		lblNewLabel.setBounds(10, 11, 434, 49);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBackground(Color.BLACK);
		separator.setBounds(20, 70, 699, 3);
		contentPane.add(separator);
		
		JRadioButton btoutromarca = new JRadioButton("Outros:");
		btoutromarca.setFont(new Font("Dosis", Font.PLAIN, 13));
		
		btoutromarca.setContentAreaFilled(false);
		btoutromarca.setBounds(30, 120, 63, 35);
		contentPane.add(btoutromarca);
		
		txtmarca = new JTextField();
		txtmarca.setVisible(false);
		txtmarca.setFont(new Font("Dosis", Font.PLAIN, 13));
		txtmarca.setBorder(null);
		txtmarca.setBackground(Color.LIGHT_GRAY);
		txtmarca.setBounds(99, 115, 139, 25);
		contentPane.add(txtmarca);
		txtmarca.setColumns(10);
		
		JSeparator separatormarca = new JSeparator();
		separatormarca.setForeground(Color.LIGHT_GRAY);
		separatormarca.setBackground(Color.BLACK);
		separatormarca.setBounds(95, 140, 144, 28);
		contentPane.add(separatormarca);
		separatormarca.setVisible(false);
		
		JSeparator separatormodelo = new JSeparator();
		separatormodelo.setForeground(Color.LIGHT_GRAY);
		separatormodelo.setBackground(Color.BLACK);
		separatormodelo.setBounds(503, 140, 144, 28);
		separatormodelo.setVisible(false);
		contentPane.add(separatormodelo);
		
		txtmodelo = new JTextField();
		txtmodelo.setBackground(Color.LIGHT_GRAY);
		txtmodelo.setFont(new Font("Dosis", Font.PLAIN, 13));
		txtmodelo.setBorder(null);
		txtmodelo.setBounds(503, 117, 139, 20);
		contentPane.add(txtmodelo);
		txtmodelo.setColumns(10);
		
		JComboBox combocarroceria = new JComboBox();
		combocarroceria.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		combocarroceria.setFont(new Font("Dosis", Font.PLAIN, 12));
		combocarroceria.setModel(new DefaultComboBoxModel(new String[] {"Selecione  abaixo:"}));
		String modelos[]= {"Hatchback Compacto","Hatchback Médio","Sedan","Coupé","Minivan","Van","SW","Pick-up","Jipe","SUV","Crossover"};
		combocarroceria.setBounds(105, 172, 122, 20);
		for(int i=0;i<11;i++) {
			combocarroceria.addItem(modelos[i]);
		}
		contentPane.add(combocarroceria);
		
		JComboBox comboano = new JComboBox();
		
		comboano.setFont(new Font("Dosis", Font.PLAIN, 12));
		comboano.setModel(new DefaultComboBoxModel(new String[] {"Selecione abaixo:"}));
		comboano.setBounds(99, 251, 122, 20);
		for(int i=1990;i<=2019;i++) {
			comboano.addItem(i);
		}
		contentPane.add(comboano);
		
		JList list = new JList();
		list.setBackground(Color.BLACK);
		list.setBounds(293, 314, -77, -59);
		contentPane.add(list);
		
		JComboBox combocor = new JComboBox();
		combocor.setFont(new Font("Dosis", Font.PLAIN, 12));
		combocor.setModel(new DefaultComboBoxModel(new String[] {"Selecione  abaixo:"}));
		String cor[]= {"Azul","Amarelo","Vermelho","Preto","Cinza","Branco","Marrom"};
		for(int i=0;i<7;i++) {
			combocor.addItem(cor[i]);
		}
		combocor.setBounds(520, 171, 122, 20);
		contentPane.add(combocor);
		
		JLabel lblMarca = new JLabel("MARCA:");
		lblMarca.setFont(new Font("Dosis", Font.PLAIN, 15));
		lblMarca.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarca.setBounds(10, 88, 83, 20);
		contentPane.add(lblMarca);
		
		JLabel lblModelo = new JLabel("MODELO:");
		lblModelo.setFont(new Font("Dosis", Font.PLAIN, 15));
		lblModelo.setBounds(458, 88, 52, 17);
		contentPane.add(lblModelo);
		
		TextArea txtdescricao = new TextArea();
		txtdescricao.setFont(new Font("Dosis", Font.PLAIN, 12));
		txtdescricao.setBounds(436, 344, 293, 123);
		contentPane.add(txtdescricao);
		
		JLabel lblDescrio = new JLabel("DESCRI\u00C7\u00C3O:");
		lblDescrio.setFont(new Font("Dosis", Font.PLAIN, 15));
		lblDescrio.setBounds(359, 344, 77, 20);
		contentPane.add(lblDescrio);
		
		JLabel lblCor = new JLabel("COR:");
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCor.setBounds(458, 173, 46, 14);
		contentPane.add(lblCor);
		
		JLabel lblPreo = new JLabel("PRE\u00C7O:");
		lblPreo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreo.setFont(new Font("Dosis", Font.PLAIN, 15));
		lblPreo.setBounds(20, 343, 63, 22);
		contentPane.add(lblPreo);
		
		JFormattedTextField txtpreco = new JFormattedTextField();
		txtpreco.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtpreco.setFont(new Font("Dosis", Font.PLAIN, 12));
		try {
			txtpreco.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("## . ### , ##")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		txtpreco.setBounds(73, 345, 77, 20);
		contentPane.add(txtpreco);
		
		JLabel lblNewLabel_1 = new JLabel("REAIS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Dosis", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(145, 346, 38, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("KM RODADOS:");
		lblNewLabel_2.setFont(new Font("Dosis", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 379, 83, 14);
		contentPane.add(lblNewLabel_2);
		
		txtkm = new JTextField();
		txtkm.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtkm.setFont(new Font("Dosis", Font.PLAIN, 12));
		txtkm.setBounds(94, 377, 30, 20);
		contentPane.add(txtkm);
		txtkm.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("MIL");
		lblNewLabel_3.setFont(new Font("Dosis", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(134, 381, 24, 14);
		contentPane.add(lblNewLabel_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(20, 300, 699, 3);
		contentPane.add(separator_1);
		
		JRadioButton btoutracor = new JRadioButton("Outras:");
	
		btoutracor.setFont(new Font("Dosis", Font.PLAIN, 13));
		btoutracor.setContentAreaFilled(false);
		btoutracor.setBounds(447, 194, 63, 23);
		contentPane.add(btoutracor);
		
		JSeparator separatorcor = new JSeparator();
		separatorcor.setVisible(false);
		separatorcor.setBackground(Color.BLACK);
		separatorcor.setBounds(520, 215, 139, 2);
		contentPane.add(separatorcor);
		
		txtcor = new JTextField();
		txtcor.setVisible(false);
		txtcor.setFont(new Font("Dosis", Font.PLAIN, 12));
		txtcor.setBorder(null);
		txtcor.setBackground(Color.LIGHT_GRAY);
		txtcor.setForeground(Color.BLACK);
		txtcor.setBounds(520, 197, 139, 17);
		contentPane.add(txtcor);
		txtcor.setColumns(10);
		
		JLabel lblCategoria = new JLabel("CARROCERIA:");
		lblCategoria.setFont(new Font("Dosis", Font.PLAIN, 15));
		lblCategoria.setBounds(20, 173, 92, 14);
		contentPane.add(lblCategoria);
		
		JLabel lblAnoModelo = new JLabel("Ano modelo:");
		lblAnoModelo.setFont(new Font("Dosis", Font.PLAIN, 15));
		lblAnoModelo.setBounds(20, 252, 73, 16);
		contentPane.add(lblAnoModelo);
		
		JLabel lblPlaca = new JLabel("PLACA:");
		lblPlaca.setFont(new Font("Dosis", Font.PLAIN, 15));
		lblPlaca.setBounds(458, 255, 46, 14);
		contentPane.add(lblPlaca);
		
		JFormattedTextField txtplaca = new JFormattedTextField();
		txtplaca.setFont(new Font("Dosis", Font.PLAIN, 12));
		try {
			txtplaca.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("UUU - ####")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		txtplaca.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtplaca.setBounds(520, 252, 63, 20);
		contentPane.add(txtplaca);
		
		JButton btnAnunciar = new JButton("Anunciar");
		
		btnAnunciar.setForeground(Color.BLACK);
		btnAnunciar.setBackground(Color.LIGHT_GRAY);
		btnAnunciar.setIcon(new ImageIcon(tela_venda_carro.class.getResource("/images/dollar-coin-money_icon-icons.com_56177.png")));
		btnAnunciar.setFont(new Font("Dosis", Font.PLAIN, 12));
		btnAnunciar.setBounds(73, 414, 122, 41);
		contentPane.add(btnAnunciar);
		
		combomarca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(combomarca.getSelectedItem().equals("Toyota")) {
					for(int i=0;i<8;i++) {
						combomodelo.removeItem(toyata[i]);
						combomodelo.removeItem(volks[i]);
						combomodelo.addItem(toyata[i]);
						
					}}
					if(combomarca.getSelectedItem().equals("Volkswagen")) {
						for(int i=0;i<8;i++) {
							combomodelo.removeItem(toyata[i]);
							combomodelo.removeItem(volks[i]);
							combomodelo.addItem(volks[i]);
						}
					}
				if(combomarca.getSelectedItem().equals("Selecione abaixo:")) {
					for(int i=0;i<8;i++) {
						combomodelo.removeItem(toyata[i]);
						combomodelo.removeItem(volks[i]);
					
					}
				}
			}
		});
		
		btoutromarca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btoutromarca.isSelected()) {
					txtmarca.setVisible(true);
					separatormarca.setVisible(true);
					txtmodelo.setVisible(true);
					separatormodelo.setVisible(true);
					combomarca.setEnabled(false);
					combomodelo.setEnabled(false);
					
				}
				else {
					txtmarca.setVisible(false);
					separatormarca.setVisible(false);
					txtmodelo.setVisible(false);
					separatormodelo.setVisible(false);
					combomarca.setEnabled(true);
					combomodelo.setEnabled(true);
				}
				
				
				
				
				
			}
		});
		btoutracor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btoutracor.isSelected()) {
					separatorcor.setVisible(true);
					txtcor.setVisible(true);
					combocor.setEnabled(false);
					
				}else {
					separatorcor.setVisible(false);
					txtcor.setVisible(false);
					combocor.setEnabled(true);

				}
				
			}
		});
		btnAnunciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					tela_de_progresso frame = new tela_de_progresso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if(btoutromarca.isSelected()){
					c.setMarca(txtmarca.getText());
					c.setModelo(txtmodelo.getText());
					
				}else {
					c.setMarca(combomarca.getSelectedItem().toString());
					c.setModelo(combomodelo.getSelectedItem().toString());
				}
				c.setCarroceria(combocarroceria.getSelectedItem().toString());
				if(btoutracor.isSelected()) {
					c.setCor(txtcor.getText());
				}else {
					c.setCor(combocor.getSelectedItem().toString());
				}
				c.setAno_modelo(Integer.parseInt(comboano.getSelectedItem().toString()));
				c.setPlaca(txtmarca.getText());
				c.setPreco(Float.parseFloat( txtpreco.getText()));
				c.setQuilometragem_max(Integer.parseInt(txtkm.getText()));
				c.setDescricao(txtdescricao.getText());
				
			}
		});
	}
}

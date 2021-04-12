package É_10_essa_porra;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class tela_de_progresso extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_de_progresso frame = new tela_de_progresso();
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
	public tela_de_progresso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 135);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar carregamento = new JProgressBar();
		carregamento.setBounds(26, 23, 275, 39);
		carregamento.setBorderPainted(true);
		carregamento.setStringPainted(true);
		carregamento.setValue(50);
		carregamento.setMaximum(1000);
		carregamento.setForeground(Color.GREEN);
		contentPane.add(carregamento);
		
		JLabel lblNewLabel = new JLabel("Anunciando...");
		lblNewLabel.setFont(new Font("Dosis", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 71, 320, 14);
		contentPane.add(lblNewLabel);
		class temp extends Thread{
			public void run() {
				while(carregamento.getValue()<1000) {
					try {
						sleep(20);
						carregamento.setValue(carregamento.getValue()+10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				JOptionPane.showMessageDialog(null, "Carro Anunciado com Sucesso");
				dispose();
				
			}
			
		}
		new temp().start();
	}
}

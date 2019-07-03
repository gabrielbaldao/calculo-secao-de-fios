package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLayeredPane;

public class Guiteste extends JFrame {
	public Guiteste() {
	}

	private JPanel contentPane;
	private JTextField txtTeste;
	private JTabbedPane tabbedPane;
	private JPanel inicio;
	private JPanel painelFirstMethod;
	private JPanel painelMetodoDeInstalacao;
	private JPanel painelThirdMethod;
	private JPanel painelFourthMethod;
	private JPanel panelFifthMethod;
	private JPanel panelSegundo;
	private JButton btnProximo;
	private JButton button_1;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton btnFinalizar;
	private int cont;
	private int contInstalacao;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JLabel lblInformaesBasicasDo;
	private ButtonGroup utilizacao = new ButtonGroup();
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblSelecioneO;
	private JComboBox comboBox_4;
	private JTextField textField;
	private JTextField textField_1;
	private JButton button;
	private JButton button_2;
	private JButton button_10;
	private JButton button_11;
	private JComboBox<String> comboBox_5;
	private JLabel label_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiPrincipal frame = new GuiPrincipal();
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
	public void Guiteste() {
		cont =0;
		contInstalacao=0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000	, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		inicio = new JPanel();
		tabbedPane.addTab("Inicio", null, inicio, null);
		
		txtTeste = new JTextField();
		txtTeste.setText("Teste");
		txtTeste.setColumns(10);
		
		btnProximo = new JButton("Proximo");
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(++cont);
			}
		});
		GroupLayout gl_inicio = new GroupLayout(inicio);
		gl_inicio.setHorizontalGroup(
			gl_inicio.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_inicio.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtTeste, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(859, Short.MAX_VALUE))
				.addGroup(gl_inicio.createSequentialGroup()
					.addContainerGap(883, Short.MAX_VALUE)
					.addComponent(btnProximo)
					.addContainerGap())
		);
		gl_inicio.setVerticalGroup(
			gl_inicio.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inicio.createSequentialGroup()
					.addGap(29)
					.addComponent(txtTeste, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
					.addComponent(btnProximo)
					.addGap(312))
		);
		inicio.setLayout(gl_inicio);
		
		painelFirstMethod = new JPanel();
		tabbedPane.addTab("1", null, painelFirstMethod, null);
		
		button_1 = new JButton("Proximo");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(++cont);

			}
		});
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tabbedPane.setSelectedIndex(--cont);
			}
		});
		
		JLabel lblCircuito = new JLabel("Informe o tipo de ciruito: ");
		JRadioButton rdbtnCircuitoDeForca = new JRadioButton("Circuito de Força");
		
		JRadioButton rdbtnCircuitoIluminacao = new JRadioButton("Circuito de Iluminação");
		utilizacao.add(rdbtnCircuitoIluminacao);
		utilizacao.add(rdbtnCircuitoDeForca);
		
		lblInformaesBasicasDo = new JLabel("Informações Basicas do Circuito");
		GroupLayout gl_painelFirstMethod = new GroupLayout(painelFirstMethod);
		gl_painelFirstMethod.setHorizontalGroup(
			gl_painelFirstMethod.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelFirstMethod.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAnterior)
					.addPreferredGap(ComponentPlacement.RELATED, 751, Short.MAX_VALUE)
					.addComponent(button_1)
					.addGap(40))
				.addGroup(gl_painelFirstMethod.createSequentialGroup()
					.addGroup(gl_painelFirstMethod.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_painelFirstMethod.createSequentialGroup()
							.addGap(185)
							.addComponent(lblInformaesBasicasDo))
						.addGroup(gl_painelFirstMethod.createSequentialGroup()
							.addGap(32)
							.addComponent(lblCircuito))
						.addGroup(gl_painelFirstMethod.createSequentialGroup()
							.addGap(32)
							.addComponent(rdbtnCircuitoDeForca))
						.addGroup(gl_painelFirstMethod.createSequentialGroup()
							.addGap(32)
							.addComponent(rdbtnCircuitoIluminacao)))
					.addContainerGap(575, Short.MAX_VALUE))
		);
		gl_painelFirstMethod.setVerticalGroup(
			gl_painelFirstMethod.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelFirstMethod.createSequentialGroup()
					.addGap(77)
					.addComponent(lblInformaesBasicasDo)
					.addGap(6)
					.addComponent(lblCircuito)
					.addGap(2)
					.addComponent(rdbtnCircuitoDeForca)
					.addGap(4)
					.addComponent(rdbtnCircuitoIluminacao)
					.addGap(288)
					.addComponent(btnAnterior)
					.addContainerGap(299, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_painelFirstMethod.createSequentialGroup()
					.addContainerGap(441, Short.MAX_VALUE)
					.addComponent(button_1)
					.addGap(322))
		);
		painelFirstMethod.setLayout(gl_painelFirstMethod);
		
		panelSegundo = new JPanel();
		tabbedPane.addTab("2", null, panelSegundo, null);
		
		btnFinalizar = new JButton("Proximo");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(++cont);
			}
		});
		button_9 = new JButton("Anterior");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(--cont);
			}
		});
		
		JLabel label = new JLabel("Frêquencia: ");
		
		textField = new JTextField();
		textField.setText("60");
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("Material do Condutor :");
		
		JComboBox comboBox = new JComboBox();
		
		JLabel label_2 = new JLabel("Numero de Condutores :");
		
		JComboBox comboBox_1 = new JComboBox();
		
		JLabel label_3 = new JLabel("Tensão de Serviço : ");
		
		JComboBox comboBox_2 = new JComboBox();
		
		JComboBox comboBox_3 = new JComboBox();
		
		JLabel label_4 = new JLabel("Sistema :");
		
		JLabel label_5 = new JLabel("Temperatura Ambiente :(ºC)");
		
		textField_1 = new JTextField();
		textField_1.setText("40");
		textField_1.setColumns(10);
		GroupLayout gl_panelSegundo = new GroupLayout(panelSegundo);
		gl_panelSegundo.setHorizontalGroup(
			gl_panelSegundo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSegundo.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panelSegundo.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(125)
					.addGroup(gl_panelSegundo.createParallelGroup(Alignment.LEADING)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5))
					.addGap(378)
					.addComponent(btnFinalizar))
				.addGroup(gl_panelSegundo.createSequentialGroup()
					.addGap(42)
					.addComponent(label_1)
					.addGap(79)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelSegundo.createSequentialGroup()
					.addGap(42)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelSegundo.createSequentialGroup()
					.addGap(42)
					.addComponent(label_2))
				.addGroup(gl_panelSegundo.createSequentialGroup()
					.addGap(42)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelSegundo.createSequentialGroup()
					.addGap(42)
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelSegundo.createSequentialGroup()
					.addGap(42)
					.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelSegundo.createSequentialGroup()
					.addGap(24)
					.addComponent(button_9))
		);
		gl_panelSegundo.setVerticalGroup(
			gl_panelSegundo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSegundo.createSequentialGroup()
					.addGap(141)
					.addGroup(gl_panelSegundo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelSegundo.createSequentialGroup()
							.addGap(21)
							.addComponent(label)
							.addGap(5)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelSegundo.createSequentialGroup()
							.addComponent(label_4)
							.addGap(6)
							.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(label_5))
						.addComponent(btnFinalizar))
					.addGap(6)
					.addGroup(gl_panelSegundo.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label_2)
					.addGap(12)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label_3)
					.addGap(12)
					.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(82)
					.addComponent(button_9))
		);
		panelSegundo.setLayout(gl_panelSegundo);
		
		painelMetodoDeInstalacao = new JPanel();
		tabbedPane.addTab("3", null, painelMetodoDeInstalacao, null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		
		panel = new JPanel();
		tabbedPane_1.addTab("3.1", null, panel, null);
		
		lblSelecioneO = new JLabel("Selecione a possibilidade de instalação :");
		comboBox_5 = new JComboBox();
		comboBox_4 = new JComboBox();
		comboBox_4.addItem(" ");
		comboBox_4.addItem("Aparente");
		comboBox_4.addItem("Embutida");
		comboBox_4.addItem("Espaço de construção");
		comboBox_4.addItem("Subterranea");
		comboBox_4.addItem("Suspensa");

		comboBox_4.addActionListener(new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		        String caso = (String) comboBox_4.getSelectedItem();
		       // System.out.println(caso);
		        switch (caso){
		        case "Aparente":
		        	comboBox_5.removeAllItems();
		        	comboBox_5.addItem(" ");
		        	comboBox_5.addItem("Eletroduto");
		        	comboBox_5.addItem("Bandeja Perfurada");
		        	comboBox_5.addItem("Leito ( para cabos)");
		        	comboBox_5.addItem("Bandeja não perfurada (prateleira)");
		        	comboBox_5.addItem("Suportes");
		        	comboBox_5.addItem("Em paredes");
		        	comboBox_5.addItem("Teto (Fixação direta)");


		        	break;
		        case "Embutida":
		        	comboBox_5.removeAllItems();
		        	comboBox_5.addItem(" ");
		        	comboBox_5.addItem("Eletroduto em parede termicamente isolante");
		        	comboBox_5.addItem("Caixilho de porta ou janela");
		        	comboBox_5.addItem("Eletroduto circular em alvenaria");
		        	comboBox_5.addItem("Moldura");
		        	break;
		        case "Espaço de construção":
		        	comboBox_5.addItem("Em eletroduto (Seção circular)");

		        	break;
		        case "Subterranea":
		        	comboBox_5.removeAllItems();
		        	comboBox_5.addItem(" ");
		        	comboBox_5.addItem("Canaleta Fechada");
		        	comboBox_5.addItem("Canaleta Ventilada");
		        	break;
		        case "Suspensa":
		        	comboBox_5.removeAllItems();
		        	comboBox_5.addItem(" ");
		        	comboBox_5.addItem("Eletrocalha ou perfilado");
		        	comboBox_5.addItem("Isoladores");
		        	break;
		         default:
		        	comboBox_5.removeAllItems();
		        	break;
		        	
		        }
		    }
		});
		label_6 = new JLabel("");
		comboBox_5.addActionListener(new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		        String caso = (String) comboBox_5.getSelectedItem();
		     //   System.out.println(caso);
		       
				
		        switch (caso){
		        case "Isoladores":
		        	 JFileChooser fc = new JFileChooser();
						int retorno = fc.showOpenDialog(null);
						if( retorno == JFileChooser.APPROVE_OPTION)
						{
							/*File arquivo = fc.
							.setText(arquivo.getAbsolutePath());
							BufferedImage imageBmp = null;
							try {
								imageBmp = ImageIO.read(arquivo);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							ImageIcon imagemLabel = new ImageIcon(imageBmp);
							label_6.setIcon(new ImageIcon(imagemLabel.getImage().getScaledInstance(lblimagem1.getWidth(), lblimagem1.getHeight(), Image.SCALE_DEFAULT)));*/
						}
		        		break;
		        default:
		        	break;
		        	
		        }
		    }
		});
		
		JButton btnOk = new JButton("Ok");
		
		JButton button_12 = new JButton("Anterior");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(--cont);
			}
		});
		
		JButton button_13 = new JButton("Proximo");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane_1.setSelectedIndex(++contInstalacao);
			}
		});
		
	
		
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSelecioneO)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnOk)
							.addGap(27)
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(button_12)
							.addGap(714)
							.addComponent(button_13))))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(38)
							.addComponent(lblSelecioneO)
							.addGap(12)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnOk))
							.addGap(51)
							.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(176)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(12)
									.addComponent(button_12))
								.addComponent(button_13)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(88)
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(359, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		tabbedPane_1.addTab("3.2", null, panel_1, null);
		
		button_10 = new JButton("Anterior");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane_1.setSelectedIndex(--contInstalacao);
			}
		});
		button_11 = new JButton("Proximo");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane_1.setSelectedIndex(++contInstalacao);
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(button_10)
					.addGap(678)
					.addComponent(button_11)
					.addGap(36))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(388)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_10)
						.addComponent(button_11))
					.addGap(95))
		);
		panel_1.setLayout(gl_panel_1);
		
		panel_2 = new JPanel();
		tabbedPane_1.addTab("3.3", null, panel_2, null);
		
		button_2 = new JButton("Proximo");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(++cont);
			}
		});
		
		button = new JButton("Anterior");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane_1.setSelectedIndex(--contInstalacao);
			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(23)
					.addComponent(button)
					.addPreferredGap(ComponentPlacement.RELATED, 674, Short.MAX_VALUE)
					.addComponent(button_2)
					.addGap(29))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(410)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_2))
					.addGap(302))
		);
		panel_2.setLayout(gl_panel_2);
		GroupLayout gl_painelMetodoDeInstalacao = new GroupLayout(painelMetodoDeInstalacao);
		gl_painelMetodoDeInstalacao.setHorizontalGroup(
			gl_painelMetodoDeInstalacao.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelMetodoDeInstalacao.createSequentialGroup()
					.addGap(12)
					.addComponent(tabbedPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_painelMetodoDeInstalacao.setVerticalGroup(
			gl_painelMetodoDeInstalacao.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelMetodoDeInstalacao.createSequentialGroup()
					.addGap(36)
					.addComponent(tabbedPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		painelMetodoDeInstalacao.setLayout(gl_painelMetodoDeInstalacao);
		
		painelThirdMethod = new JPanel();
		tabbedPane.addTab("New tab", null, painelThirdMethod, null);
		
		button_3 = new JButton("Proximo");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(++cont);
			}
		});
		button_6 = new JButton("Anterior");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(--cont);
			}
		});
		GroupLayout gl_painelThirdMethod = new GroupLayout(painelThirdMethod);
		gl_painelThirdMethod.setHorizontalGroup(
			gl_painelThirdMethod.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_painelThirdMethod.createSequentialGroup()
					.addGap(33)
					.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 740, Short.MAX_VALUE)
					.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(30))
		);
		gl_painelThirdMethod.setVerticalGroup(
			gl_painelThirdMethod.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_painelThirdMethod.createSequentialGroup()
					.addContainerGap(460, Short.MAX_VALUE)
					.addGroup(gl_painelThirdMethod.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_painelThirdMethod.createSequentialGroup()
							.addComponent(button_6)
							.addGap(315))
						.addGroup(Alignment.TRAILING, gl_painelThirdMethod.createSequentialGroup()
							.addComponent(button_3)
							.addGap(304))))
		);
		painelThirdMethod.setLayout(gl_painelThirdMethod);
		
		painelFourthMethod = new JPanel();
		tabbedPane.addTab("New tab", null, painelFourthMethod, null);
		
		button_4 = new JButton("Proximo");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(++cont);
			}
		});
		button_7 = new JButton("Anterior");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(--cont);
			}
		});
		GroupLayout gl_painelFourthMethod = new GroupLayout(painelFourthMethod);
		gl_painelFourthMethod.setHorizontalGroup(
			gl_painelFourthMethod.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_painelFourthMethod.createSequentialGroup()
					.addGap(22)
					.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(871, Short.MAX_VALUE))
				.addGroup(gl_painelFourthMethod.createSequentialGroup()
					.addContainerGap(816, Short.MAX_VALUE)
					.addComponent(button_4)
					.addGap(79))
		);
		gl_painelFourthMethod.setVerticalGroup(
			gl_painelFourthMethod.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_painelFourthMethod.createSequentialGroup()
					.addContainerGap(407, Short.MAX_VALUE)
					.addComponent(button_4)
					.addGap(18)
					.addComponent(button_7)
					.addGap(325))
		);
		painelFourthMethod.setLayout(gl_painelFourthMethod);
		
		panelFifthMethod = new JPanel();
		tabbedPane.addTab("New tab", null, panelFifthMethod, null);
		
		button_5 = new JButton("Proximo");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(++cont);
			}
		});
		button_8 = new JButton("Anterior");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(--cont);
			}
		});
		GroupLayout gl_panelFifthMethod = new GroupLayout(panelFifthMethod);
		gl_panelFifthMethod.setHorizontalGroup(
			gl_panelFifthMethod.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panelFifthMethod.createSequentialGroup()
					.addGap(25)
					.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 748, Short.MAX_VALUE)
					.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(30))
		);
		gl_panelFifthMethod.setVerticalGroup(
			gl_panelFifthMethod.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelFifthMethod.createSequentialGroup()
					.addContainerGap(455, Short.MAX_VALUE)
					.addGroup(gl_panelFifthMethod.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelFifthMethod.createSequentialGroup()
							.addComponent(button_8)
							.addGap(312))
						.addGroup(Alignment.TRAILING, gl_panelFifthMethod.createSequentialGroup()
							.addComponent(button_5)
							.addGap(320))))
		);
		panelFifthMethod.setLayout(gl_panelFifthMethod);
		contentPane.setLayout(gl_contentPane);
	}
}

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class WinPasseio implements ActionListener
{
	static WinCadPasseio winCadPasseio = new WinCadPasseio();
	static WinGestaoDeVeiculo winMain = new WinGestaoDeVeiculo();
	static WinPasseio win = new WinPasseio();
	static WinImpExcPasseio winImpExcPasseio = new WinImpExcPasseio();
	static WinCEPlacaPasseio winCEPlacaPasseio = new WinCEPlacaPasseio();

	static JFrame win1 = new JFrame();

	static JLabel rt1Cadastrar = new JLabel();
	static JLabel rt2Consultar = new JLabel();
	static JLabel rt3Imprimir = new JLabel();
	static JLabel rt4Sair = new JLabel();
	static JLabel rt5Null = new JLabel();
	static JLabel rt6Null = new JLabel();
	static JLabel rt7Null = new JLabel();
	static JLabel rt8Null = new JLabel();

	static JButton bt1Cadastrar = new JButton();
	static JButton bt2Consultar = new JButton();
	static JButton bt3Imprimir = new JButton();
	static JButton bt4Sair = new JButton();

	static Color blue = new Color(125, 201, 242);
	static Color red = new Color(212, 93, 79);
	static Color black = new Color(49, 49, 49);
	static Color write = new Color(201, 212, 202);

	static Font verdana = new Font("Verdana", Font.BOLD, 15);

	public void getPasseio()
	{
		setButtonInit();
		setRtInit();
		setWinInit();
	}

	public void setWinInit()
	{
		win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win1.getContentPane().setBackground(black);
		win1.setTitle("Veículos de Passeio");
		win1.setSize(320,230);
		win1.setVisible(true);
		win1.setLocationRelativeTo(null);
		win1.setLayout(null);

		win1.add(bt1Cadastrar);
		win1.add(rt1Cadastrar);
		win1.add(rt6Null);
		win1.add(bt2Consultar);
		win1.add(rt2Consultar);
		win1.add(rt7Null);
		win1.add(bt3Imprimir);
		win1.add(rt3Imprimir);
		win1.add(rt8Null);
		win1.add(bt4Sair);
		win1.add(rt4Sair);
	}

	public void setButtonInit()
	{
		bt1Cadastrar.setBackground(blue);
		bt1Cadastrar.setBounds(20, 20, 25, 25);
		bt2Consultar.setBackground(blue);
		bt2Consultar.setBounds(20, 60, 25, 25);
		bt3Imprimir.setBackground(blue);
		bt3Imprimir.setBounds(20, 100, 25, 25);
		bt4Sair.setBackground(red);
		bt4Sair.setBounds(20, 140, 25, 25);

		bt1Cadastrar.addActionListener(win);
		bt2Consultar.addActionListener(win);
		bt3Imprimir.addActionListener(win);
		bt4Sair.addActionListener(win);

	}

	public void setRtInit()
	{
		rt1Cadastrar.setText("Cadastrar");
		rt1Cadastrar.setBounds(55,20,110,25);
		rt1Cadastrar.setFont(verdana);
		rt1Cadastrar.setForeground(write);

		rt2Consultar.setText("Consultar/Excluir pela placa");
		rt2Consultar.setBounds(55,60,250,25);
		rt2Consultar.setFont(verdana);
		rt2Consultar.setForeground(write);

		rt3Imprimir.setText("Imprimir/Excluir todos");
		rt3Imprimir.setBounds(55,100,250,25);
		rt3Imprimir.setFont(verdana);
		rt3Imprimir.setForeground(write);

		rt4Sair.setText("Sair");
		rt4Sair.setBounds(55,140,80,25);
		rt4Sair.setFont(verdana);
		rt4Sair.setForeground(write);
	}

	public void actionPerformed(ActionEvent evt)
	{
		if (evt.getSource().equals(bt1Cadastrar))
		{
			System.out.println("- ok! Cadastrar :)!\n");
			//winCadPasseio.getCadPasseio();
			win1.setVisible(false);
		}
		if (evt.getSource().equals(bt2Consultar))
		{
			winCEPlacaPasseio.getCEPlacaPasseio();
			win1.setVisible(false);
		}
		if (evt.getSource().equals(bt3Imprimir))
		{
			winImpExcPasseio.getImpExcPasseio();
			win1.setVisible(false);
		}
		if (evt.getSource().equals(bt4Sair))
		{
			System.out.println("Sair\n");
			winMain.getGestaoVeic();
			win1.setVisible(false);
		}
	}



	// public void printAllPasseio()
	// {
	// 	int i;

	// 	System.out.println("\n  - Ok! - Imprimir Todos os Veículos" +
	// 		" de Passeio:");
	// 	for(i = 0; i < veiculo.getSizeListaPasseio(); i++)
	// 	{
	// 		printVeiculoPasseio(i, veiculo.getListaPasseio(i));
	// 	}

	// 	if (i == 0)
	// 	{
	// 		System.out.println("\n  - Hum! Não temos Veículos de Passeio a" +
	// 			" exibir!\n  - Por favor cadastre na opção 1.! :(\n\n\n");
	// 	}
	// 	else
	// 	{
	// 		System.out.println("\n  - Uhu! Todos Veículos de Passeio na" +
	// 		" tela ! ;)\n\n\n");
	// 	}
	// }

	// public void printVeiculoPasseio(int id, Passeio veiculoPasseio)
	// {
	// 	System.out.println("________________________________________________" +
	// 		"_____");
	// 	System.out.println("\tVeiculo de Passeio id [" + (id + 1) + "]\n");
	// 	System.out.println("\t - Placa: " + veiculoPasseio.getPlaca());
	// 	System.out.println("\t - Marca: " + veiculoPasseio.getMarca());
	// 	System.out.println("\t - Modelo: " + veiculoPasseio.getModelo());
	// 	System.out.println("\t - Cor: " + veiculoPasseio.getCor());
	// 	System.out.println("\t - Velocidade Maxíma: " +
	// 		 veiculoPasseio.getVelocMax() + " km/h");
	// 	System.out.println("\t - Quantidade de Rodas: "
	// 		+ veiculoPasseio.getQtdRodas());
	// 	System.out.println("\t - Quantidade de Pistão : "
	// 		+ veiculoPasseio.getMotor().getQtdPist());
	// 	System.out.println("\t - Potência: "
	// 		+ veiculoPasseio.getMotor().getPotencia() + " cv");
	// 	System.out.println("\t - Cal.Quantidade total de letras: "
	// 		+ veiculoPasseio.calcular());
	// 	System.out.println("\t - Cal. Velocidade Máxima: "
	// 		+ veiculoPasseio.calcVel(veiculoPasseio.getVelocMax()) + " M/h");
	// 	System.out.println("\t - Quantidade de Passageiros: "
	// 		+ veiculoPasseio.getQtdPassageiros());
	// 	System.out.println("_______________________________________________" +
	// 		"______\n");
	// }


}

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.Font;

public class WinCEPlacaPasseio implements ActionListener
{
	static WinCEPlacaPasseio win = new WinCEPlacaPasseio();
	static JFrame win1 = new JFrame();
	static WinPasseio winPasseio = new WinPasseio();


	static JLabel rt1QtdPassageiros = new JLabel();
	static JLabel rt2InformePlaca = new JLabel();
	static JLabel rt3Marca = new JLabel();
	static JLabel rt4Modelo = new JLabel();
	static JLabel rt5Cor = new JLabel();
	static JLabel rt6QtdRodas = new JLabel();
	static JLabel rt7VelocidadeMax = new JLabel();
	static JLabel rt8QtdPistoes = new JLabel();
	static JLabel rt9QtdPotencia = new JLabel();

	static JTextField cx1QtdPassageiros = new JTextField();
	static JTextField cx2Placa = new JTextField();
	static JTextField cx3Marca = new JTextField();
	static JTextField cx4Modelo = new JTextField();
	static JTextField cx5Cor = new JTextField();
	static JTextField cx6QtdRodas = new JTextField();
	static JTextField cx7VelocidadeMax = new JTextField();
	static JTextField cx8QtdPistoes = new JTextField();
	static JTextField cx9QtdPotencia = new JTextField();

	static JButton bt1Consultar = new JButton();
	static JButton bt2Excluir = new JButton();
	static JButton bt4Sair = new JButton();

	static Color green = new Color(79, 212, 159);
	static Color blue = new Color(125, 201, 242);
	static Color red = new Color(212, 93, 79);
	static Color black = new Color(49, 49, 49);
	static Color write = new Color(201, 212, 202);
	static Color gray = new Color(190, 190, 189);
	static Color grayBt = new Color(80,80,80);
	static Color orange = new Color(247,155,94);

	static Font verdana = new Font("Verdana", Font.PLAIN, 15);
	static Font verdanaTitle = new Font("Verdana", Font.BOLD, 15);
	static Font verdanaBotton = new Font("Verdana", Font.BOLD, 9);


	static BDVeiculos veiculo = new BDVeiculos();

	public void getCEPlacaPasseio()
	{
		setWinInit();
		setRtInit();
		setCxsInit();
		setButtonInit();

		win1.add(rt2InformePlaca);
		win1.add(cx2Placa);
		win1.add(rt1QtdPassageiros);
		win1.add(cx1QtdPassageiros);
		win1.add(rt3Marca);
		win1.add(cx3Marca);
		win1.add(rt4Modelo);
		win1.add(cx4Modelo);
		win1.add(rt5Cor);
		win1.add(cx5Cor);
		win1.add(rt6QtdRodas);
		win1.add(cx6QtdRodas);
		win1.add(rt7VelocidadeMax);
		win1.add(cx7VelocidadeMax);
		win1.add(rt8QtdPistoes);
		win1.add(cx8QtdPistoes);
		win1.add(rt9QtdPotencia);
		win1.add(cx9QtdPotencia);
		win1.add(bt1Consultar);
		win1.add(bt2Excluir);
		win1.add(bt4Sair);

		bt1Consultar.addActionListener(win);
		bt2Excluir.addActionListener(win);
		bt4Sair.addActionListener(win);
	}

	public void setWinInit()
	{
		win1.setTitle("Consulta/Excluir pela Placa");
		win1.getContentPane().setBackground(black);
		win1.setSize(440,500);
		win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win1.setLayout(null);
		win1.setVisible(true);
	}

	public void setButtonInit()
	{
		bt1Consultar.setText("Cadastrar");
		bt1Consultar.setBounds(20,390,90,40);
		bt1Consultar.setForeground(grayBt);
		bt1Consultar.setFont(verdanaBotton);
		bt1Consultar.setBackground(green);
		bt1Consultar.setVisible(false);

		bt2Excluir.setText("Limpar");
		bt2Excluir.setBounds(125,390,80,40);
		bt2Excluir.setForeground(grayBt);
		bt2Excluir.setFont(verdanaBotton);
		bt2Excluir.setBackground(orange);
		bt2Excluir.setVisible(false);

		bt4Sair.setText("Sair");
		bt4Sair.setBounds(310,390,80,40);
		bt4Sair.setForeground(grayBt);
		bt4Sair.setFont(verdanaBotton);
		bt4Sair.setBackground(red);
	}

	public void setCxsInit()
	{
		setColorCxs(black);
		setEditableCxs(false);
		setTextCxs(null);

		cx1QtdPassageiros.requestFocus();
		cx2Placa.setBounds(180,20,210,25);
		cx1QtdPassageiros.setBounds(180,60,210,25);
		cx3Marca.setBounds(180,100,210,25);
		cx4Modelo.setBounds(180,140,210,25);
		cx5Cor.setBounds(180,180,210,25);
		cx6QtdRodas.setBounds(180,220,210,25);
		cx7VelocidadeMax.setBounds(180,260,210,25);
		cx8QtdPistoes.setBounds(180,300,210,25);
		cx9QtdPotencia.setBounds(180,340,210,25);
	}

	public void setRtInit()
	{
		rt2InformePlaca.setText("Informe a Placa: ");
		rt2InformePlaca.setForeground(red);
		rt2InformePlaca.setFont(verdanaTitle);
		rt2InformePlaca.setBounds(20,20,150,25);

		rt1QtdPassageiros.setText("Qtd.Passageiros: ");
		rt1QtdPassageiros.setForeground(write);
		rt1QtdPassageiros.setFont(verdanaTitle);
		rt1QtdPassageiros.setBounds(20,60,150,25);

		rt3Marca.setText("Marca: ");
		rt3Marca.setForeground(write);
		rt3Marca.setFont(verdanaTitle);
		rt3Marca.setBounds(20,100,150,25);

		rt4Modelo.setText("Modelo: ");
		rt4Modelo.setForeground(write);
		rt4Modelo.setFont(verdanaTitle);
		rt4Modelo.setBounds(20,140,150,25);

		rt5Cor.setText("Cor: ");
		rt5Cor.setForeground(write);
		rt5Cor.setFont(verdanaTitle);
		rt5Cor.setBounds(20,180,150,25);

		rt6QtdRodas.setText("Qtd.Rodas: ");
		rt6QtdRodas.setForeground(write);
		rt6QtdRodas.setFont(verdanaTitle);
		rt6QtdRodas.setBounds(20,220,150,25);

		rt7VelocidadeMax.setText("Velocidade.Max: ");
		rt7VelocidadeMax.setForeground(write);
		rt7VelocidadeMax.setFont(verdanaTitle);
		rt7VelocidadeMax.setBounds(20,260,150,25);

		rt8QtdPistoes.setText("Pistões: ");
		rt8QtdPistoes.setForeground(write);
		rt8QtdPistoes.setFont(verdanaTitle);
		rt8QtdPistoes.setBounds(20,300,150,25);

		rt9QtdPotencia.setText("Potência: ");
		rt9QtdPotencia.setForeground(write);
		rt9QtdPotencia.setFont(verdanaTitle);
		rt9QtdPotencia.setBounds(20,340,150,25);
	}

	public void actionPerformed(ActionEvent evt)
	{
		if (evt.getSource().equals(bt1Consultar))
		{
			bt1ConsultarAct();
		}
		if (evt.getSource().equals(bt2Excluir))
		{
			bt2ExcluirAct();
		}
		if (evt.getSource().equals(bt4Sair))
		{
			winPasseio.getPasseio();
			win1.setVisible(false);
		}
	}

	public void bt1ConsultarAct()
	{
		if (checkValueCxs() == 1)
			return;
		else
		{
			if (cadPasseio() == 0)
			{
				bloCxsPasseioSuc();
				bt1Consultar.setVisible(false);
				bt2Excluir.setVisible(false);
			}
			else
			{
				cx2Placa.setBackground(red);
				cx2Placa.setText(null);
			}
		}
	}

	public void bt3NovoAct()
	{
		cx1QtdPassageiros.requestFocus();
		bt2ExcluirAct();
		setEditableCxs(true);
		bt1Consultar.setVisible(true);
		bt2Excluir.setVisible(true);
	}

	public void bt2ExcluirAct()
	{
		setColorCxs(gray);
		setTextCxs(null);
		cx1QtdPassageiros.requestFocus();
	}

	public int cadPasseio()
	{
		Passeio passeio = new Passeio();
		passeio = initPasseio(passeio);
		try
		{
			veiculo.setListaPasseio(passeio);
			JOptionPane.showMessageDialog(
				null,
				"Veiculo" +
				" ["+ veiculo.getSizeListaPasseio() +
				"] cadastrado com sucesso!",
				"Cadastro",
				JOptionPane.INFORMATION_MESSAGE
			);
			return(0);
		}
		catch(VeicExistException vee)
		{
			cx2Placa.requestFocus();
			JOptionPane.showMessageDialog(
				null,
				"Veiculo de placa " +
				cx2Placa.getText() +
				" Já existe no sistema!\n" +
				"\nVerifique a placa!",
				"Cadastro",
				JOptionPane.ERROR_MESSAGE
			);
			return(1);
		}
	}

	public Passeio initPasseio(Passeio passeio)
	{
		passeio.setMarca(cx1QtdPassageiros.getText());
		passeio.setModelo(cx4Modelo.getText());
		passeio.setCor(cx5Cor.getText());
		passeio.setPlaca(cx2Placa.getText());
		passeio.getMotor().setQtdPist(Integer.parseInt(cx8QtdPistoes.getText()));
		passeio.getMotor().setPotencia(Integer.parseInt(cx9QtdPotencia.getText()));
		try
		{
			passeio.setVelocMax(
				"passeio", Float.parseFloat(cx7VelocidadeMax.getText()));
		}
		catch(VelocException se)
		{
			JOptionPane.showMessageDialog(
				null,
				"Velocidade máxima ajustada\n" +
				"Para 100km/h conforme a regra!",
				"Cadastro",
				JOptionPane.INFORMATION_MESSAGE
			);
			cx7VelocidadeMax.setBackground(blue);
			cx7VelocidadeMax.setText("100");
		}
		passeio.setQtdRodas(Integer.parseInt(cx6QtdRodas.getText()));
		passeio.setQtdPassageiros(Integer.parseInt(cx1QtdPassageiros.getText()));
		return (passeio);
	}

	public int checkValueCxs()
	{
		setColorCxs(gray);
		if (checkParseIntAndNull(cx1QtdPassageiros) == 1)
			return(1);
		if (checkNullCxs(cx2Placa) == 1)
			return(1);
		if (checkNullCxs(cx3Marca) == 1)
			return(1);
		if (checkNullCxs(cx4Modelo) == 1)
			return(1);
		if (checkNullCxs(cx5Cor) == 1)
			return(1);
		if (checkParseIntAndNull(cx6QtdRodas) == 1)
			return(1);
		if (checkParseFloatAndNull(cx7VelocidadeMax) == 1)
			return(1);
		if (checkParseIntAndNull(cx8QtdPistoes) == 1)
			return(1);
		if (checkParseIntAndNull(cx9QtdPotencia) == 1)
			return(1);
		else
			return(0);
	}

	public int checkNullCxs(JTextField value)
	{
		value.requestFocus();
		if (value.getText().isEmpty())
		{
			value.setBackground(red);
			value.setText(null);
			JOptionPane.showMessageDialog(
				value,
				"Value null or invalid formact",
				"Error Value Invalid",
				0,
				null
			);
			return(1);
		}
		else
			return (0);
	}

	public int checkParseIntAndNull(JTextField value)
	{
		if(checkNullCxs(value) == 1)
			return(1);
		try
		{
			Integer.parseInt(value.getText());
			value.setBackground(gray);
			return (0);
		}
		catch (NumberFormatException nfe)
		{
			value.setBackground(red);
			value.setText(null);
			JOptionPane.showMessageDialog(
				value,
				"Valor inválido\n" +
				"Aceito somente inteiro no campo ex: 4!",
				"Erro Valor Inválido",
				0,
				null
				);
			return(1);
		}
	}

	public int checkParseFloatAndNull(JTextField value)
	{
		if(checkNullCxs(value) == 1)
			return(1);
		try
		{
			Float.parseFloat(value.getText());
			value.setBackground(gray);
		}
		catch (NumberFormatException nfe)
		{
			value.setBackground(red);
			value.setText(null);
			JOptionPane.showMessageDialog(
				value,
				"Valor inválido!\n" +
				"Aceito somente Float ex: 100.0!",
				"Erro Valor Inválido!",
				0,
				null
				);
			return(1);
		}
		return (0);
	}

	public void bloCxsPasseioSuc()
	{
		setEditableCxs(false);
		setColorCxs(green);
	}

	public void setTextCxs(String text)
	{
		cx1QtdPassageiros.setText(text);
		cx1QtdPassageiros.setFont(verdana);

		cx2Placa.setText(text);
		cx2Placa.setFont(verdana);

		cx3Marca.setText(text);
		cx3Marca.setFont(verdana);

		cx4Modelo.setText(text);
		cx4Modelo.setFont(verdana);

		cx5Cor.setText(text);
		cx5Cor.setFont(verdana);

		cx6QtdRodas.setText(text);
		cx6QtdRodas.setFont(verdana);

		cx7VelocidadeMax.setText(text);
		cx7VelocidadeMax.setFont(verdana);

		cx8QtdPistoes.setText(text);
		cx8QtdPistoes.setFont(verdana);

		cx9QtdPotencia.setText(text);
		cx9QtdPotencia.setFont(verdana);
	}

	public void setColorCxs(Color color)
	{
		cx1QtdPassageiros.setBackground(color);
		cx2Placa.setBackground(color);
		cx3Marca.setBackground(color);
		cx4Modelo.setBackground(color);
		cx5Cor.setBackground(color);
		cx6QtdRodas.setBackground(color);
		cx7VelocidadeMax.setBackground(color);
		cx8QtdPistoes.setBackground(color);
		cx9QtdPotencia.setBackground(color);
	}

	public void setEditableCxs(Boolean set)
	{
		cx1QtdPassageiros.setEditable(set);
		cx2Placa.setEditable(set);
		cx3Marca.setEditable(set);
		cx4Modelo.setEditable(set);
		cx5Cor.setEditable(set);
		cx6QtdRodas.setEditable(set);
		cx7VelocidadeMax.setEditable(set);
		cx8QtdPistoes.setEditable(set);
		cx9QtdPotencia.setEditable(set);
	}
}

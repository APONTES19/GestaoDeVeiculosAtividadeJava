import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.Font;

public class WinCadCarga implements ActionListener
{
	static WinCadCarga win = new WinCadCarga();
	static JFrame win1 = new JFrame();
	static WinCarga winCarga = new WinCarga();
	static ManutenirCarga manutenirCarga = new ManutenirCarga();


	static JLabel rt2Placa = new JLabel();
	static JLabel rt3Marca = new JLabel();
	static JLabel rt4Modelo = new JLabel();
	static JLabel rt5Cor = new JLabel();
	static JLabel rt6QtdRodas = new JLabel();
	static JLabel rt7VelocidadeMax = new JLabel();
	static JLabel rt8QtdPistoes = new JLabel();
	static JLabel rt9QtdPotencia = new JLabel();
	static JLabel rt10CargaMax = new JLabel();
	static JLabel rt11Tara = new JLabel();

	static JTextField cx2Placa = new JTextField();
	static JTextField cx3Marca = new JTextField();
	static JTextField cx4Modelo = new JTextField();
	static JTextField cx5Cor = new JTextField();
	static JTextField cx6QtdRodas = new JTextField();
	static JTextField cx7VelocidadeMax = new JTextField();
	static JTextField cx8QtdPistoes = new JTextField();
	static JTextField cx9QtdPotencia = new JTextField();
	static JTextField cx10CargaMax = new JTextField();
	static JTextField cx11Tara = new JTextField();



	static JButton bt1Cadastrar = new JButton();
	static JButton bt2Limpar = new JButton();
	static JButton bt3Novo = new JButton();
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
	private boolean io = false;

	public void getCadCarga()
	{
		setRtInit();
		setCxsInit();
		setButtonInit();
		setWinInit();
	}

	public void setWinInit()
	{
		win1.setTitle("Cadastro de Carga");
		win1.getContentPane().setBackground(black);
		win1.setSize(440,540);
		win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win1.setLayout(null);
		win1.setLocationRelativeTo(null);

		win1.setVisible(true);

		win1.add(rt2Placa);
		win1.add(cx2Placa);
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
		win1.add(rt10CargaMax);
		win1.add(cx10CargaMax);
		win1.add(rt11Tara);
		win1.add(cx11Tara);
		win1.add(bt1Cadastrar);
		win1.add(bt2Limpar);
		win1.add(bt3Novo);
		win1.add(bt4Sair);
	}

	public void setButtonInit()
	{
		bt1Cadastrar.setText("Cadastrar");
		bt1Cadastrar.setBounds(20,430,90,40);
		bt1Cadastrar.setForeground(grayBt);
		bt1Cadastrar.setFont(verdanaBotton);
		bt1Cadastrar.setBackground(blue);
		bt1Cadastrar.setVisible(false);

		bt2Limpar.setText("Limpar");
		bt2Limpar.setBounds(125,430,80,40);
		bt2Limpar.setForeground(grayBt);
		bt2Limpar.setFont(verdanaBotton);
		bt2Limpar.setBackground(orange);
		bt2Limpar.setVisible(false);

		bt3Novo.setText("Novo");
		bt3Novo.setBounds(220,430,80,40);
		bt3Novo.setForeground(grayBt);
		bt3Novo.setFont(verdanaBotton);
		bt3Novo.setBackground(green);
		bt3Novo.setVisible(true);

		bt4Sair.setText("Sair");
		bt4Sair.setBounds(310,430,80,40);
		bt4Sair.setForeground(grayBt);
		bt4Sair.setFont(verdanaBotton);
		bt4Sair.setBackground(red);

		if (!io)
		{
			bt1Cadastrar.addActionListener(win);
			bt2Limpar.addActionListener(win);
			bt3Novo.addActionListener(win);
			bt4Sair.addActionListener(win);
			io = true;
		}
	}

	public void setCxsInit()
	{
		setColorCxs(black);
		setEditableCxs(false);
		setTextCxs(null);

		cx10CargaMax.requestFocus();
		cx10CargaMax.setBounds(180,20,210,25);
		cx11Tara.setBounds(180,60,210,25);
		cx2Placa.setBounds(180,100,210,25);
		cx3Marca.setBounds(180,140,210,25);
		cx4Modelo.setBounds(180,180,210,25);
		cx5Cor.setBounds(180,220,210,25);
		cx6QtdRodas.setBounds(180,260,210,25);
		cx7VelocidadeMax.setBounds(180,300,210,25);
		cx8QtdPistoes.setBounds(180,340,210,25);
		cx9QtdPotencia.setBounds(180,380,210,25);

	}

	public void setTextCxs(String text)
	{
		cx10CargaMax.setText(text);
		cx10CargaMax.setFont(verdana);

		cx11Tara.setText(text);
		cx11Tara.setFont(verdana);

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
		cx10CargaMax.setBackground(color);
		cx11Tara.setBackground(color);
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
		cx10CargaMax.setEditable(set);
		cx11Tara.setEditable(set);
		cx2Placa.setEditable(set);
		cx3Marca.setEditable(set);
		cx4Modelo.setEditable(set);
		cx5Cor.setEditable(set);
		cx6QtdRodas.setEditable(set);
		cx7VelocidadeMax.setEditable(set);
		cx8QtdPistoes.setEditable(set);
		cx9QtdPotencia.setEditable(set);
	}

	public void setRtInit()
	{
		rt11Tara.setText("Carga Max.: ");
		rt11Tara.setForeground(write);
		rt11Tara.setFont(verdanaTitle);
		rt11Tara.setBounds(20,20,150,25);

		rt10CargaMax.setText("Tara: ");
		rt10CargaMax.setForeground(write);
		rt10CargaMax.setFont(verdanaTitle);
		rt10CargaMax.setBounds(20,60,150,25);

		rt2Placa.setText("Placa: ");
		rt2Placa.setForeground(write);
		rt2Placa.setFont(verdanaTitle);
		rt2Placa.setBounds(20,100,150,25);

		rt3Marca.setText("Marca: ");
		rt3Marca.setForeground(write);
		rt3Marca.setFont(verdanaTitle);
		rt3Marca.setBounds(20,140,150,25);

		rt4Modelo.setText("Modelo: ");
		rt4Modelo.setForeground(write);
		rt4Modelo.setFont(verdanaTitle);
		rt4Modelo.setBounds(20,180,150,25);

		rt5Cor.setText("Cor: ");
		rt5Cor.setForeground(write);
		rt5Cor.setFont(verdanaTitle);
		rt5Cor.setBounds(20,220,150,25);

		rt6QtdRodas.setText("Qtd.Rodas: ");
		rt6QtdRodas.setForeground(write);
		rt6QtdRodas.setFont(verdanaTitle);
		rt6QtdRodas.setBounds(20,260,150,25);

		rt7VelocidadeMax.setText("Velocidade Max.: ");
		rt7VelocidadeMax.setForeground(write);
		rt7VelocidadeMax.setFont(verdanaTitle);
		rt7VelocidadeMax.setBounds(20,300,150,25);

		rt8QtdPistoes.setText("Pistões: ");
		rt8QtdPistoes.setForeground(write);
		rt8QtdPistoes.setFont(verdanaTitle);
		rt8QtdPistoes.setBounds(20,340,150,25);

		rt9QtdPotencia.setText("Potência: ");
		rt9QtdPotencia.setForeground(write);
		rt9QtdPotencia.setFont(verdanaTitle);
		rt9QtdPotencia.setBounds(20,380,150,25);
	}

	public void actionPerformed(ActionEvent evt)
	{
		if (evt.getSource().equals(bt1Cadastrar))
		{
			bt1CadastrarAct();
		}
		if (evt.getSource().equals(bt2Limpar))
		{
			bt2LimparAct();
		}
		if (evt.getSource().equals(bt3Novo))
		{
			bt3NovoAct();
		}
		if (evt.getSource().equals(bt4Sair))
		{
			winCarga.getCarga();
			win1.dispose();
		}
	}

	public void bt1CadastrarAct()
	{
		if (checkValueCxs() == 1)
			return;
		else
		{

			if ( manutenirCarga.setCadCarga(
					cx3Marca.getText(),
					cx4Modelo.getText(),
					cx5Cor.getText(),
					cx2Placa.getText(),
					Integer.parseInt(cx8QtdPistoes.getText()),
					Integer.parseInt(cx9QtdPotencia.getText()),
					Float.parseFloat(cx7VelocidadeMax.getText()),
					Integer.parseInt(cx6QtdRodas.getText()),
					Integer.parseInt(cx10CargaMax.getText()),
					Integer.parseInt(cx11Tara.getText())
				) == 1)
			{
				bt1Cadastrar.setVisible(false);
				bt2Limpar.setVisible(false);
				bt3Novo.setVisible(true);
				setColorCxs(black);
				setEditableCxs(false);
			}
			else
			{
				JOptionPane.showMessageDialog(
					null,
					"  :( Ja existe um veiculo com esta placa!\n" +
					"		- por favor inicie um novo cadastro !",
					"Veiculo Duplicado",
					0
				);
			}
		}
	}

	public int checkValueCxs()
	{
		setColorCxs(gray);
		if (checkNullCxs(cx10CargaMax) == 1)
			return(1);
		if (checkNullCxs(cx11Tara) == 1)
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
				"Value Invalid\n" +
				"acept only interger ex: 4!",
				"Error Valeu invalid",
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
				"Valeu invalid!\n" +
				"Acept only Float ex: 100.0!",
				"Error Valeu Invalid!",
				0,
				null
				);
			return(1);
		}
		return (0);
	}

	public void bt3NovoAct()
	{
		bt3Novo.setVisible(false);
		cx10CargaMax.requestFocus();
		bt2LimparAct();
		setEditableCxs(true);
		bt1Cadastrar.setVisible(true);
		bt2Limpar.setVisible(true);
	}

	public void bt2LimparAct()
	{
		setColorCxs(gray);
		setTextCxs(null);
		cx10CargaMax.requestFocus();
	}
}

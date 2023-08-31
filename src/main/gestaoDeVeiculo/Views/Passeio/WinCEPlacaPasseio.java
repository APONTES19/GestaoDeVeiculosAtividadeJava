
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.concurrent.CancellationException;
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
	static ManutenirPasseio manutenirPasseio = new ManutenirPasseio();
	static Passeio passeio = new Passeio();


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
	private boolean io = false;

	public void getCEPlacaPasseio()
	{
		setRtInit();
		setCxsInit();
		setButtonInit();
		setWinInit();
	}

	public void setWinInit()
	{
		win1.setTitle("Consulta/Excluir pela Placa");
		win1.getContentPane().setBackground(black);
		win1.setSize(440,500);
		win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win1.setLayout(null);
		win1.setLocationRelativeTo(null);
		win1.setVisible(true);

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
	}

	public void setButtonInit()
	{
		bt1Consultar.setText("Consultar");
		bt1Consultar.setBounds(20,390,90,40);
		bt1Consultar.setForeground(grayBt);
		bt1Consultar.setFont(verdanaBotton);
		bt1Consultar.setBackground(blue);
		bt1Consultar.setVisible(true);

		bt2Excluir.setText("Excluir");
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

		if (!io)
		{
			bt1Consultar.addActionListener(win);
			bt2Excluir.addActionListener(win);
			bt4Sair.addActionListener(win);
			io = true;
		}
	}

	public void setCxsInit()
	{
		setTextCxs(null);
		setColorCxs(black);
		setEditableCxs(false);

		cx2Placa.setBackground(write);
		cx2Placa.setEditable(true);
		cx2Placa.requestFocus();

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

	public void setTextCxs(String text)
	{
		cx1QtdPassageiros.setText(text);
		cx1QtdPassageiros.setFont(verdana);
		cx1QtdPassageiros.setForeground(write);

		cx2Placa.setText(text);
		cx2Placa.setFont(verdana);

		cx3Marca.setText(text);
		cx3Marca.setFont(verdana);
		cx3Marca.setForeground(write);

		cx4Modelo.setText(text);
		cx4Modelo.setFont(verdana);
		cx4Modelo.setForeground(write);

		cx5Cor.setText(text);
		cx5Cor.setFont(verdana);
		cx5Cor.setForeground(write);

		cx6QtdRodas.setText(text);
		cx6QtdRodas.setFont(verdana);
		cx6QtdRodas.setForeground(write);

		cx7VelocidadeMax.setText(text);
		cx7VelocidadeMax.setFont(verdana);
		cx7VelocidadeMax.setForeground(write);

		cx8QtdPistoes.setText(text);
		cx8QtdPistoes.setFont(verdana);
		cx8QtdPistoes.setForeground(write);

		cx9QtdPotencia.setText(text);
		cx9QtdPotencia.setFont(verdana);
		cx9QtdPotencia.setForeground(write);
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
			win1.dispose();
		}
	}

	public void bt1ConsultarAct()
	{
		if (checkNullCxs(cx2Placa) == 1)
			return;
		else
		{
			passeio = manutenirPasseio.pesqPlacaPasseio(cx2Placa.getText());
			if (passeio == null)
			{
					JOptionPane.showMessageDialog(
							null,
							"Placa não encontrado!",
							"Veiculo Não Encontrado",
							0
						);
				setColorCxs(black);
				cx2Placa.setBackground(gray);
				setTextCxs(null);
			}
			else
			{
				setColorCxs(grayBt);
				cx2Placa.setBackground(gray);
				bt2Excluir.setVisible(true);

				cx1QtdPassageiros.setText(
					String.valueOf(passeio.getQtdPassageiros()));
				cx2Placa.setText(passeio.getPlaca());
				cx3Marca.setText(passeio.getMarca());
				cx4Modelo.setText(passeio.getModelo());
				cx5Cor.setText(passeio.getCor());
				cx6QtdRodas.setText(String.valueOf(passeio.getQtdRodas()));
				cx7VelocidadeMax.setText(String.valueOf(passeio.getVelocMax()));
				cx8QtdPistoes.setText(
					String.valueOf(passeio.getMotor().getQtdPist()));
				cx9QtdPotencia.setText(
					String.valueOf(passeio.getMotor().getPotencia()));
			}
		}
	}

	public int checkNullCxs(JTextField value)
	{
		value.requestFocus();
		if (value.getText().isEmpty())
		{
			value.setBackground(red);
			JOptionPane.showMessageDialog(
				value,
				"Value null or invalid!",
				"Error value null or invalid",
				0,
				null
			);
			return(1);
		}
		else
			return (0);
	}

	public void bt2ExcluirAct()
	{

		if (checkNullCxs(cx1QtdPassageiros) == 1)
		{
			cx1QtdPassageiros.setBackground(black);
			bt2Excluir.setVisible(false);
			return;
		}
		else
		{
			if( manutenirPasseio.excluirPlacaPasseio(cx2Placa.getText()) == 1 )
			{
				JOptionPane.showMessageDialog(
					null,
					"Veiculo Excluido com sucesso!",
					"Veiculo Excluido",
					1
				);
				setColorCxs(black);
				setTextCxs(null);
				setEditableCxs(false);
				cx2Placa.setBackground(write);
				cx2Placa.setEditable(true);
				cx2Placa.requestFocus();
			}
			else
			{
				JOptionPane.showMessageDialog(
					null,
					"Error ao Excluir Veiculo!",
					"Erro ao Excluir",
					0
				);
			}
		}
	}
}

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.BadBinaryOpValueExpException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class WinImpExcPasseio implements ActionListener
{
	static WinImpExcPasseio win = new WinImpExcPasseio();
	static JFrame win1 = new JFrame();
	static WinPasseio winPasseio = new WinPasseio();

	static JButton bt1ImpTodos = new JButton();
	static JButton bt2ExcTodos = new JButton();
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
	static Font verdanaBotton = new Font("Verdana", Font.BOLD, 12);
	private boolean io = false;


	//novos experimentos
	static JTable table;
	static JScrollPane scrollPane;
	static DefaultTableModel model = new DefaultTableModel();
	static ManutenirPasseio manutenirPasseio = new ManutenirPasseio();
	static Passeio passeio = new Passeio();

	public void getImpExcPasseio()
	{
		setTableInit();
		setWinInit();
		setButtonInit();
	}

	public void setWinInit()
	{
		win1.setTitle("Imprimir / Excluir todos");
		win1.getContentPane().setBackground(grayBt);
		win1.setSize(720,500);
		win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win1.setLayout(null);
		win1.setLocationRelativeTo(null);

		win1.add(bt1ImpTodos);
		win1.add(bt2ExcTodos);
		win1.add(bt4Sair);

		//win1.setLayout(new BorderLayout());
		win1.add(scrollPane); //, BorderLayout.CENTER);

		win1.setVisible(true);
	}

	public void setTableInit()
	{
		if (!io)
		{
			model.addColumn("Placa");
			model.addColumn("Marca");
			model.addColumn("Modelo");
			model.addColumn("Cor");
			model.addColumn("Qtd. Rodas");
			model.addColumn("Veloc Máx");
			model.addColumn("Qtd. Pist");
			model.addColumn("Potência");
			model.addColumn("Qtd. Passag");

			table = new JTable(model);
			table.setPreferredScrollableViewportSize(
				new Dimension(580, 300));
				table.setRowHeight(31);

			scrollPane = new JScrollPane(table);
			scrollPane.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			scrollPane.setBounds(20, 20, 660, 360);
		}

	}


	public void setButtonInit()
	{
		bt1ImpTodos.setText("Imprimir Todos");
		bt1ImpTodos.setBounds(280,400,150,40);
		bt1ImpTodos.setForeground(grayBt);
		bt1ImpTodos.setFont(verdanaBotton);
		bt1ImpTodos.setBackground(green);
		bt1ImpTodos.setVisible(true);

		bt2ExcTodos.setText("Excluir Todos");
		bt2ExcTodos.setBounds(440,400,150,40);
		bt2ExcTodos.setForeground(grayBt);
		bt2ExcTodos.setFont(verdanaBotton);
		bt2ExcTodos.setBackground(orange);
		bt2ExcTodos.setVisible(true);

		bt4Sair.setText("Sair");
		bt4Sair.setBounds(600,400,80,40);
		bt4Sair.setForeground(grayBt);
		bt4Sair.setFont(verdanaBotton);
		bt4Sair.setBackground(red);

		if (!io)
		{
			bt1ImpTodos.addActionListener(win);
			bt2ExcTodos.addActionListener(win);
			bt4Sair.addActionListener(win);
			io = true;
		}
	}

	public void actionPerformed(ActionEvent evt)
	{
		if (evt.getSource().equals(bt1ImpTodos))
		{
			bt1ImpTodosAct();
		}
		if (evt.getSource().equals(bt2ExcTodos))
		{
			bt2ExcTodosAct();
		}
		if (evt.getSource().equals(bt4Sair))
		{
			bt4SairAct();
		}
	}

	public void bt4SairAct()
	{
		model.setRowCount(0);
		winPasseio.getPasseio();
		win1.dispose();
	}

	public void bt1ImpTodosAct()
	{
		if(manutenirPasseio.veiculo.getSizeListaPasseio() == 0)
		{
			JOptionPane.showMessageDialog(
				null,
				"Não há Veículos Cadastrados!\n",
				"Erro sem veiculos!",
				0
			);
			bt4SairAct();
		}
		else
		{
			for(int i = 0; i < manutenirPasseio.veiculo.getSizeListaPasseio(); i++)
			{
				passeio = manutenirPasseio.veiculo.getListaPasseio(i);
				insetPasseioTable(passeio);
			}
			model.fireTableDataChanged();
			bt1ImpTodos.setVisible(false);
		}
	}

	public void insetPasseioTable(Passeio passeio)
	{
		model.addRow(new Object[]{
			passeio.getPlaca(),
			passeio.getMarca(),
			passeio.getModelo(),
			passeio.getCor(),
			passeio.getQtdRodas(),
			passeio.getVelocMax(),
			passeio.getMotor().getQtdPist(),
			passeio.getMotor().getPotencia(),
			passeio.getQtdPassageiros()
		});
	}

	public void bt2ExcTodosAct()
	{
		int sizeList = manutenirPasseio.veiculo.getSizeListaPasseio();

		if (sizeList == 0)
		{
			JOptionPane.showMessageDialog(
				null,
				"Não há Veículos Cadastrados!\n",
				"Erro sem veiculos!",
				0
			);
		}
		else
		{
			for(int i = 0; i < sizeList; i++)
			{
				System.out.println("valor de i:" + i );
				manutenirPasseio.veiculo.excluirCadPasseio(0);
			}
			JOptionPane.showMessageDialog(
				null,
				"  Veiculos Excluidos com Sucesso!\n",
				"Veiculos Excluidos",
				0
			);
		}
		bt4SairAct();

	}
}

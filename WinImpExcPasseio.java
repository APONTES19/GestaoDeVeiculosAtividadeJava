import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.JTable;

public class WinImpExcPasseio implements ActionListener
{
	static WinCadPasseio win = new WinCadPasseio();
	static JFrame win1 = new JFrame();
	static WinCadPasseio winPasseio = new WinCadPasseio();

	static TableModel dataModel = new AbstractTableModel() {
		public int getColumnCount() { return 10; }
		public int getRowCount() { return 10;}
		public Object getValueAt(int row, int col)
		{ return (row*col); }
	};
	static JTable table = new JTable(dataModel);
	static JScrollPane scrollpane = new JScrollPane(table);

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

	public void getImpExcPasseio()
	{
		setWinInit();
		setButtonInit();

		win1.add(table);
		win1.add(bt1ImpTodos);
		win1.add(bt2ExcTodos);
		win1.add(bt4Sair);
	}

	public void setWinInit()
	{
		win1.setTitle("Imprimir / Excluir todos");
		win1.getContentPane().setBackground(write);
		win1.setSize(600,400);
		win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win1.setLayout(null);
		win1.setVisible(true);
	}

	public void setButtonInit()
	{
		bt1ImpTodos.setText("Imprimir Todos");
		bt1ImpTodos.setBounds(150,300,150,40);
		bt1ImpTodos.setForeground(grayBt);
		bt1ImpTodos.setFont(verdanaBotton);
		bt1ImpTodos.setBackground(green);
		bt1ImpTodos.setVisible(true);

		bt2ExcTodos.setText("Excluir Todos");
		bt2ExcTodos.setBounds(310,300,150,40);
		bt2ExcTodos.setForeground(grayBt);
		bt2ExcTodos.setFont(verdanaBotton);
		bt2ExcTodos.setBackground(orange);
		bt2ExcTodos.setVisible(true);

		bt4Sair.setText("Sair");
		bt4Sair.setBounds(470,300,80,40);
		bt4Sair.setForeground(grayBt);
		bt4Sair.setFont(verdanaBotton);
		bt4Sair.setBackground(red);
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
			winPasseio.getCadPasseio();
			win1.setVisible(false);
		}
	}

	public void bt1ImpTodosAct()
	{
		System.out.println("isso\n");
	}

	public void bt2ExcTodosAct()
	{
		System.out.println("isso\n");
	}
}

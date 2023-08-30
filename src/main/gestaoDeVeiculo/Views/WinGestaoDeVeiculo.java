import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class WinGestaoDeVeiculo implements ActionListener
{
	static JLabel rt1Passeio = new JLabel();
	static JLabel rt2Carga = new JLabel();
	static JButton bt1Passeio = new JButton();
	static JButton bt2Carga = new JButton();

	static Color green = new Color(79, 212, 159);
	static Color blue = new Color(125, 201, 242);
	static Color black = new Color(49, 49, 49);
	static Color write = new Color(201, 212, 202);

	static Font verdana = new Font("Verdana", Font.BOLD, 15);

	static JFrame win1 = new JFrame();
	static WinGestaoDeVeiculo win = new WinGestaoDeVeiculo();
	static WinPasseio winPasseio = new WinPasseio();
	private boolean io = false;
	//static WinCarga winCarga = new WinCarga();


	public void getGestaoVeic()
	{
		setButtonInit();
		setRtInit();
		setWinInit();
	}

	public void setRtInit()
	{
		rt1Passeio.setText("Passeio");
		rt1Passeio.setForeground(write);
		rt1Passeio.setFont(verdana);
		rt1Passeio.setBounds(90, 30, 80, 30);
		rt2Carga.setText("Carga");
		rt2Carga.setForeground(write);
		rt2Carga.setFont(verdana);
		rt2Carga.setBounds(90, 80, 50, 30);
	}

	public void setButtonInit()
	{
		bt1Passeio.setBackground(blue);
		bt1Passeio.setBounds(50, 30, 30, 30);
		bt2Carga.setBackground(green);
		bt2Carga.setBounds(50, 80, 30, 30);

		if (!io)
		{
			bt1Passeio.addActionListener(win);
			bt2Carga.addActionListener(win);
			io = true;
		}

	}

	public void setWinInit()
	{
		win1.setTitle("Gestão de veículos");
		win1.getContentPane().setBackground(black);
		win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win1.setSize(290,180);
		win1.setVisible(true);
		win1.setLayout(null);
		win1.setLocationRelativeTo(null);
		win1.add(bt1Passeio);
		win1.add(rt1Passeio);
		win1.add(bt2Carga);
		win1.add(rt2Carga);
	}

    public void actionPerformed(ActionEvent evt)
    {
        if (evt.getSource().equals(bt1Passeio))
        {
         	winPasseio.getPasseio();
            win1.dispose();
        }
        if (evt.getSource().equals(bt2Carga))
        {
            //winCarga.getCarga();
            win1.dispose();
        }
    }
}

public abstract class Veiculo
{
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private float velocMax;
	private int qtdRodas;
	private Motor motor;

	public Veiculo()
	{
		placa = " ";
		marca = " ";
		modelo = " ";
		cor = " ";
		velocMax = 0;
		qtdRodas = 0;
		motor = new Motor();
	}

	public String getPlaca()
	{
		return placa;
	}

	public String getMarca()
	{
		return marca;
	}

	public String getModelo()
	{
		return modelo;
	}

	public String getCor()
	{
		return cor;
	}

	public float getVelocMax()
	{
		return velocMax;
	}

	public int getQtdRodas()
	{
		return qtdRodas;
	}

	public Motor getMotor()
	{
		return motor;
	}

	final public void setPlaca(String placa)
	{
		this.placa = placa;
	}

	final public void setMarca(String marca)
	{
		this.marca = marca;
	}

	final public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	final public void setCor(String cor)
	{
		this.cor = cor;
	}

	final public void setVelocMax(String tipo, float velocMax) throws	VelocException
	{
		int	defVelocMin = 80;
		int	defVelocMax = 110;

		if (velocMax < defVelocMin || velocMax > defVelocMax)
		{
			if (tipo.equals("passeio"))
				this.velocMax = 100;
			else
				this.velocMax = 90;
			throw	new VelocException();
		}
		else
			this.velocMax = velocMax;
	}

	final public void setQtdRodas(int qtdRodas)
	{
		this.qtdRodas = qtdRodas;
	}

	final public void setMotor(Motor motor)
	{
		this.motor = motor;
	}

	public abstract float calcVel(float velocMax);
}

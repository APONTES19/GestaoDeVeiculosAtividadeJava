final public class Carga extends Veiculo implements Calcular
{
	private int cargaMax;
	private int tara;

	public Carga()
	{
		cargaMax = 0;
		tara = 0;
	}

	final public int getCargaMax()
	{
		return cargaMax;
	}

	final public int getTara()
	{
		return tara;
	}

	final public void setCargaMax(int cargaMax)
	{
		this.cargaMax = cargaMax;
	}

	final public void setTara(int tara)
	{
		this.tara = tara;
	}

	final public float calcVel(float velocMax)
	{
		return super.getVelocMax() * 100000;
	}

	final public int calcular()
	{
		int	somaNumber;

		somaNumber = 0;
		somaNumber += getMotor().getQtdPist();
		somaNumber += getMotor().getPotencia();
		somaNumber += getVelocMax();
		somaNumber += getQtdRodas();
		somaNumber += getCargaMax();
		somaNumber += getTara();

		return (somaNumber);
	}
}

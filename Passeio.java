final public class Passeio extends Veiculo implements Calcular
{
	private int qtdPassageiros;

	public Passeio()
	{
		qtdPassageiros = 0;
	}

	final public int getQtdPassageiros()
	{
		return qtdPassageiros;
	}

	final public void setQtdPassageiros(int qtdPassageiros)
	{
		this.qtdPassageiros = qtdPassageiros;
	}

	final public float calcVel(float velocMax)
	{
		return super.getVelocMax() * 1000;
	}

	final public int calcular()
	{
		int somaStrings = 0;

		somaStrings += getPlaca().length();
		somaStrings += getMarca().length();
		somaStrings += getModelo().length();
		somaStrings += getCor().length();
		return (somaStrings);
	}
}

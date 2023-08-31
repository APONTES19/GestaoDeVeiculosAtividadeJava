public class ManutenirPasseio {

	static BDVeiculos veiculo = new BDVeiculos();

	public static int setCadPasseio(
		String marca,
		String modelo,
		String cor,
		String placa,
		int pistao,
		int potencia,
		float velocMax,
		int qntRodas,
		int qntPassageiros
	)
	{
		Passeio passeio = new Passeio();
		passeio = initPasseio(
				passeio,
				marca,
				modelo,
				cor,
				placa,
				pistao,
				potencia,
				velocMax,
				qntRodas,
				qntPassageiros
			);
		try
		{
			veiculo.setListaPasseio(passeio);
			return(1);
		}
		catch(VeicExistException vee)
		{
			return(0);
		}
	}

	public static Passeio initPasseio(
		Passeio passeio,
		String marca,
		String modelo,
		String cor,
		String placa,
		int pistao,
		int potencia,
		float velocMax,
		int qntRodas,
		int qntPassageiros
	)
	{
		passeio.setMarca(marca);
		passeio.setModelo(modelo);
		passeio.setCor(cor);
		passeio.setPlaca(placa);
		passeio.getMotor().setQtdPist(pistao);
		passeio.getMotor().setPotencia(potencia);
		try
		{
			passeio.setVelocMax("passeio", velocMax);
		}
		catch(VelocException se)
		{
			System.out.println("\n\t- velocidade máxima ajustada "
			+ "para 100 km/h conforme regras !");
		}
		passeio.setQtdRodas(qntRodas);
		passeio.setQtdPassageiros(qntPassageiros);
		return (passeio);
	}

	public static Passeio pesqPlacaPasseio(String placa)
	{
		for(int i = 0; i < veiculo.getSizeListaPasseio(); i++)
		{
			if(veiculo.getListaPasseio(i).getPlaca().equals(placa))
				return(veiculo.getListaPasseio(i));
		}
		System.out.println("\t 🔴 Placa não encontrada ! :(\n");
		return(null);
	}

	public static int excluirPlacaPasseio(String placa)
	{
		for(int i = 0; i < veiculo.getSizeListaPasseio(); i++)
		{
			if(veiculo.getListaPasseio(i).getPlaca().equals(placa))
			{
				veiculo.excluirCadPasseio(i);
				return(1);
			}
		}
		System.out.println("\t 🔴 Placa não encontrada ! :(\n");
		return(0);
	}
}

public class ManutenirCarga {

	static BDVeiculos veiculo = new BDVeiculos();

	public static int setCadCarga(
		String marca,
		String modelo,
		String cor,
		String placa,
		int pistao,
		int potencia,
		float velocMax,
		int qntRodas,
		int cargaMax,
		int tara
	)
	{
		Carga carga = new Carga();
		carga = initCarga(
				carga,
				marca,
				modelo,
				cor,
				placa,
				pistao,
				potencia,
				velocMax,
				qntRodas,
				cargaMax,
				tara
			);
		try
		{
			veiculo.setListaCarga(carga);
			return(1);
		}
		catch(VeicExistException vee)
		{
			return(0);
		}
	}

	public static Carga initCarga(
		Carga carga,
		String marca,
		String modelo,
		String cor,
		String placa,
		int pistao,
		int potencia,
		float velocMax,
		int qntRodas,
		int cargaMax,
		int tara
	)
	{
		carga.setMarca(marca);
		carga.setModelo(modelo);
		carga.setCor(cor);
		carga.setPlaca(placa);
		carga.getMotor().setQtdPist(pistao);
		carga.getMotor().setPotencia(potencia);
		try
		{
			carga.setVelocMax("Carga", velocMax);
		}
		catch(VelocException se)
		{
			System.out.println("\n\t- velocidade máxima ajustada "
			+ "para 100 km/h conforme regras !");
		}
		carga.setQtdRodas(qntRodas);
		carga.setCargaMax(cargaMax);
		carga.setTara(tara);
		return (carga);
	}

	public static Carga pesqPlacaCarga(String placa)
	{
		for(int i = 0; i < veiculo.getSizeListaCarga(); i++)
		{
			if(veiculo.getListaCarga(i).getPlaca().equals(placa))
				return(veiculo.getListaCarga(i));
		}
		System.out.println("\t 🔴 Placa não encontrada ! :(\n");
		return(null);
	}

	public static int excluirPlacaCarga(String placa)
	{
		for(int i = 0; i < veiculo.getSizeListaCarga(); i++)
		{
			if(veiculo.getListaCarga(i).getPlaca().equals(placa))
			{
				veiculo.excluirCadCarga(i);
				return(1);
			}
		}
		System.out.println("\t 🔴 Placa não encontrada ! :(\n");
		return(0);
	}
}

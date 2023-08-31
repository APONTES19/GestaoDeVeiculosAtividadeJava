public class Teste
{

	private static WinGestaoDeVeiculo winMain = new WinGestaoDeVeiculo();

	public static void main(String arg[])
	{
		winMain.getGestaoVeic();
	}

//passeio
// 	public static int pesqPlacaPasseio()
// 	{
// 		String tecPlaca;
// 		int	j = 0;

// 		tecPlaca = getValueStr("\n\t Me informe a Placa por favor!: ");
// 		for(int i = 0; i < veiculo.getSizeListaPasseio(); i++)
// 		{
// 			if(veiculo.getListaPasseio(i).getPlaca().equals(tecPlaca))
// 			{
// 				j++;
// 				return(i);
// 			}
// 		}
// 		if (j == 0)
// 			System.out.println("\t 🔴 Placa não encontrada ! :(\n");
// 		return(-1);
// 	}

// 	public static void printPasseioPlaca()
// 	{
// 		int i;

// 		System.out.println("\n  Ok! - Imprimir Veículo de Passeio" +
// 		" pela Placa:");
// 		i = pesqPlacaPasseio();
// 		if(i >= 0)
// 		{
// 			printVeiculoPasseio(i, veiculo.getListaPasseio(i));
// 			System.out.println("\n\tOk, Veículo na tela! :)\n\n");
// 		}
// 	}

// 	public static void excluirVeicPasseio()
// 	{
// 		int i;

// 		System.out.println("\n  Ok! - Excluir Veículo de Passeio pela Placa");
// 		i = pesqPlacaPasseio();
// 		if (i >= 0)
// 			veiculo.excluirCadPasseio(i);
// 	}

// //Carga
// public static void cadCarga()
// {
// 	String s = "";

// 	Carga carga = new Carga();
// 	System.out.println("\n  - Ok! Cadastre um Veículo de Carga:");
// 	carga = initCarga(carga);
// 	try
// 	{
// 		veiculo.setListaCarga(carga);
// 		System.out.println("\n  - Ok! Veiculo" +
// 			" ["+ veiculo.getSizeListaCarga() +
// 			"] Cadastrado com sucesso ! :)\n\n");
// 	}
// 	catch(VeicExistException vee)
// 	{
// 		return;
// 	}
// 	while(!s.equalsIgnoreCase("SIM"))
// 	{
// 		s = getValueStr("  -Vamos iniciar um novo cadastro" +
// 			" de Veículo de Carga ? (SIM/NÃO): ");
// 		if (s.equalsIgnoreCase("SIM"))
// 		{
// 			cadCarga();
// 			break;
// 		}
// 		else if (s.equalsIgnoreCase("NÃO"))
// 			break;
// 	}
// }

// public static Carga initCarga(Carga carga)
// {
// 	carga.setMarca(getValueStr("\n\tMarca: "));
// 	carga.setModelo(getValueStr("\n\tModelo: "));
// 	carga.setCor(getValueStr("\n\tCor: "));
// 	carga.setPlaca(getValueStr("\n\tPlaca: "));
// 	carga.getMotor().setQtdPist(getValueInt("\n\tQuantidade de Pistão: "));
// 	carga.getMotor().setPotencia(getValueInt("\n\tPotência: "));
// 	try
// 	{
// 		carga.setVelocMax("carga",
// 			getValueInt("\n\tVelocidade Maxíma: "));
// 	}
// 	catch(VelocException se)
// 	{
// 		System.out.println("\n\t- velocidade máxima ajustada "
// 		+ "para 90 km/h conforme regras !");
// 	}
// 	carga.setQtdRodas(getValueInt("\n\tQuantidade de Rodas: "));
// 	carga.setCargaMax(getValueInt("\n\tCarga Maxíma: "));
// 	carga.setTara(getValueInt("\n\tTara: "));
// 	return (carga);
// }

// public static void printAllCarga()
// {
// 	int i;

// 	System.out.println("\n  - Ok! - Imprimir Todos os Veículos" +
// 		" de Carga:");
// 	for(i = 0; i < veiculo.getSizeListaCarga(); i++)
// 	{
// 		printVeiculoCarga(i, veiculo.getListaCarga(i));
// 	}

// 	if (i == 0)
// 	{
// 		System.out.println("\n  - Hum! Não temos Veículos de Carga a" +
// 			" exibir!\n  - Por favor cadastre na opção 2.! :(\n\n\n");
// 	}
// 	else
// 	{
// 		System.out.println("\n  - Uhu! Todos Veículos de Carga na" +
// 		" tela ! ;)\n\n\n");
// 	}
// }

// public static void printVeiculoCarga(int id, Carga veiculoCarga)
// {
// 	System.out.println("__________________________________________" +
// 		"___________");
// 	System.out.println("\tVeiculo de Carga id [" + (id + 1) + "]\n");
// 	System.out.println("\t - Placa: " + veiculoCarga.getPlaca());
// 	System.out.println("\t - Marca: " + veiculoCarga.getMarca());
// 	System.out.println("\t - Modelo: " + veiculoCarga.getModelo());
// 	System.out.println("\t - Cor: " + veiculoCarga.getCor());
// 	System.out.println("\t - Velocidade Maxíma: "
// 		+ veiculoCarga.getVelocMax() + " km/h");
// 	System.out.println("\t - Quantidade de Rodas: "
// 	+ veiculoCarga.getQtdRodas());
// 	System.out.println("\t - Quantidade de Pistão : "
// 	+ veiculoCarga.getMotor().getQtdPist());
// 	System.out.println("\t - Potência: "
// 	+ veiculoCarga.getMotor().getPotencia() + " cv");
// 	System.out.println("\t - Cal.Soma de valores númericos: "
// 		+veiculoCarga.calcular());
// 	System.out.println("\t - Cal.Velocidade Máxima: " +
// 		veiculoCarga.calcVel(veiculoCarga.getVelocMax()) + " Cm/h");
// 	System.out.println("\t - Carga Maxíma "
// 		+ veiculoCarga.getCargaMax());
// 	System.out.println("\t - Tara " + veiculoCarga.getTara());
// 	System.out.println("________________________________________" +
// 		"_____________\n");
// }

// public static int pesqPlacaCarga()
// {
// 	String tecPlaca;
// 	int	j = 0;

// 	tecPlaca = getValueStr("\n\t Me informe a Placa por favor!: ");
// 	for(int i = 0; i < veiculo.getSizeListaCarga(); i++)
// 	{
// 		if(veiculo.getListaCarga(i).getPlaca().equals(tecPlaca))
// 		{
// 			j++;
// 			return(i);
// 		}
// 	}
// 	if (j == 0)
// 		System.out.println("\t 🔴 Placa não encontrada ! :(\n");
// 	return(-1);
// }

// public static void printCargaPlaca()
// {
// 	int i;

// 	System.out.println("\n  Ok! - Imprimir Veículo de Carga" +
// 	" pela Placa:");
// 	i = pesqPlacaCarga();
// 	if(i >= 0)
// 	{
// 		printVeiculoCarga(i, veiculo.getListaCarga(i));
// 		System.out.println("\n\tOk, Veículo na tela! :)\n\n");
// 	}
// }

// public static void excluirVeicCarga()
// {
// 	int i;

// 	System.out.println("\n  Ok! - Excluir Veículo de Carga pela Placa");
// 	i = pesqPlacaCarga();
// 	if (i >= 0)
// 		veiculo.excluirCadCarga(i);
// }
}

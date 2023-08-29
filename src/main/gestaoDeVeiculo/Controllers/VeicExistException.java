public class VeicExistException extends Exception
{
	public VeicExistException()
	{
		System.out.println("\n\t 🔴 :(" +
		" Já existe um veículo com esta placa\n" +
		"\t  - por favor inicie um novo cadastro !\n");
	}
}

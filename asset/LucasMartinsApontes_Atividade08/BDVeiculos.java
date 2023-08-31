import java.util.List;
import java.util.ArrayList;

public class BDVeiculos
{
	private List<Passeio> listaPasseio ;
	private List<Carga> listaCarga;

	public BDVeiculos()
	{
		listaPasseio = new ArrayList<Passeio>();
		listaCarga = new ArrayList<Carga>();
	}

	public void setListaPasseio(Passeio passeio) throws VeicExistException
	{
		if (checkCadPasseio(passeio) == 0)
		{
			listaPasseio.add(passeio);
		}
		else
		{
			throw new VeicExistException();
		}
	}

	public Passeio getListaPasseio(int id)
	{
		return (listaPasseio.get(id));
	}

	public int checkCadPasseio(Passeio veiculo)
	{
		for(int i = 0; i < listaPasseio.size(); i++)
		{
			if(listaPasseio.get(i).getPlaca().equals(veiculo.getPlaca()))
			{
				return(1);
			}
		}
		return (0);
	}

	public int getSizeListaPasseio()
	{
		return(listaPasseio.size());
	}

	public void excluirCadPasseio(int id)
	{
		listaPasseio.remove(listaPasseio.get(id));
		System.out.println("\t 🟢 Veiculo Removido com Sucesso ! ;)\n");
	}

	public void setListaCarga(Carga carga) throws VeicExistException
	{
		if (checkCadCarga(carga) == 0)
		{
			listaCarga.add(carga);
		}
		else
		{
			throw new VeicExistException();
		}
	}

	public int checkCadCarga(Carga veiculo)
	{
		for(int i = 0; i < listaCarga.size(); i++)
		{
			if(listaCarga.get(i).getPlaca().equals(veiculo.getPlaca()))
			{
				return(1);
			}
		}
		return (0);
	}

	public Carga getListaCarga(int id)
	{
		return (listaCarga.get(id));
	}

	public int getSizeListaCarga()
	{
		return(listaCarga.size());
	}

	public void excluirCadCarga(int id)
	{
		listaCarga.remove(listaCarga.get(id));
		System.out.println("\t 🟢 Veiculo Removido com Sucesso ! ;)\n");
	}
}

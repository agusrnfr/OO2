package ar.edu.unlp.info.oo2.ejercicio4b_Topografias;

import java.util.ArrayList;
import java.util.List;

public class TopografiaMixta extends Topografia{
	private List<Topografia> componentes;

	public TopografiaMixta(Topografia componente1, Topografia componente2, 
						   Topografia componente3, Topografia componente4) {
		this.componentes = new ArrayList<>();
		this.componentes.add(componente1);
		this.componentes.add(componente2);
		this.componentes.add(componente3);
		this.componentes.add(componente4);
	}
	
	@Override
	public List<Topografia> getTopografia (){
		return this.componentes;
	}

	@Override
	public double getProporcionAgua() {
		return (this.componentes.stream().mapToDouble(componente -> componente.getProporcionAgua()).sum())/this.componentes.size();
	}

	@Override
	public boolean isEquals(Topografia topografia) {
		return this.componentes.equals(topografia.getTopografia());
	}

}

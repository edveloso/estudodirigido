package visao;

import controle.ControladorAutomovel;
import modelo.AutoSemProprietarioException;
import modelo.Automovel;

public class Formulario {

	/**
	 * @param args
	 * @throws AutoSemProprietarioException 
	 */
	public static void main(String[] args) throws AutoSemProprietarioException {

		//cria o automovel e seta as informacoes
		Automovel auto = new Automovel();
		auto.setAnoFabricacao("1973");
		auto.setFabricante("suzuki");
		auto.setProprietario("veloso");
		 
		//cria o controlador e passa o auto para o metodo 
		//emplacar
		ControladorAutomovel controlador = new ControladorAutomovel();
		controlador.emplacar(auto);
		
		//mostra as informacoes
		System.out.println(auto.getAnoFabricacao());
		System.out.println(auto.getFabricante());
		System.out.println(auto.getPlaca());
		System.out.println(auto.getProprietario());
		
	}

}

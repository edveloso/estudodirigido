package controle;

import java.util.Random;

import modelo.AutoSemProprietarioException;
import modelo.Automovel;

public class ControladorAutomovel {
	
	public void emplacar(Automovel auto) throws AutoSemProprietarioException{
		 
		if(auto.getProprietario() == null)
			throw new AutoSemProprietarioException();
		
		String placa = gerarPlaca();
		auto.setPlaca(placa);
	}
	
	/**
	 * Podem ser feitas de duas maneiras sem e com o uso de FOR
	 * @return
	 */
	public String gerarPlaca() {
		String placa = "";
		placa += (char)getRandomNumber(26, 65);//primeira letra
		placa += (char)getRandomNumber(26, 65);//segunda letra
		placa += (char)getRandomNumber(26, 65);//terceira letra
		placa += getRandomNumber(9, 0);//primeira numero
		placa += getRandomNumber(9, 0);//primeira numero
		placa += getRandomNumber(9, 0);//primeira numero
		placa += getRandomNumber(9, 0);//primeira numero
		return placa;
	}
	
	/**
	 * Metodo usando o FOR
	 * @return
	 */
	public String gerarPlacaComFor() {
		String placa = "";
		for (int i = 0; i < 7; i++) {
			if(i < 3)
				placa += (char)getRandomNumber(26, 65);//primeiras 3 letras
			else
				placa += getRandomNumber(9, 0);//os 4 �ltimos numero	
		}
		
		return placa;
	}
	
	
	/**
	 * Este m�todo usa dois par�metros. O primeiro � a opera�ao que
	 * informa qual o limite do n�mero randomico. Por exemplo, se eu colocar
	 * o n�mero 3 (tres), ele vai retornar um n�mero de 0 a 3 de maneira aleat�ria. 
	 * Cada v�z que eu executar, ele retorna um n�mero dentro desta faixa, 
	 * inclusive, podendo ser repetido.
	 * 
	 * O segundo par�metro adiciona o valor informado como o segundo argumento 
	 * ao n�mero aleat�rio retornado.
	 * Por exemplo, se for informado 4 (quatro) como segundo argumento do m�todo, 
	 * ao n�mero aleat�rio gerado, digamos 15,  ser� acrescentado 4 a este valor, e o 
	 * retorno final ser� 19.
	 * Isto � necess�rio para o caso de letras. O n�mero ASCII das letras come�am de 65 e v�o at� 91, 
	 * porque existem 26 letras no alfabeto, (h�? N�o?!? t� de brincadeira! � s�rio?).
	 * Sim. Estou falando s�rio. O total de letras � 26 no alfabeto.
	 * Ent�o, como o random come�a de zero, o segundo par�metro � acrescentado para garantir 
	 * que a faixa vai come�ar de 65.     
	 *   
	 * @param limit
	 * @param addNumber
	 * @return
	 */
	private int getRandomNumber(int limit, int addNumber) {
		return (new Random().nextInt(limit))+addNumber;
	}
	

}

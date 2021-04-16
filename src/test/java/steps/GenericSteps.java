package steps;

import static org.junit.Assert.assertEquals;

import java.util.List;

import io.cucumber.java.pt.Entao;
import utils.RestUtils;

public class GenericSteps {

	@Entao("o sistema devolve o campo {string} com o valor {string}")
	public void oSistemaDevolveOCampoComOValor(String key, String value) {
	    assertEquals(value, RestUtils.getResponse(key));
	}
	@Entao("o sistema devolve o status {int}")
	public void oSistemaDevolveOStatus(int status) {
	    assertEquals(status, RestUtils.getStatusCode());
	}
	
	@Entao("o campo {string} devera retornar com {int} caracteres")
	public void oCampoDeveraRetornarComCaracteres(String key, int quantidade) {
	    int tamanho = RestUtils.getResponse(key).toString().length();
	    
	    assertEquals("Quantidade de caracteres incorreta:",quantidade, tamanho);
	    
	}
	
	@Entao("a valido que o campo {string} tenha o valor {string}")
	public void aValidoQueOCampoTenhaOValor(String key, String value) {
	    assertEquals(value, RestUtils.getResponse(key));
	}
	
	@Entao("valido que a lista {string} tenha o valor {string}")
	public void aValidoQueAListaTenhaOValor(String key, String value) throws Exception {
	    List<String> categorias = (List<String>) RestUtils.getResponse(key);
		if (!categorias.contains(value)) {
			throw new Exception("Não foi encontrado o valor '"+value+"' na lista: "+categorias);
		}
	}



	
	






}

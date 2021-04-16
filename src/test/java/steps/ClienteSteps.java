package steps;

import static org.junit.Assert.assertEquals;

import entidades.Address;
import entidades.Cliente;
import entidades.Customer;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import massa.ClienteMassa;
import utils.RestUtils;

public class ClienteSteps {

	Cliente cliente;
	Customer customer;
	Address address;
	String url = "/api/v1/customer";
	
	
	@Dado("que tenha um payload com dados validos")
	public void queTenhaUmPayloadComDadosValidos() {
		ClienteMassa clienteMassa = new ClienteMassa();
		cliente = clienteMassa.cliente;
		customer = clienteMassa.customer;
		address = clienteMassa.address;
	}
	
	@Quando("realizo uma request do tipo POST")
	public void realizoUmaRequestDoTipoPOST() {
	    RestUtils.postRequest("", cliente.getCliente());
	}
	
	@Entao("valido que o campo {string} seja igual a {int}")
	public void validoQueOCampoSejaIgualA(String campo, int valor) {
	    assertEquals(valor, RestUtils.getResponse(campo));
	}
	
	@Entao("que o statusCode retornou {int}")
	public void queOStatusCodeRetornou(int code) {
	    assertEquals(code, RestUtils.getStatusCode());
	}

	@Entao("valido que o statusCode retornou {int}")
	public void validoQueOStatusCodeRetornou(int code) {
		assertEquals(code, RestUtils.getStatusCode());
	}



	
	@Dado("que tenha um payload com dados somente obrigatorios")
	public void queTenhaUmPayloadComDadosSomenteObrigatorios() {
		ClienteMassa clienteMassa = new ClienteMassa();
		cliente = clienteMassa.cliente;
		customer = clienteMassa.customer;
		address = clienteMassa.address;
		
		address.remove("complement");
	}
	
	@Quando("removo o campo {string} de address")
	public void removoOCampoDeAddress(String campo) {
	    address.remove(campo);
	}
	
	@Entao("valido que a descricao retornou com {string}")
	public void validoQueADescricaoRetornouCom(String valor) {
	    assertEquals(valor, RestUtils.getResponse("descricao"));
	}


	@Quando("removo o campo {string} de customer")
	public void removoOCampoDeCustomer(String campo) {
	    customer.remove(campo);
	}
	
	
	@Quando("altero o campo {string} de address com {string}")
	public void alteroOCampoDeAddressCom(String key, String value) {
	    address.setAddress(key, value);
	}
	
	
	@Quando("altero o campo {string} de customer com {string}")
	public void alteroOCampoDeCustomerCom(String key, String value) {
	    customer.setCustomer(key, value);
	}













}

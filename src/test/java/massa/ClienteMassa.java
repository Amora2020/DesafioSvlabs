package massa;

import entidades.Address;
import entidades.Cliente;
import entidades.Customer;

public class ClienteMassa {

	
	public Address address = new Address("02922090", "rua teste", 100, "casa");

	public Customer customer = new Customer(address.getAddress(), "1987-12-10", "5421458744", "Aline");

	public Cliente cliente = new Cliente(customer.getCustomer());
	
	
}

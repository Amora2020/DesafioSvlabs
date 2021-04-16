package entidades;

import java.util.LinkedHashMap;

public class Customer{
    LinkedHashMap<String, Object> customer = new LinkedHashMap<>();
    public Customer(LinkedHashMap<String, Object> address, Object birthdate, Object cpf, Object name){
        customer.put("address",address);
        customer.put("birthDate",birthdate);
        customer.put("cpf",cpf);
        customer.put("name",name);
    }

    public LinkedHashMap<String, Object> getCustomer() {
        return customer;
    }
    public void setCustomer(String key, Object value){
        customer.put(key, value);
    }
    public void remove(String key){
        customer.remove(key);
    }
}

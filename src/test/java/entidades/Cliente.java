package entidades;

import java.util.LinkedHashMap;

public class Cliente{
    LinkedHashMap<String, Object> cliente = new LinkedHashMap<>();
    public Cliente(LinkedHashMap<String, Object> customer){
        cliente.put("customer",customer);
    }

    public LinkedHashMap<String, Object> getCliente() {
        return cliente;
    }
    public void setCliente(String key, Object value){
        cliente.put(key, value);
    }
    public void remove(String key){
        cliente.remove(key);
    }
}

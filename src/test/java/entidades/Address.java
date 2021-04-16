package entidades;

import java.util.LinkedHashMap;

public class Address{
    LinkedHashMap<String, Object> address = new LinkedHashMap<>();
    public Address(Object zipcode, Object street, Object number, Object complement){
        address.put("zipCode",zipcode);
        address.put("street",street);
        address.put("number",number);
        address.put("complement",complement);
    }

    public LinkedHashMap<String, Object> getAddress() {
        return address;
    }
    public void setAddress(String key, Object value){
        address.put(key, value);
    }
    public void remove(String key){
        address.remove(key);
    }
}

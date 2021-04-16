package utils;

import java.sql.Timestamp;

public class BaseUtils {

	public static String trataCampos(String value) {
		if (value.contains("[data]")) {
			String timestamp = new Timestamp(System.currentTimeMillis()).toString();  
	        timestamp = timestamp.replace("-", "").replace(" ", "").replace(":", "").replace(".", "");
	        value = value.replace("[data]", timestamp);
		}
		
		return value;
	}
}

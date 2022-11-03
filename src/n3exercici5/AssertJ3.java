package n3exercici5;

import java.util.HashMap;
import java.util.Map;

public class AssertJ3 {

	public static void main(String[] args) {
		Map comarques = createMap();

	}
	public static Map<String, String> createMap() {
		Map<String, String> comarques = new HashMap<String, String>();
		comarques.put("Barcelones", "Barcelona");
		comarques.put("Maresme", "Mataro");
		comarques.put("Girones", "Girona");
		comarques.put("Segria", "Lleida");
		comarques.put("Cerdanya", "Puigcerda");
		return comarques;
	}

}

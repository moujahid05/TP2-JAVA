package tp6;
import java.util.TreeMap;
import java.util.Map;
public class Exercice5 {
	public static void main(String[] args) {
		TreeMap<Integer, String> etudiants = new TreeMap<>();

        etudiants.put(120, "mohcin");
        etudiants.put(85, "moujahid");
        etudiants.put(150, "aasso");
        etudiants.put(60, "sami");
        etudiants.put(200, "ahmed");

        for (Map.Entry<Integer, String> e : etudiants.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println(etudiants.firstEntry());
        System.out.println(etudiants.lastEntry());

        Map<Integer, String> sup100 = etudiants.tailMap(101);

        for (Map.Entry<Integer, String> e : sup100.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

	}


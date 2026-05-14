package tp6;
import java.util.LinkedList;
public class Main {
	public static void main(String[] args) {
		LinkedList<Client> file = new LinkedList<>();

        file.add(new Client(1, "lhcen"));
        file.add(new Client(2, "younes"));
        file.add(new Client(3, "taha"));
        file.add(new Client(4, "hamid"));
        file.add(new Client(5, "hichan"));

        for (Client c : file) {
            System.out.println(c.numero + " " + c.nom);
        }

        Client servi = file.removeFirst();
        System.out.println("Servi : " + servi.nom);

        file.addLast(new Client(6, "moujahid"));

        Client tete = file.getFirst();
        System.out.println("En tete : " + tete.nom);
    }


	}



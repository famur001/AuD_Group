package praktikum_03;

public class Main {

	public static void main(String[] args) {
		
		Link<String> mittleresElement = new Link<String>("Test", null);
		mittleresElement.naechster = new Link<String>("Letzter", null);
		Link<String> anfang = new Link<String>("Erster", mittleresElement);

	}

}

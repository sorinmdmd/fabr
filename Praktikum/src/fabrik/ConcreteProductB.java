package fabrik;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteProductB extends Product {
	private BufferedReader reader;

	public ConcreteProductB() throws FileNotFoundException {
		super();
		reader = new BufferedReader(new FileReader("Teppichen.txt"));
	}

	@Override
	public String[] leseausDatei() throws IOException {
		// TODO Auto-generated method stub
		String[] ausgabe = new String[5];

		String zeile = reader.readLine();
		int i = 0;

		while (i < ausgabe.length) {
			ausgabe[i] = zeile;
			zeile = reader.readLine();
			i++;
		}
		return ausgabe;
	}

	@Override
	public void schliesseDatei() throws IOException {
		// TODO Auto-generated method stub

	}

}

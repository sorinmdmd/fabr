package fabrik;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import business.Teppich;

public class ConcreteProduct extends Product {
	private BufferedReader reader;

	public ConcreteProduct() throws FileNotFoundException {
		super();
		reader = new BufferedReader(new FileReader("TeppichenAusgabe.csv"));
	}

	@Override
	public String[] leseausDatei() throws IOException {
		// TODO Auto-generated method stub
		String line;
		String[] ausgabe = new String[5];
		while ((line = reader.readLine()) != null) {
			String[] zeile = line.split(";");
			ausgabe[0] = zeile[0];
			ausgabe[1] = zeile[1];
			ausgabe[2] = zeile[3];
			ausgabe[3] = zeile[3];
			ausgabe[4] = zeile[4];
		}
		return ausgabe;
	}

	@Override
	public void schliesseDatei() throws IOException {
		// TODO Auto-generated method stub
		reader.close();

	}

}
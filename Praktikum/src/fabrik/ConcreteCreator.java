package fabrik;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ConcreteCreator extends Creator {

	@Override
	public Product factoryMethod(String typ) throws IOException {
		// TODO Auto-generated method stub
		if (typ.contentEquals("csv")) {
			return new ConcreteProduct();
		} else {
			return new ConcreteProductB();
		}

	}

}
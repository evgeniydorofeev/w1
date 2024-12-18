package w1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.SneakyThrows;

class A implements Serializable  {
	private static final long serialVersionUID = 1L;
	int a;
}

class B extends A {
	private static final long serialVersionUID = 1L;
	long b;
	
//	private void writeObject(ObjectOutputStream oos) throws Exception {
//	}
//	
//	private void readObject(ObjectInputStream ois) throws Exception {
//		
//	}
}

public class SerializationTest {

	@SneakyThrows
	public static void main(String[] args) {
		B b = new B();
		b.b = 1;
		ByteArrayOutputStream bous = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bous);
		oos.writeObject(b);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bous.toByteArray()));
		b = (B) ois.readObject();
		System.out.println(b.b);
	}

}

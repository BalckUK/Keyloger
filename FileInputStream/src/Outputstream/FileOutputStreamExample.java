package Outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Users/haga5/Desktop/test/test.txt");
		byte[] data = "ABC".getBytes();
		for (int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}
		os.flush();
		os.close();
	}
}

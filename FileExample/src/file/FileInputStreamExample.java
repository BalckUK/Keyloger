package file;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(
				"C:/Users/haga5/Desktop/keyloger/FileExample/src/file/FileExample.java");

		int data;
		while ((data = fis.read()) != -1) {
			System.out.write(data);
		}
		fis.close();
	}
}

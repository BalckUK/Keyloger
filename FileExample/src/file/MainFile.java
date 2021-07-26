package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainFile {
	public static void main(String[] args) throws IOException {
		File dir = new File("C:/Users/haga5/Desktop/Main/File");
		File file = new File("C:/Users/haga5/Desktop/Main/File/file.txt");
		
		if (dir.exists() == false) {
			dir.mkdirs();
		}

		if (file.exists() == false) {
			file.createNewFile();
			
		}
		
		FileOutputStream fos = new FileOutputStream("C:/Users/haga5/Desktop/Main/File/file.txt",true);
		byte[] data = "abc".getBytes();
		fos.write(data);
		fos.flush();
		fos.close();
	}
}

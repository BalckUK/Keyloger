package InputstreamExample;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Users/haga5/Desktop/test/test.txt");
		// InputStreamReader re = new InputStreamReader(is,"UTF-8");

		int readByte;
		while ((readByte = is.read()) != -1) {
			System.out.println((char) readByte);
			// System.out.println(re);
		}
		is.close();
	}
}

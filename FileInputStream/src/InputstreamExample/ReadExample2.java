package InputstreamExample;
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Users/haga5/Desktop/test/test.txt");
		int readByteNo;
		String data = "";
		byte[] readBytes = new byte[3];
		while ((readByteNo = is.read(readBytes)) != -1) {
			System.out.println(readByteNo);
			data += new String(readBytes, 0, readByteNo);
		}
		System.out.println("data : " + data);
		is.close();
	}
}

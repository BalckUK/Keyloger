package file;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws URISyntaxException, IOException {
		File dir = new File("C:/Users/haga5/Desktop/test/dir");
		File file1 = new File("C:/Users/haga5/Desktop/test/dir/file1.txt");
		File file2 = new File("C:/Users/haga5/Desktop/test/dir/file2.txt");
		File file3 = new File(new URI("file:///C:/Users/haga5/Desktop/test/dir/file3.txt"));

		if (dir.exists() == false) {
			dir.mkdirs();
		}
		if (file1.exists() == false) {
			file1.createNewFile();
		}
		if (file2.exists() == false) {
			file2.createNewFile();
		}
		if (file3.exists() == false) {
			file3.createNewFile();
		}

		File file = new File("C:/Users/haga5/Desktop/test/dir");
		File[] contents = file.listFiles();
		System.out.println("날짜         시간    형태     크기       이름");
		System.out.println("----------------------------------------");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		for (File files : contents) {
			System.out.print(sdf.format(new Date(files.lastModified())));
			if(file.isDirectory()) {
				System.out.println("\t<DIR>\t\t\t"+ files.getName());
			}else {
				System.out.println("\t\t\t"+ files.length() + "\t"+ files.getName());
			}
			System.out.println();
		}
	}
}

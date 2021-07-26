package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NowDay {
	public void Nowday() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		Date day = new Date();
		String nowday = sdf.format(day);
		nowday += "\r\n";
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:/Users/haga5/Desktop/Main/File/file.txt", true);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		byte[] data = nowday.getBytes();
		try {
			fos.write(data);
			fos.flush();
			fos.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}
}

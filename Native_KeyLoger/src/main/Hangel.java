package main;

import java.util.HashMap;
import java.util.Map;

public class Hangel {

	public String ToHangel(String Hangel) {
		
		String Tran = "";
		
		String[] Ha = {"A","B","C","D","E","F","G","H","J","K","L","M","N","O","P","Q","R","S","T","U","W","Y","V","Z","X","I"};
		
		Map<String, String> map = new HashMap<>();
		map.put("A", "��");
		map.put("B", "��");
		map.put("C", "��");
		map.put("D", "��");
		map.put("E", "��");
		map.put("F", "��");
		map.put("G", "��");
		map.put("H", "��");
		map.put("J", "��");
		map.put("K", "��");
		map.put("L", "��");
		map.put("M", "��");
		map.put("N", "��");
		map.put("O", "��");
		map.put("P", "��");
		map.put("Q", "��");
		map.put("R", "��");
		map.put("S", "��");
		map.put("T", "��");
		map.put("U", "��");
		map.put("W", "��");
		map.put("Y", "��");
		map.put("V", "��");
		map.put("Z", "��");
		map.put("X", "��");
		map.put("I", "��");
		
		
		
		for(int i = 0; i<Ha.length; i++) {
			if(Hangel.equals(Ha[i])) {
				Tran = map.get(Ha[i]);
				break;
			}
		}
		
		
		return Tran;
		
	}
}

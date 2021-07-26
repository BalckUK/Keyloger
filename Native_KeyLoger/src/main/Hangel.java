package main;

import java.util.HashMap;
import java.util.Map;

public class Hangel {

	public String ToHangel(String Hangel) {
		
		String Tran = "";
		
		String[] Ha = {"A","B","C","D","E","F","G","H","J","K","L","M","N","O","P","Q","R","S","T","U","W","Y","V","Z","X","I"};
		
		Map<String, String> map = new HashMap<>();
		map.put("A", "け");
		map.put("B", "ば");
		map.put("C", "ず");
		map.put("D", "し");
		map.put("E", "ぇ");
		map.put("F", "ぉ");
		map.put("G", "ぞ");
		map.put("H", "で");
		map.put("J", "っ");
		map.put("K", "た");
		map.put("L", "び");
		map.put("M", "ぱ");
		map.put("N", "ぬ");
		map.put("O", "だ");
		map.put("P", "つ");
		map.put("Q", "げ");
		map.put("R", "ぁ");
		map.put("S", "い");
		map.put("T", "さ");
		map.put("U", "づ");
		map.put("W", "じ");
		map.put("Y", "に");
		map.put("V", "そ");
		map.put("Z", "せ");
		map.put("X", "ぜ");
		map.put("I", "ち");
		
		
		
		for(int i = 0; i<Ha.length; i++) {
			if(Hangel.equals(Ha[i])) {
				Tran = map.get(Ha[i]);
				break;
			}
		}
		
		
		return Tran;
		
	}
}

package regularexpression;
import java.util.regex.Pattern;


public class RegularExpression {
	public static void main(String[] args) {
		String sentence = "azAÇÑ±ÛZ019 ¾ÆÀÌÆù6¸¦ »ò´Âµ¥ iphone5º¸´Ù ÀÌ»ÚÁö´Â ¾Ê´õ¶ó ÔÔÑúåÛíşòä";
		String[] words = sentence.split(" ");

		for (String word : words) {
			System.out.println(word + "=>" + getType(word));
		}
		
		String test = "abcde ÇÑ±ÛÀÔ´Ï´Ù";
		
		
		
	}

	/**
	 * ¹®ÀÚÀÇ ¿µ¹®,¼ıÀÚ,ÇÑ±Û ¿©ºÎ¸¦ ¸®ÅÏÇÑ´Ù
	 * 
	 * @param word
	 * @return
	 */
	public static boolean getType(String word) {
		//System.out.println("getTypeÇÔ¼ö : "+word);
		return Pattern.matches("^[0-9a-zA-Z°¡-ÆR]*$", word);
	}

}

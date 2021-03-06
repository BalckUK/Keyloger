package regularexpression;
import java.util.regex.Pattern;


public class RegularExpression {
	public static void main(String[] args) {
		String sentence = "azA한글Z019 아이폰6를 샀는데 iphone5보다 이쁘지는 않더라 東濫漁長進";
		String[] words = sentence.split(" ");

		for (String word : words) {
			System.out.println(word + "=>" + getType(word));
		}
		
		String test = "abcde 한글입니다";
		
		
		
	}

	/**
	 * 문자의 영문,숫자,한글 여부를 리턴한다
	 * 
	 * @param word
	 * @return
	 */
	public static boolean getType(String word) {
		//System.out.println("getType함수 : "+word);
		return Pattern.matches("^[0-9a-zA-Z가-힣]*$", word);
	}

}

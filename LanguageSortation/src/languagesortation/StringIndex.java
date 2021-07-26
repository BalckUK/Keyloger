package languagesortation;

public class StringIndex {
	public static void main(String[] args) {
		String sentence = "azAZ019 아이폰6를 샀는데 iphone5보다 이쁘지는 않더라";
		String[] words = sentence.split(" ");

		for (String word : words) {
			System.out.println(word + "=>" + getType(word));
		}
	}

	/**
	 * 문자의 영문,숫자, 한글 타입을 리턴한다
	 * 
	 * @param word
	 * @return
	 */
	public static String getType(String word) {
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i);
			System.out.println(word.substring(i, i + 1) + " " + index);
		}

		return "";
	}
}

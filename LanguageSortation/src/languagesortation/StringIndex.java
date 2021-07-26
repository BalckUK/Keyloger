package languagesortation;

public class StringIndex {
	public static void main(String[] args) {
		String sentence = "azAZ019 ������6�� ��µ� iphone5���� �̻����� �ʴ���";
		String[] words = sentence.split(" ");

		for (String word : words) {
			System.out.println(word + "=>" + getType(word));
		}
	}

	/**
	 * ������ ����,����, �ѱ� Ÿ���� �����Ѵ�
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

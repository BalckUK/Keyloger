package regularexpression;
import java.util.regex.Pattern;


public class RegularExpression {
	public static void main(String[] args) {
		String sentence = "azA�ѱ�Z019 ������6�� ��µ� iphone5���� �̻����� �ʴ��� ����������";
		String[] words = sentence.split(" ");

		for (String word : words) {
			System.out.println(word + "=>" + getType(word));
		}
		
		String test = "abcde �ѱ��Դϴ�";
		
		
		
	}

	/**
	 * ������ ����,����,�ѱ� ���θ� �����Ѵ�
	 * 
	 * @param word
	 * @return
	 */
	public static boolean getType(String word) {
		//System.out.println("getType�Լ� : "+word);
		return Pattern.matches("^[0-9a-zA-Z��-�R]*$", word);
	}

}

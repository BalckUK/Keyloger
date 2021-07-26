package regularexpression;

public class RegularExpression2 {

	public static void main(String[] args) {
		String sentence = "�� �� �� �� �� �� �� �� ��";
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

package util;

public class Output {
	
	private static final int MAX_LINE_SIZE = 90;
	
	public static void display(String text) {
		System.out.println(getWrappedText(text));
	}
	
	private static String getWrappedText(String text) {
		int textLength = text.length();
		int offset = 0;
		StringBuffer wrappedText = new StringBuffer(textLength + 32);
		while (textLength - offset > MAX_LINE_SIZE) {
			if (text.charAt(offset) == ' ') {
				offset++;
			} else {
				int spaceToWrapAt = text.lastIndexOf(' ', MAX_LINE_SIZE + offset);
				wrappedText.append(text.substring(offset, spaceToWrapAt) + "\n");
				offset = spaceToWrapAt + 1;
			}
		}
		wrappedText.append(text.substring(offset));
		return wrappedText.toString();
	}

}

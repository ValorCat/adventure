package util;

import java.util.Scanner;

public class Display {
	
	private static final int MAX_LINE_SIZE = 90;
	private static final Scanner INPUT = new Scanner(System.in);
	
	public static void write(String text) {
		System.out.println(getWrappedText(text));
	}
	
	public static void write(String text, Object... params) {
		System.out.print(String.format(getWrappedText(text), params));
	}
	
	public static String input(String prefix) {
		System.out.print(prefix + " ");
		return INPUT.nextLine();
	}
	
	public static void space() {
		System.out.println();
	}
	
	public static void closeInput() {
		INPUT.close();
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

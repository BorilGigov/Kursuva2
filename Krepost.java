package kursova2;

import java.util.Scanner;

public class Krepost {
	
	private static String repeat(String strToRepeat, int count) {
		String text = "";
		for (int i = 0; i < count; i++) {
			text = text + strToRepeat;
		}
		return text;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Golemina na kreposta:");
		int n = sc.nextInt();
		
		int colSize = n/2;
		int midSize = 2 * n - 2 * colSize - 4;
		
		String underscores = repeat("_",midSize);
		String arrows = repeat("^",colSize);
		System.out.println(String.format("/%s\\%s/%s\\",arrows,underscores,arrows));
		
		
		int bodymid = 2 * n - 2;
		
		for (int i=1; i<=n-3; i++) {
			System.out.println(String.format("|%s|",repeat(" ", bodymid )));
		}
		
		String sideSpace = repeat(" ", colSize + 1);
		System.out.println(String.format("|%s%s%s|", sideSpace,underscores,sideSpace));
		
		String middleSpaces = repeat(" ",midSize);
		String underscores1 = repeat("_",colSize);
        System.out.println(String.format("\\%s/%s\\%s/",underscores1,middleSpaces,underscores1));
	}

	
}



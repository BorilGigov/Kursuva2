package kursova2;

import java.util.Scanner;

public class Fraction{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chislitel na purvata drob:");
		int chislitel = sc.nextInt();
		System.out.println("Znamenatel na purvata drob:");
		int znamenatel = sc.nextInt();
		System.out.println("Izberete deistvie:");
		String ch = sc.next();
		System.out.println("Chislitel na vtorata drob:");
		int chislitel1 = sc.nextInt();
		System.out.println("Znamenatel na vtorata drob:");
		int znamenatel1 = sc.nextInt();

		Fraction2 Drob1 = new Fraction2(chislitel, znamenatel, chislitel1, znamenatel1);
		if (ch.equals("+")) {
			Drob1.Subirane();
		}
		if (ch.equals("-")) {
			Drob1.Izvajdane();
		}
		if (ch.equals("*")) {
			Drob1.Umnojenie();
		}
		if (ch.equals("/")) {
			Drob1.Delenie();
		}
	}
}
package kursova2;

public class Fraction2 {
		int chislitel1;
		int znamenatel1;
		int chislitel;
		int znamenatel;
		
		public Fraction2(int chislitel, int znamenatel, int chislitel1, int znamenatel1) {
			this.chislitel = chislitel;
			this.znamenatel = znamenatel;
			this.chislitel1 = chislitel1;
			this.znamenatel1 = znamenatel1;
		}

		public void Umnojenie() {
			String message = "Otgovorut e: ";
			String drobnaCherta = "/";
			int numrator = (chislitel * chislitel1);
			int denumerator = znamenatel * znamenatel1;
			int devider = NOD(numrator, denumerator);
			numrator /= devider;
			denumerator /= devider;
			System.out.println(message + numrator + drobnaCherta + denumerator);
		}

		public void Delenie() {
			String message = "Otgovorut e: ";
			String drobnaCherta = "/";
			int numrator = (chislitel * znamenatel1);
			int denumerator = chislitel1 * znamenatel1;
			int devider = NOD(numrator, denumerator);
			numrator /= devider;
			denumerator /= devider;
			System.out.println(message + numrator + drobnaCherta + denumerator);
		}

		public void Subirane() {
			String message = "Otgovorut e: ";
			String drobnaCherta = "/";
			int numrator = (chislitel * znamenatel1) + (chislitel1 * znamenatel);
			int denumerator = znamenatel * znamenatel1;
			int devider = NOD(numrator, denumerator);
			numrator /= devider;
			denumerator /= devider;
			System.out.println(message + numrator + drobnaCherta + denumerator);
		}

		public void Izvajdane() {
			String message = "Otgovorut e: ";
			String drobnaCherta = "/";
			int numrator = (chislitel * znamenatel1) - (chislitel1 * znamenatel);
			int denumerator = znamenatel * znamenatel1;
			int devider = NOD(numrator, denumerator);
			numrator /= devider;
			denumerator /= devider;
			System.out.println(message + numrator + drobnaCherta + denumerator);
		}

		private int NOD(int a, int b) {
			a = Math.abs(a);
			b = Math.abs(b);
			for (int i = Math.min(a, b); i > 0; i--) {
				if (a % i == 0 && b % i == 0) {
					return i;
				}
			}
			return 1;
		}

}

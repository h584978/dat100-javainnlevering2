package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int row = 0; row < matrise.length; row++) {
			for (int column = 0; column < matrise[row].length; column++) {
				System.out.print(matrise[row][column]);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String toReturn = "";
		for (int row = 0; row < matrise.length; row++) {
			for (int column = 0; column < matrise[row].length; column++) {
				toReturn = toReturn + matrise[row][column] + " ";
			}
			toReturn = toReturn + "\n";
		}
		return toReturn;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		for (int row = 0; row < matrise.length; row++) {
			for (int column = 0; column < matrise[row].length; column++) {
				matrise[row][column] = matrise[row][column]*tall;
			}
		}
		return matrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		try {
			for (int row = 0; row < a.length; row++) {
				for (int column = 0; column < a[row].length; column++) {
					if (a[row][column] != b[row][column]) {
						return false;
					}
				}
			}
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}

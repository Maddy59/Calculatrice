package fr.eni.calculatrice;

public class Operation {
	// Calcul la somme des valeurs passées en paramètre
	public static int ajouter(int a, int b)
			throws DepassementCapaciteException {
		long resLong = (long) a + b;
		int resInt = a + b;
		if (resLong != resInt)
			throw new DepassementCapaciteException();
		return resInt;
	}

	// Calcul la différnce des valeurs passées en paramètre
	public static int soustraire(int a, int b)
			throws DepassementCapaciteException {
		long resLong = (long) a - b;
		int resInt = a - b;
		if (resLong != resInt)
			throw new DepassementCapaciteException();
		return resInt;
	}

	// Calcul le produit des valeurs passées en paramètre
	public static int multiplier(int a, int b)
			throws DepassementCapaciteException {
		long resLong = (long) a * b;
		int resInt = a * b;
		if (resLong != resInt)
			throw new DepassementCapaciteException();
		return resInt;
	}
}

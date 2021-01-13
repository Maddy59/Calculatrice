package fr.eni.calculatrice;

public class DepassementCapaciteException extends Exception {

	private static final long serialVersionUID = 1L;

	// Constructeur
	public DepassementCapaciteException() {
		super("Le résultat dépasse la capacité de la calculatrice");
	}
}

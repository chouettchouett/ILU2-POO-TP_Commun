package model;

public class FormulaireRestaurant extends Formulaire {
	
	private int nbLitSimple;
	private int nbLitDouble;
	private int numEntite;

	public FormulaireRestaurant(int jour, int mois, int numEntite, int nbLitSimple, int nbLitDouble) {
		super(jour, mois);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
	}

}

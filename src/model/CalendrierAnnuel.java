package model;

public class CalendrierAnnuel {
	private Mois[] calendrier;

	public CalendrierAnnuel() {
		this.calendrier = new Mois[12];
		this.calendrier[0] = new Mois("Janvier", 31);
		this.calendrier[1] = new Mois("Fevrier", 28);
		this.calendrier[2] = new Mois("Mars", 31);
		this.calendrier[3] = new Mois("Avril", 30);
		this.calendrier[4] = new Mois("Mai", 31);
		this.calendrier[5] = new Mois("Juin", 30);
		this.calendrier[6] = new Mois("Juillet", 31);
		this.calendrier[7] = new Mois("Aout", 31);
		this.calendrier[8] = new Mois("Septembre", 30);
		this.calendrier[9] = new Mois("Octobre", 31);
		this.calendrier[10] = new Mois("Novembre", 30);
		this.calendrier[11] = new Mois("Decembre", 31);
	}

	private static class Mois {
		private String nom;
		private boolean[] jours;

		private Mois(String nom, int nbjours) {
			super();
			this.nom = nom;
			this.jours = new boolean[nbjours];
		}

		private boolean estLibre(int jour) {
			return !jours[jour];
		}

		private void reserver(int jour) throws IllegalStateException {
			if (!estLibre(jour)) {
				throw new IllegalStateException();
			}
			jours[jour] = true;
		}
	}

	public boolean estLibre(int jour, int mois) {
		return calendrier[mois - 1].estLibre(jour - 1);// commence à 0
	}

	public boolean reserver(int jour, int mois) {
		if (estLibre(jour, mois)) {
			calendrier[mois - 1].reserver(jour - 1);
			return true;
		}
		return false;
	}
}
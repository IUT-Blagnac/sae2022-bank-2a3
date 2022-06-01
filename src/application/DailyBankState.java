package application;

import application.tools.ConstantesIHM;
import model.data.AgenceBancaire;
import model.data.Employe;




public class DailyBankState {
	private Employe empAct;
	private AgenceBancaire agAct;
	private boolean isChefDAgence;

	public Employe getEmpAct() {
		return this.empAct;
	}
	
	/**
	 * Permet de modifier un employe actif de la banque
	 * @param employeActif de type Employe
	 */
	public void setEmpAct(Employe employeActif) {
		this.empAct = employeActif;
	}

	public AgenceBancaire getAgAct() {
		return this.agAct;
	}

	/**
	 * Permet de modifier l'agence bancaire actif
	 * @param agenceActive de type AgenceBancaire
	 */
	public void setAgAct(AgenceBancaire agenceActive) {
		this.agAct = agenceActive;
	}

	public boolean isChefDAgence() {
		return this.isChefDAgence;
	}

	/**
	 * Permet de changer le statut de Chef D'agence
	 * @param isChefDAgence de type boolean
	 */
	public void setChefDAgence(boolean isChefDAgence) {
		this.isChefDAgence = isChefDAgence;
	}
	
	/**
	 * Permet de modifier le statue du chef d'agence selon ses droits
	 * @param droitsAccess de type String
	 */
	public void setChefDAgence(String droitsAccess) {
		this.isChefDAgence = false;

		if (droitsAccess.equals(ConstantesIHM.AGENCE_CHEF)) {
			this.isChefDAgence = true;
		}
	}
}

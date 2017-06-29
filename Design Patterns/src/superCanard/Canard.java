package superCanard;

public abstract class Canard {

	private ComportementVol comportementVol;
	private ComportementCancan comportementCancan;

	public abstract void afficher() ;

	public void effectuerVole() {
		this.comportementVol.voler();
		
	}

	public void effectuerCancan() {
		this.comportementCancan.cancan();
	}

	public void setComportementVol(ComportementVol cv){
		this.comportementVol = cv;
	}

	public void setComportementCancan(ComportementCancan comportementCancan) {
		this.comportementCancan = comportementCancan;
	}
}

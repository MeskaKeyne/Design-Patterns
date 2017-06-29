package superCanard;

public class MareFactory {

	public Mare getMare() {
		Mare mare = new Mare();
		mare.add(getColvert());
		mare.add(getLeurre());
		mare.add(getColvert());
		mare.add(getLeurre());
		mare.add(getMandarin());
		mare.add(getCanardEnPlastique());
		mare.add(getMandarin());
		mare.add(getMandarin());
		mare.add(getCanardEnPlastique());
		
		
		return mare;
	}

	private Canard getCanardEnPlastique() {
		CanardEnPlastique cep = new CanardEnPlastique();
		cep.setComportementCancan(new CanardMuet());
		cep.setComportementVol(new NePasVoler());;
		return cep;
	}

	private Canard getMandarin() {
		Mandarin mandarin = new Mandarin();
		mandarin.setComportementVol(new VolerAvecDesAiles());
		mandarin.setComportementCancan(new Cancan());
		return mandarin;
	}

	private Canard getLeurre() {
		Leurre leurre = new Leurre();
		leurre.setComportementCancan(new CoinCoin());
		leurre.setComportementVol(new NePasVoler());;
		return leurre;
	}

	private Canard getColvert() {
		Colvert colvert = new Colvert();
		colvert.setComportementVol(new VolerAvecDesAiles());
		colvert.setComportementCancan(new CoinCoin());
		return colvert;
	}

}

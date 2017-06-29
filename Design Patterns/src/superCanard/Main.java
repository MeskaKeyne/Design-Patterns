package superCanard;

public class Main {

	public static void main(String[] args) {
		MareFactory factory = new MareFactory();
		Mare mare = factory.getMare();
		mare.chasserCanard();
	}

}

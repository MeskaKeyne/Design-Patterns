package superCanard;

import java.util.ArrayList;
import java.util.List;

public class Mare {

	private List<Canard> canardList = new ArrayList<>();

	public void chasserCanard() {
		System.out.println("PAN PAN");
		for(Canard c : this.canardList){
			c.afficher();
			c.effectuerVole();
			c.effectuerCancan();
			System.out.println();
		}
		
	}

	public void add(Canard canard) {
		this.canardList.add(canard);
	}

}

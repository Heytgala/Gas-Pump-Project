//strategy pattern

package strategy;

import data.*;

public class setprice_gp2 extends setprice_abstract {

	@Override
	public void SetPrice(int g, datastore_abstract DS) {
		if (g == 1) {
			//Regular:1
			DS.setprice(DS.getRprice());
		}
		else if (g == 2) {
			//Premium:2
			DS.setprice(DS.getFprice());
		}
		else if (g == 3) {
			//Diesel:3
			DS.setprice(DS.getDprice());
		}
		System.out.println("\n Gas price has been set.\n");
		
	}

}

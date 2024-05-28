//strategy pattern

package strategy;

import data.*;

public class storeprices_gp2 extends storeprices_abstract {

	@Override
	public void StorePrices(datastore_abstract DS) {
		DS.setDprice(DS.gettemp_c());
		DS.setRprice(DS.gettemp_a());
		DS.setFprice(DS.gettemp_b());
		System.out.print("\n Prices saved.\n");
	}

}

//strategy pattern

package strategy;

import data.*;

public class storecash_gp1 extends storecash_abstract {

	@Override
	public void StoreCash(datastore_abstract DS) {
		DS.setcash(DS.getTemp_c());
		System.out.println("\n Cash stored.\n");
	}

}

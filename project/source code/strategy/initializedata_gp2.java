//strategy pattern

package strategy;

import data.*;

public class initializedata_gp2 extends initializedata_abstract {

	@Override
	public void InitializeData(datastore_abstract DS) {
		DS.setprice(0);
		DS.setcash(0);
	}

}

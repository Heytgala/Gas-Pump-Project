//strategy pattern

package strategy;

import data.*;

public class setinitialvalues_gp2 extends setinitialvalues_abstract {

	@Override
	public void SetInitialValues(int M, datastore_abstract DS) {
		DS.setG(0);
		DS.setTotal(0);
		System.out.println("\n Initial value has been set\n");
		
		
	}

}

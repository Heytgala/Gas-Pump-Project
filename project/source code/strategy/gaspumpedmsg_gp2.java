//strategy pattern

package strategy;

import data.*;

public class gaspumpedmsg_gp2 extends gaspumpedmsg_abstract {

	@Override
	public void GasPumpedMsg(int M, datastore_abstract DS) {
		if(M == 0)
		{
			//System.out.println("\n G= " + DS.getG() + "\n");
		}
		else if(M == 1)
			System.out.println("\n G= " + DS.getG() + "; Total= " + DS.getTotal() + "\n");
			
	}

}

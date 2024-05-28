//abstract factory pattern

package factory;

import data.*;
import strategy.*;

public class factory_gp2 extends factory_abstract {
	datastore_gp2 DS;
	cancelmsg_gp2 CM;
	displaymenu_gp2 DM;
	gaspumpedmsg_gp2 GPM;
	initializedata_gp2 ID;
	paymsg_gp2 PM;
	printreceipt_gp2 PR;
	rejectmsg_gp2 RJM;
	returncash_gp2 RC;
	setinitialvalues_gp2 SIV;
	setprice_gp2 SP;
	storecash_gp2 SC;
	storeprices_gp2 SPR;
	ejectcard_gp2 EJ;
	
	public datastore_gp2 getDataStore() {
		if(DS == null)
			DS = new datastore_gp2();
		
		return DS;
	}
	public cancelmsg_gp2 getCancelMsg_obj() {
		if(CM == null)
			CM = new cancelmsg_gp2();
		
		return CM;
	}
	public displaymenu_gp2 getDisplayMenu_obj() {
		if(DM == null)
			DM = new displaymenu_gp2();
		
		return DM;
	}
	public gaspumpedmsg_gp2 getGasPumpedMsg_obj() {
		if(GPM == null)
			GPM = new gaspumpedmsg_gp2();
		
		return GPM;
	}
	public initializedata_gp2 getInitializeData_obj() {
		if(ID == null)
			ID = new initializedata_gp2();
		
		return ID;
	}
	public paymsg_gp2 getPayMsg_obj() {
		if(PM == null)
			PM = new paymsg_gp2();
		
		return PM;
	}
	public printreceipt_gp2 getPrintReceipt_obj() {
		if(PR == null)
			PR = new printreceipt_gp2();
		
		return PR;
	}
	public rejectmsg_gp2 getRejectMsg_obj() {
		if(RJM == null)
			RJM = new rejectmsg_gp2();
		
		return RJM;
	}
	public returncash_gp2 getReturnCash_obj() {
		if(RC == null)
			RC = new returncash_gp2();
		
		return RC;
	}
	public setinitialvalues_gp2 getSetInitialValues_obj() {
		if(SIV == null)
			SIV = new setinitialvalues_gp2();
		
		return SIV;
	}
	public setprice_gp2 getSetPrice_obj() {
		if(SP == null)
			SP = new setprice_gp2();
		
		return SP;
	}
	public storecash_gp2 getStoreCash_obj() {
		if(SC == null)
			SC = new storecash_gp2();
		
		return SC;
	}
	public storeprices_gp2 getStorePrices_obj() {
		if(SPR == null)
			SPR = new storeprices_gp2();
		
		return SPR;
	}
	public ejectcard_gp2 getEjectcard_obj() {
		if(EJ == null)
			EJ = new ejectcard_gp2();
		
		return EJ;
	}
	
}

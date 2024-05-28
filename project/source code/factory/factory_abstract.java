//abstract factory pattern

package factory;

import data.*;
import strategy.*;

public abstract class factory_abstract {
	
	public abstract datastore_abstract getDataStore();
	public abstract cancelmsg_abstract getCancelMsg_obj();
	public abstract displaymenu_abstract getDisplayMenu_obj();
	public abstract gaspumpedmsg_abstract getGasPumpedMsg_obj();
	public abstract initializedata_abstract getInitializeData_obj();
	public abstract paymsg_abstract getPayMsg_obj();
	public abstract printreceipt_abstract getPrintReceipt_obj();
	public abstract rejectmsg_abstract getRejectMsg_obj();
	public abstract returncash_abstract getReturnCash_obj();
	public abstract setinitialvalues_abstract getSetInitialValues_obj();
	public abstract setprice_abstract getSetPrice_obj();
	public abstract storecash_abstract getStoreCash_obj();
	public abstract storeprices_abstract getStorePrices_obj();
	public abstract ejectcard_abstract getEjectcard_obj();
}

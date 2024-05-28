package gaspump_processor;

import data.*;
import factory.*;
import strategy.*;

public class output_processor {
	factory_abstract AF;
	datastore_abstract DS;
	cancelmsg_abstract CM;
	displaymenu_abstract DM;
	gaspumpedmsg_abstract GPM;
	initializedata_abstract ID;
	paymsg_abstract PM;
	printreceipt_abstract PR;
	rejectmsg_abstract RJM;
	returncash_abstract RC;
	setinitialvalues_abstract SIV;
	setprice_abstract SP;
	storecash_abstract SC;
	storeprices_abstract SPR;
	ejectcard_abstract EJ;
	
	public void setFactory(factory_abstract abs_fact) {
		AF = abs_fact;
	}
	public void setDataStore(datastore_abstract ds) {
		DS = ds;
	}

	public void StorePrices() { // stores price(s) for the gas from the temporary data store
		SPR = AF.getStorePrices_obj();
		SPR.StorePrices(DS);
	}

	public void PayMsg() { // displays a type of payment method
		PM = AF.getPayMsg_obj();
		PM.PayMsg();
	}

	public void StoreCash() { // stores cash from the temporary data store
		SC = AF.getStoreCash_obj();
		SC.StoreCash(DS);
	}
	

	public void DisplayMenu() { // display a menu with a list of selections
		DM = AF.getDisplayMenu_obj();
		DM.DisplayMenu();
	}

	public void RejectMsg() { // displays credit card not approved message
		RJM = AF.getRejectMsg_obj();
		RJM.RejectMsg();
	}

	public void SetPrice(int g) { // set the price for the gas identified by g identifier as in SelectGas(int g);
		SP = AF.getSetPrice_obj();
		SP.SetPrice(g, DS);
	}


	public void SetInitialValues(int M) { // set G (or L) and total to 0;
		SIV = AF.getSetInitialValues_obj();
		SIV.SetInitialValues(M, DS);
	}

	public void GasPumpedMsg(int M) { // displays the amount of disposed gas
		GPM = AF.getGasPumpedMsg_obj();
		GPM.GasPumpedMsg(M, DS);
	}

	public void PrintReceipt() { // print a receipt
		PR = AF.getPrintReceipt_obj();
		PR.PrintReceipt(DS);
	}

	public void CancelMsg() { // displays a cancellation message
		CM = AF.getCancelMsg_obj();
		CM.CancelMsg();
	}

	public void ReturnCash() { // returns the remaining cash
		RC = AF.getReturnCash_obj();
		RC.ReturnCash(DS);
	}

	public void EjectCard() { //Card is ejected
		EJ = AF.getEjectcard_obj();
		EJ.EjectCard();		
	}
	public void InitializeData() { // set the value of price and cash to 0
		ID = AF.getInitializeData_obj();
		ID.InitializeData(DS);
	}

}


import data.*;
import factory.*;
import gaspump_processor.*;

public class gaspump_1 {
	factory_abstract AF;		//store pointer to abstract factory for GP1
	datastore_abstract DS;		//store pointer to datastore for GP1
	MDAEFSM MD;					//store pointer to MDA-EFSM
	
	//set MDAEFSM pointer to object created in driver
	public void set_MDAEFSM(MDAEFSM md) {
		MD = md;
	}
	
	//set GP1 factory pointer to object created in driver
	public void set_factory(factory_abstract abs_fact) {
		AF = abs_fact;
	}
	
	//get datastore for GP1 from abstract factory
	public void set_datastore() {
		DS = AF.getDataStore();
	}
	
	public void Activate(int a) {
		if ((a > 0)) {
			if(DS.getTemp_a() == 0) {
			DS.setTemp_a(a);
			DS.setprice(DS.getTemp_a());
			}
			MD.Activate();
		}
	}
	
	public void Start() {
		MD.Start();
	}
	
	public void PayCredit() {
		MD.PayCredit();
	}
	
	public void Reject() {
		MD.Reject();
	}
	
	public void PayCash(int c) {
		if(c>0) {
			DS.setTemp_c(c);
			DS.setcash(DS.getTemp_c());
			DS.setW(0);
			MD.PayCash();
		}		
	}
	
	public void Cancel() {
		MD.Cancel();
	}
	
	public void Approved() {
		DS.setW(1);
		MD.Approved();
	}
		
	public void StartPump() {
		DS.setL(0);
		DS.setTotal(0);
		MD.StartPump();
	} 
	
	public void Pump() {
		if(DS.getW()==1||DS.getW()==0 && DS.getcash() >= DS.getprice()*DS.getL()+1) {
			DS.setL(DS.getL()+1);
			DS.setT(DS.getprice()*DS.getL());
			MD.Pump();
		}
		else if(DS.getW()==0 && DS.getcash() < DS.getprice()*DS.getL()+1){
			MD.Pump();
			MD.Receipt();
		}
	}
	
	public void StopPump() {
		MD.StopPump();
		MD.Receipt();
	}
	
}

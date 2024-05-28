
import data.*;
import factory.*;
import gaspump_processor.*;

public class gaspump_2 {
	factory_abstract AF;		//store pointer to abstract factory for GP2
	datastore_abstract DS;		//store pointer to datastore for GP2
	MDAEFSM MD;					//store pointer to MDA-EFSM
	
	//set MDAEFSM pointer to object created in driver
	public void set_MDAEFSM(MDAEFSM md) {
		MD = md;
	}

	//set GP2 factory pointer to object created in driver
	public void set_factory(factory_abstract abs_fact) {
		AF = abs_fact;
	}
	
	//get datastore for GP2 from abstract factory
	public void set_datastore() {
		DS = AF.getDataStore();
	}
	
	public void Activate(float a, float b, float c) {
		if ((a > 0) && (b > 0) && (c > 0)) {
			if(DS.gettemp_a()==0 && DS.gettemp_b() == 0 && DS.gettemp_c() == 0) {
			DS.settemp_a(a);
			DS.settemp_b(b);
			DS.settemp_c(c);
			DS.setDprice(DS.gettemp_c());
			DS.setRprice(DS.gettemp_a());
			DS.setFprice(DS.gettemp_b());
			}
			MD.Activate();
		}
	}
	
	public void Start() {
		MD.Start();
	}
	
	public void PayCash(int c) {
		if(c>0) {
			DS.setTemp_cash(c);
			DS.setcash(DS.getTemp_cash());
			MD.PayCash();
		}
	}
	
	public void Cancel() {
		MD.Cancel();
	}
	
	public void Premium() {
		if(DS.getprice()==0) {
		DS.setprice(DS.getFprice());
		MD.SelectGas(2);
		}
	}
	
	public void Regular() {
		if(DS.getprice()==0) {
		DS.setprice(DS.getRprice());
		MD.SelectGas(1);
		}
	}
	
	public void Diesel() {
		if(DS.getprice()==0) {
		DS.setprice(DS.getDprice());
		MD.SelectGas(3);
		}
	}
	
	public void StartPump() {
		DS.setG(0);
		DS.setTotal(0);
		MD.StartPump();
	}
	
	public void PumpGallon() {
		if (DS.getcash() >= DS.getprice() * (DS.getG() + 1)) {
			DS.setG(DS.getG()+1);
			DS.setTotal(DS.getprice()*DS.getG());
			MD.PumpGallon();
		}
		else { 
			MD.Stop();
		}
	}
	
	public void Stop() {
		MD.Stop();
	}
	
	public void Receipt() {
		MD.Receipt();
	}
	
	public void NoReceipt() {
		MD.NoReceipt();
	}

	
}

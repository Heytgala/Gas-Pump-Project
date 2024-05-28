package gaspump_processor;

import states.*;

public class MDAEFSM {
	
	private int M;
	state_abstract ST;
	state_abstract state_list[]; 
	
	public void setStateList(state_abstract s_list[]) {
		this.state_list = s_list;
		ST = state_list[7];
	}
	
	public void changestate(int index) {
		ST = state_list[index];
				
	}

	public void Activate() {
		ST.Activate();
	}

	public void Start() {
		M = 1;
		ST.Start();
	}

	public void Reject() {
		ST.Reject();
	}

	public void Cancel() {
		ST.Cancel();
	}

	public void Approved() {
		ST.Approved();
	}

	public void StartPump() {
		ST.StartPump(M);
	}

	public void Pump() {
		ST.Pump(M);
	}

	public void StopPump() {
		ST.StopPump();
	}

	public void Stop() {
		ST.Stop();
	}
	public void Receipt() {
		ST.Receipt();
	}

	public void NoReceipt() {
		ST.NoReceipt();
	}
	
	public void PayCash() {
		ST.PayCash();
	}
	
	public void PayCredit() {
		ST.PayCredit();
	}

	public void SelectGas(int g) {
		ST.SelectGas(g);
	}
	
	public void PumpGallon() {
		ST.PumpGallon(M);
	}
	
	public void Continue() {
		ST.Continue();
	}
	
}

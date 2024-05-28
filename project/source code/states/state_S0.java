//state pattern

package states;

import gaspump_processor.*;

public class state_S0 extends state_abstract {
	
	public state_S0(MDAEFSM md, output_processor op){
		super(md, op);		
	}
	
	public void Start() {
		OP.PayMsg();
		OP.InitializeData();
		MD.changestate(1);
	}
	@Override
	public void Activate() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Reject() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Cancel() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Approved() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void StartPump(int M) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Pump(int M) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void StopPump() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Stop() {
		// TODO Auto-generated method stub
	}
	
	
	@Override
	public void Receipt() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void NoReceipt() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void PayCash() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void PayCredit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void SelectGas(int g) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void PumpGallon(int M) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Continue() {
		// TODO Auto-generated method stub
		
	}
}
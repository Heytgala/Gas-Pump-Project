
import java.util.Scanner;

import factory.*;
import gaspump_processor.*;
import states.*;

public class driver {
	public static void main(String[] args) {

		driver d = new driver();
		d.selectpump();

	}// main

	void selectpump() {
		char gp;
		boolean valid = false;
		while (!valid) {
			System.out.println("1. Gas pump 1");
			System.out.println("2. Gas pump 2");
			System.out.print("\nSelect pump:");

			Scanner reader = new Scanner(System.in);
			try {
			gp = (char) reader.next().charAt(0);
			//Initialize Common Components
			output_processor OP = new output_processor();
			MDAEFSM MD = new MDAEFSM();
			
			state_abstract state_list[] = new state_abstract[9];
			state_list[0] = new state_S0(MD, OP);
			state_list[1] = new state_S1(MD, OP);
			state_list[2] = new state_S2(MD, OP);
			state_list[3] = new state_S3(MD, OP);
			state_list[4] = new state_S4(MD, OP);
			state_list[5] = new state_S5(MD, OP);
			state_list[6] = new state_S6(MD, OP);
			state_list[7] = new state_Start(MD, OP);
			
			MD.setStateList(state_list);
			
			switch (gp) {
				case '1': {
					factory_abstract AF1 = new factory_gp1();
					OP.setFactory(AF1);
					selection_gp1(AF1, MD, OP);
					valid = true;
					break;
				}
				case '2': {
					factory_abstract AF2 = new factory_gp2();
					OP.setFactory(AF2);
					selection_gp2(AF2, MD, OP);
					valid = true;
					break;
				}
				default: {
					System.out.println("\nInvalid input. try again\n");
					valid = false;
					break;
				}
			}
			}finally {
				reader.close();
			}
			
		}
	}
	

	void selection_gp1(factory_abstract AF1, MDAEFSM MD, output_processor OP) {
		gaspump_1 gp1 = new gaspump_1();
		gp1.set_MDAEFSM(MD);
		gp1.set_factory(AF1);
		gp1.set_datastore();
		OP.setDataStore(AF1.getDataStore());
		
		int a, c;
		char ch;
		//String pin;
		// Menu
		System.out.println("\t\t\t\t\tGasPump-1");
		System.out.println("\t\tMENU of Operations");
		System.out.println("\t\t0. Activate(int)");
		System.out.println("\t\t1. Start()");
		System.out.println("\t\t2. PayCredit()");
		System.out.println("\t\t3. Reject()");
		System.out.println("\t\t4. PayCash(int)");
		System.out.println("\t\t5. Cancel()");
		System.out.println("\t\t6. Approved()");
		System.out.println("\t\t7. StartPump()");
		System.out.println("\t\t8. Pump()");
		System.out.println("\t\t9. StopPump()");
		System.out.println("\t\tq. Quit the program\n");
		
		Scanner reader = new Scanner(System.in);
		try {
		ch = '1';
		while (ch != 'q') {
			System.out.println("\n Select Operation: ");
			System.out.println(" 0-Activate, 1-Start, 2-PayCredit, 3-Reject, 4-PayCash, 5-Cancel, 6-Approved, 7-StartPump");
			System.out.println(" 8-Pump, 9-StopPump, q-Quit");
			System.out.print(" Enter your choice: ");
			ch = (char) reader.next().charAt(0);
			switch (ch) {
			case '0': { // Activate()
				System.out.println("\n Operation: Activate(int a)");
				System.out.println(" Enter value for a:");
				a = reader.nextInt();
				gp1.Activate(a);
				break;
			}
			case '1': { // Start
				System.out.println("\n Operation: Start()");
				gp1.Start();
				break;
			}
			case '2': { // PayCredit
				System.out.println("\n Operation: PayCredit()");
				gp1.PayCredit();
				break;
			}
			
			case '3': {// Reject
				System.out.println("\n Operation: Reject()");
				gp1.Reject();
				break;
			}
			case '4': {// Pay Cash
				System.out.println("\n Operation: PayCash(int c)");
				System.out.println(" Enter value for c: ");
				c = reader.nextInt();
				gp1.PayCash(c);
				break;
			}
			case '5': {// Cancel
				System.out.println("\n Operation: Cancel()");
				gp1.Cancel();
				break;
			}
			case '6': {// Approved
				System.out.println("\n Operation: Approved()");
				gp1.Approved();
				break;
			}
			case '7': {// StartPump
				System.out.println("\n Operation: StartPump()");
				gp1.StartPump();
				break;
			}
			case '8': {// Pump
				System.out.println("\n Operation: Pump()");
				gp1.Pump();
				break;
			}
			case '9': { // StopPump
				System.out.println("\n Operation: StopPump()");
				gp1.StopPump();
				break;
			}
			case 'q':
				break;

			}// endswitch
		} // endwhile
		}finally {
			reader.close();
		}
	}
	
	void selection_gp2(factory_abstract AF2, MDAEFSM MD, output_processor OP) {
		gaspump_2 gp2 = new gaspump_2();
		gp2.set_MDAEFSM(MD);
		gp2.set_factory(AF2);
		gp2.set_datastore();
		OP.setDataStore(AF2.getDataStore());
		
		float a, b, c;
		int c1;
		char ch;
		// Menu
		System.out.println("\t\t\t\t\tGasPump-2");
		System.out.println("\t\tMENU of Operations");
		System.out.println("\t\t0. Activate(float, float, float)");
		System.out.println("\t\t1. Start()");
		System.out.println("\t\t2. PayCash(int)");
		System.out.println("\t\t3. Cancel()");
		System.out.println("\t\t4. Premium()");
		System.out.println("\t\t5. Regular()");
		System.out.println("\t\t6. Diesel()");
		System.out.println("\t\t7. StartPump()");
		System.out.println("\t\t8. PumpGallon()");
		System.out.println("\t\t9. Stop()");
		System.out.println("\t\tr. Receipt()");
		System.out.println("\t\tn. NoReceipt()");
		System.out.println("\t\tq. Quit the program\n");
		
		Scanner reader = new Scanner(System.in);
		try {
		ch = '1';
		while (ch != 'q') {
			System.out.println("\n Select Operation: ");
			System.out.println(" 0-Activate,1-Start, 2-PayCash, 3-Cancel, 4-Premium,");
			System.out.println(" 5-Regular, 6-Diesel, 7-StartPump, 8-PumpGallon, 9-Stop, r-Receipt, n-NoReceipt, q-quit");
			System.out.print(" Enter your choice: ");
			ch = (char) reader.next().charAt(0);
			switch (ch) {
			case '0': { // Activate()
				System.out.println("\n Operation: Activate(float a, float b, float c)");
				System.out.println(" Enter value for a: ");
				a = reader.nextFloat();
				System.out.println(" Enter value for b: ");
				b = reader.nextFloat();
				System.out.println(" Enter value for c: ");
				c = reader.nextFloat();
				gp2.Activate(a,b,c);
				break;
			}
			case '1':{ //Start
				System.out.println("\n Operation: Start()");
				gp2.Start();
				break;
			}
			case '2': { // PayCash
				System.out.println("\n Operation: PayCash(int c)");
				System.out.println(" Enter value of the parameter c:");
				c1 = reader.nextInt();
				gp2.PayCash(c1);
				break;
			}			
			case '3': {// Cancel
				System.out.println("\n Operation: Cancel()");
				gp2.Cancel();
				break;
			}
			case '4': {// Premium
				System.out.println("\n Operation: Premium()");
				gp2.Premium();
				break;
			}
			case '5': { // Regular
				System.out.println("\n Operation: Regular()");
				gp2.Regular();
				break;
			}
			case '6': { // Diesel
				System.out.println("\n Operation: Diesel()");
				gp2.Diesel();
				break;
			}
			case '7': {// StartPump
				System.out.println("\n Operation: StartPump()");
				gp2.StartPump();
				break;
			}
			case '8': { // PumpGallon
				System.out.println("\n Operation: PumpGallon()");
				gp2.PumpGallon();
				break;
			}
			case '9': { // Stop
				System.out.println(" Operation: Stop()");
				gp2.Stop();
				break;
			}
			case 'r': { // Receipt
				System.out.println("\n Operation: Receipt()");
				gp2.Receipt();
				break;
			}
			case 'n': { // NoReceipt
				System.out.println("\n Operation: NoReceipt()");
				gp2.NoReceipt();
				break;
			}
			case 'q':
				break;

			}// endswitch
		} // endwhile
		}finally {
			reader.close();
		}
	}
	
}

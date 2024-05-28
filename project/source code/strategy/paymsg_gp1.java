//strategy pattern

package strategy;

public class paymsg_gp1 extends paymsg_abstract {

	@Override
	public void PayMsg() {
		System.out.println("\n Payment method:");
		System.out.println(" -----------------");
		System.out.println("1. Credit");
		System.out.println("2. Cash");
		System.out.println(" -----------------\n");

	}

}

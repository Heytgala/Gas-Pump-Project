//strategy pattern

package strategy;

public class displaymenu_gp2 extends displaymenu_abstract {

	@Override
	public void DisplayMenu() {
		System.out.println("\n Select Gas Type:");
		System.out.println(" ---------");
		System.out.println(" Regular");
		System.out.println(" Diesel");
		System.out.println(" Premium");
		System.out.println(" ---------\n");

	}

}

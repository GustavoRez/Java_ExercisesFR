public class MainMult {
	public static void main (String args[]) {
		
		MulTable n1 = new MulTable(1);
		MulTable n2 = new MulTable(2);
		MulTable n3 = new MulTable(3);
		MulTable n4 = new MulTable(4);

		System.out.println("=========================");
		System.out.println("Tabuada de Números Thread");
		System.out.println("=========================");
		
		n1.start();
		n2.start();
		n3.start();
		n4.start();
	}
}
class MulTable extends Thread {
	private int number;
	
	MulTable (int n) {
		number = n;
	}

	public void run() {
		for (int i=0; i<=10; i++) {
			System.out.println(number + " x " + i + " = " + number*i);
		}
	}
}
public class Write extends Thread {
    private int i;

    public void run() {
        while (true)
               System.out.println("Number: " + i++);
    }
}
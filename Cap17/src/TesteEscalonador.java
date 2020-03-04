
public class TesteEscalonador {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new MeuProcesso(), "Thread-001");
		Thread t2 = new Thread(new MeuProcesso(), "Thread-002");
		Thread t3 = new Thread(new MeuProcesso(), "Thread-003");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t2.start();
		t1.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Todas as Threads foram executadas");
		
	}
}
public class Main {
	public static void main(String[] args) {

		ThreadGroup thG = new ThreadGroup("ThreadGroup");
		Thread th1 = new MyThread(thG, "поток 1");
		Thread th2 = new MyThread(thG, "поток 2");
		Thread th3 = new MyThread(thG,"поток 3");
		Thread th4 = new MyThread(thG,"поток 4");
		th1.start();
		th2.start();
		th3.start();
		th4.start();

		//  приостанавливаемся
		try {
			Thread.sleep(15000);
		} catch (InterruptedException err) {
			return;
		}

		System.out.printf("Завершаю все потоки.");
		thG.interrupt();
	}
}

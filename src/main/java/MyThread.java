class MyThread extends Thread {

	MyThread (ThreadGroup tg, String name){
		super(tg, name);
	}

	@Override
	public void run() {
		try {
			while(!Thread.currentThread().isInterrupted()) {
				Thread.sleep(2500);
				System.out.println("Я " + getName() + ". Всем привет!");
			}
		} catch (InterruptedException e) {
			System.out.printf("\n%s завершен", Thread.currentThread().getName());
		}
	}
}
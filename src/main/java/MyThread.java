class MyThread extends Thread {

	MyThread (ThreadGroup tg, String name){
		super(tg, name);
	}

	@Override
	public void run() {
		try {
			while(!isInterrupted()) {
				Thread.sleep(2500);
				System.out.println("Я " + getName() + ". Всем привет!");
			}
		} catch (InterruptedException err) {
			return;
		}
	}
}

public class ThreadsForStatic {
	static int count = 0;

	public static void main(String[] args) {

		System.out.println("main method started");
		Runnable runnable1 = () -> {
			count++;
			System.out.println(count);
			System.out.println("Running " + Thread.currentThread().getName());

		};
		Runnable runnable2 = () -> {
			count++;
			System.out.println(count);
			System.out.println("Running " + Thread.currentThread().getName());

		};
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		thread1.setName("Thread 1");
		thread2.setName("Thread 2");
		thread1.start();
		thread2.start();

	}
}

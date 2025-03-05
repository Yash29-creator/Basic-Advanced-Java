package Practicals;

class Buffer {
	private int data;
	private boolean available = false;
	synchronized void put(int value) throws InterruptedException {
		while (available) {
			wait();
		}
		data = value;
		available = true;
		notifyAll();
	}
	synchronized int get() throws InterruptedException {
		while (!available) {
			wait();
		}
		available = false;
		notifyAll();
		return data;
	}
}
class Producer extends Thread {
	private Buffer buffer;
	Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				buffer.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Produced: " + i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Consumer extends Thread {
	private Buffer buffer;
	Consumer(Buffer buffer) {
		this.buffer = buffer;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int data = i;
			try {
				data = buffer.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Consumed: " + data);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ProducerConsumer {
	public static void main(String[] args) throws InterruptedException {
		Buffer buffer = new Buffer();
		new Producer(buffer).start();
		new Consumer(buffer).start();
	}
}

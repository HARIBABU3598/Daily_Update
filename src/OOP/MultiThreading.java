package OOP;

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<11;i++) {
			System.out.println(i);
		}
		notify();
	}
}
class MyThread2 extends Thread{
	public void run() {
		
		for(int i=0;i<11;i++) {
			
			System.out.println("Hari");
		}
	}
}
public class MultiThreading{
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread2 t2=new MyThread2();
		t1.start();
		t2.start();
	}
}

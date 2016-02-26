//https://www.youtube.com/watch?v=_aNO6x8HXZ0&feature=youtu.be
package multi_threading.syncronize;

import java.util.Scanner;
	
class Processer extends Thread{
	private volatile boolean running = true;
	
	public void run(){
		while(running){
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
	}
	
	public void shutdown(){
		running = false;
	}
	
}
public class App {
	public static void main(String[] args) {
		Processer proc1 = new Processer();
		proc1.start();
		
		System.out.println("Press Return to stop");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		proc1.shutdown();
		
	}
}

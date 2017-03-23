package ces;

import java.lang.annotation.Target;

public class Duoxian extends Digui implements Runnable{
	public void run() {
		System.out.println("Duoxian.run()");
	}
	public static void main(String[] args) {	
		Duoxian one=new Duoxian();
		Thread thread=new Thread(one);
		thread.start();
	}
	public void runs(){
		Duoxian a=new Duoxian();
		if(a!=null){
			a.run();
		}
	}
}
	
package ces;

import java.nio.channels.GatheringByteChannel;

public class Diguis {
	public static void doubleNum(int n){
		System.out.println(n);
		if(n<=5000){
			doubleNum(n*2);
			System.out.println(n);
		}
	
	}
}

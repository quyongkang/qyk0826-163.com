package ces;

public class MaopaoCes {
	public static void main(String[] args) {
		int a[]={66,22,33,44,11,6,2,1,-32,-22,-66};
		one(a);
	}
	public static void one(int b[]){
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length-i-1;j++){
				int temp=0;
				if(b[j]>b[j+1]){
					temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
		two(b);
	}
		public static void two(int c[]){
			for(int k=0;k<c.length;k++){
				System.out.print(c[k]+",");
			}
		}
	}


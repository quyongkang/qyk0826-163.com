package ces;

public class Maopaos {
	public static void main(String[] args) {
		int a[]={2,4,5,1,-11,-2,43,22,-1};
		dateOne(a);
	}
		public static void dateOne(int b[]) {
			for(int i=0;i<b.length;i++){
				for(int j=0;j<b.length-i-1;j++){
					int temp=0;
					if(b[j]<b[j+1]){
						temp=b[j];
						b[j]=b[j+1];
						b[j+1]=temp;
					}
				}
		}
			dateTwo(b);
}	
		public static void dateTwo(int c[]){
			for(int k=0;k<c.length;k++){
				System.out.print(c[k]+",");
			}
		}
}

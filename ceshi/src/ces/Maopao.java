package ces;

public class Maopao {
	public void sort(){
		int blo[]={7,9,6,18,3};
		for(int i = 1;i < blo.length; i++){
			for(int j = 0 ; i < blo.length-i;j++){
				if(blo[j] < blo[j]+1){
					int temp;
					temp = blo[j];
					blo[j] = blo[j+1];
					blo[j+1] = temp;
				}
			}
		}
		for(int i=0;i<blo.length;i++){
			System.out.println(""+blo[i]+"");
		}
	}
	public static void main(String[] args) {
		Maopao mp=new Maopao();
		mp.sort();
	}
}
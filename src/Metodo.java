
public class Metodo {

	public static void main(String[] args) {
		int [] array=new int[30];
		for (int i = 0; i < array.length; i++) {
			int m=(int)(Math.random()*10+1);
			array[i]=m;
			System.out.println(array[i]+" ");
			
		}
		for (int i = 0; i < array.length; i++) {
			int numv=0;
			for (int j = 0; j < array.length; j++) {
				if(array[i]==j) {
					numv++;
					
				}
				System.out.println(array[i]+"aparece "+numv+" veces");
			}
			
		}
	}

}

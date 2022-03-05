
public class Reverse{
	
	public static void main(String[] args) {
		int r, n=123789;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			System.out.print(r);		
		}
		
		
	}
}

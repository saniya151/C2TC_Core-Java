
public class Palindrome {
	public static void main(String[] args) {
		int num=513,temp,rev=0,rem;
		temp=num;
		
		while(temp!=0) {
			rem = temp%10;
			rev = (rev*10)+ rem;
			temp = temp/10;
		}	
			if (num==rev){
				System.out.print(num+" "+"is palindrome number");		
			}
			else {
				System.out.print(num+" "+ "is not a palindrome number");
			}
		}
	}




public class Armstrong {

	public static void main(String[] args) {
		int num=153,temp,leng=0,temp2,mul,i,arm=0,rem;
		
		temp=num;
		while(temp!=0) {
			temp=temp/10;
			leng=leng+1;
		}
		
		temp2=num;
		while(temp2!=0) {
		    mul=1;
			rem=temp2%10;
			
			for(i=1;i<=leng;i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			temp2=temp2/10;
			
		}
		if(arm==num) {
			System.out.print(num+" "+"Is an Armstrong Number");
		}
		else {
			System.out.print(num+" "+"Is not an Armstrong Number");
		}
	

	}

}

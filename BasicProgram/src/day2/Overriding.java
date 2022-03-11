package day2;

class Bank{                      //Super class
	int getRateOfInterest(){     
	    return 0;	
	}
}

class SBI extends Bank{          //Sub Class
	int getRateofInterest() {    //Same method as of Super class 
		return 6;                //Same parameter as of Super class
	}
	
}

class Axis extends Bank{
	int getRateofInterest() {    //Sub Class
		return 8;
	}
}
	
public class Overriding {

	public static void main(String[] args) {
		Axis a=new Axis();
		SBI b=new SBI();
		System.out.println("Interest Rate of Axis :"+" "+a.getRateofInterest());
		System.out.println("Interest Rate of SBI :"+" "+b.getRateofInterest());

	}

}

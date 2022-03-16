package day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferDemo1{

	public static void main(String[] args) throws IOException {
	
		Double x;;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		x= Double.parseDouble(br.readLine());
      
        System.out.println("value is"+" "+x);
	}

}
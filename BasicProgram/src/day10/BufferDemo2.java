package day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferDemo2{

	public static void main(String[] args) throws IOException {
		
		int player;
		String team;
		Double score;
		
//		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter player no.");
		player=b.read();
		
		System.out.println("Enter team name");
		team=b.readLine();
		
//		System.out.println("Number of scores");
//		score=Double.parseDouble(b.readLine());
		
		System.out.println("Player no."+" "+player+"of"+" "+"team"+" "+" "+"has scored"+" ");
	}
	
}
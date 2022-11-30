package pack1;

import java.util.StringJoiner;

public class StringJoinerDemo1
{
	public static void main(String[] args) 
	{
		StringJoiner sj = new StringJoiner(",,,");
		sj.add("Ramu");
		sj.add("Shamu");
		sj.add("Manu");
		sj.add("Somu");
		sj.add("Umu");
		sj.add("Lomu");
		System.out.println(sj);
		
		System.out.println("==============================");
		StringJoiner sj1 = new StringJoiner(",","{","}");
		sj1.add("Ramu");
		sj1.add("Shamu");
		sj1.add("Manu");
		sj1.add("Somu");
		sj1.add("Umu");
		sj1.add("Lomu");
		System.out.println(sj1);
		
				
		
	}

}

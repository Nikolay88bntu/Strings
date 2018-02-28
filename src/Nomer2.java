import java.util.Scanner;

import java.lang.StringBuffer;

public class Nomer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String substring;
		int k;
		
		StringBuffer text = new StringBuffer("Just few words. This text should be checked. Symbols must be found.");
		System.out.println("Please, enter a substring:");
		Scanner sc = new Scanner(System.in);
		substring = sc.nextLine();
		System.out.println("Enter value of 'k':");
		//Scanner sc2 = new Scanner(System.in);
		k = sc.nextInt();
		if(k==0){
			System.out.println("This value is invalid. Program will be closed.");
			return;
		}
		int j = text.length()/k; // opredeliaem kolichestvo zamen s tekste
		int z = k; // sohranyaet vvedennuu pozitsiu zamenyaemogo simvola
		int v = substring.length(); // sohraniaet dlinu vvedennoy podstroki
		for(int x=0; x<j+1;x++){
			if (k<=text.length()){
		text.insert(k-1,substring);
		k = z+k+v;
		
		}
		}
		System.out.println(text);
	}

}

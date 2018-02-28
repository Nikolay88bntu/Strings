import java.util.Scanner;

public class Nomer5 {

	public static void main(String[] args) {
		String text = "Jisust fewis woisrds. This text shouldis be checkedis. Symbolsis ismust beis foundisis.";
		
		String sub = "is";
		String newWord = "OLE";
		int k;
		int counter = 0;
		//p1 = Pattern.compile(newWord$);
		String[]words;
		//String new_str = text.replaceAll(sub, newWord);
		words = text.trim().split("\\s+");// razbivaet na slova	// TODO Auto-generated method stub
		for(int i = 0; i<words.length; i++){
			if(words[i].endsWith(sub)||words[i].endsWith("is.")){
			words[i]=words[i].replaceAll(sub,newWord);	
			}
		}
		String txt = null;
		for(int i = 0; i<words.length; i++){
			System.out.println(words[i]);
			//txt = words[i].concat(words[i+1]);
			//i=i+2;
			
		}
		//System.out.println(txt);
	}

}

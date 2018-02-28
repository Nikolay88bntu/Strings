//32.Подсчитать, сколько раз заданное слово входит в текст.
public class Nomer32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	        String text = "She works in a bank. "
	        		+ "She gets up at 7 o'clock. She goes to work by bus. "
	        		+ "She works 8 hours a day. She likes shopping."
	        		+ " She does pilates 2 times a week.";
	        
	        String word = "She";
	        int position = 0;
	        int count = 0;

	        do {
	            position = text.indexOf(word, position);
	            if (position >= 0) {
	                count ++;
	                position += word.length();
	            }
	        } while (position >= 0);

	        System.out.println("Word occurs " + count + " times in the text.");
	    }
	}



package by.htp.nine;


	public class Number9{
		
		public static void main(String[] args) {

		String text = "Once time upon a time there time lived in a girl";
		int k = text.length();

		    System.out.println(text);
			System.out.println();
			
			
			String []words = text.split(" ");
			for(int i=0; i<words.length; i++){
				
				System.out.println("WORD: " +words[i]+ " OCCURS " + substringCount(text, words[i], k) + " TIMES IN THE TEXT.");
				
			}
		}
			
		public static int substringCount(String text, String pattern, int k) { //schitael kol-vo slov v texste
		    
		        int result = 0;
		        for (int i = 0; i < k-1; i++) {
		            if (text.substring(i, i + pattern.length()).equalsIgnoreCase(pattern)) {
		                ++result;
		            }
		               i = i+pattern.length()+1;
		            
		        }
		        return result;
		    }
		}


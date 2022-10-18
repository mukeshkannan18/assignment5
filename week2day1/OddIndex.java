package week2day1;

public class OddIndex {
	public static void main(String[] args) {
		String  Word="mukeshkannan";
		char[]letter=Word.toCharArray();
		int length=letter.length;
		for (int i = 0; i < letter.length; i++) {
		
			
			if(i%2!=0) {
				String Strcpy="";
				Strcpy=Strcpy+letter[i];
				System.out.println(Strcpy.toUpperCase());
				
				
				
			}
			else {
				System.out.println(letter[i]);
			}
			
			
		}
		
	}

}

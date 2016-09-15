import java.util.Arrays;
import java.util.List;

import javax.xml.stream.events.Characters;

public class encryption {
	
	public static void main(String[] args) {
		
		encryption encrip = new encryption(); 
		
		System.out.println(encrip.concatination(Arrays.asList(new Character[] {'a' , 'b' , 'c'})));

	}

	public static String concatination(List<Character> list){

		return list.stream().reduce("", (acc, c) -> acc + c, (acc1, acc2) -> acc1 + acc2);
	}
	
	public static String getEncodedChar(char c, String code){
		
		String encodedChar = ""; 
		
		int charValue = c - 97; 
		
		return encodedChar += code.charAt(charValue);
	}
	
	public static String encode(String txt, String code){
		
		String encodedTxt = ""; 
		
		for (int i = 0; i < txt.length(); i++) {
			
			encodedTxt += getEncodedChar(txt.charAt(i), code);
			
		}
		
		return encodedTxt; 
	}
	
	public static String decode(String txt, String code){
		
		String decodedTxt = ""; 
		
		char c;
		
		for (int i = 0; i < txt.length(); i++) {
			
			char a = txt.charAt(i);
			
			c = (char) (code.indexOf(a) + 97);
			
			decodedTxt += c;
			
		}
		
		return decodedTxt; 
		
	}
	
}

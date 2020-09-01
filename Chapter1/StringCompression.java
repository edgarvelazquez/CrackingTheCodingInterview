//1.6 String Compression
import java.io.*;
//import java.util.List;//
import java.util.*; //use this instead


//Explanation
//Try again usign stringBuilder since String concatenation is slow. Also think about i+1;

//insert and replace are the same function just with opposite inputs
class StringCompression {

	public static String compression(String a) {
		String result = "";
		char previous='\0';
		char temp='\0';
		int counter=0;
		boolean initial =true;
		if(a.length()==1) return a;

		for(int i=0; i < a.length();i++) {
			if(a.charAt(i)==previous && i!=a.length()-1){
			  counter++;
			} else {
				if(i==a.length()-1){
					if(previous!=a.charAt(i)){
						result=result+previous+counter;
						result=result+a.charAt(i);
						result+="1";
						
					}
					else{
						counter++;
						result=result+previous;
						result+=counter;
					}
				}
				else if(initial){
				  initial =false;

				}
				else {
					result=result+previous;
					result+=counter;
				}
				
				previous = a.charAt(i);
				counter=1;
				
			}
			

		}
		if(result.length() > a.length()) return a;
		return result;

	}
	public static void main(String[] args) {
		System.out.println("Array previous is: " + " aasstts " + " new is: " + compression("aasstts"));
		System.out.println("Array previous is: " + " a " + " new is: " + compression("a"));
		System.out.println("Array previous is: " + " ab " + " new is: " + compression("ab"));
		System.out.println("Array previous is: " + " aabcccccaaa " + " new is: " + compression("aabcccccaaa"));
		//failing aasts
	}
}
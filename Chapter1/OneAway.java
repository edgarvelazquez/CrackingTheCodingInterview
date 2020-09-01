	//1.5 One Away
	import java.io.*;
	//import java.util.List;//
	import java.util.*; //use this instead

	//insert and replace are the same function just with opposite inputs
	class OneAway {
	public static boolean oneAway(String a, String b) {
		if((a.length() - b.length()) > 2) return false;
		if((b.length() - a.length()) > 2) return false;

		if(a.length() == b.length()) {
			return replace(a,b);
		} else{
			if(a.length() > b.length()){
				return other(a,b);
			}
			else {
				return other(b,a); //since add and remove are the oppossite I can swap the input Strings and re-use the same function
			}
			
		}

		//return false;

	}

	public static boolean other(String a, String b) {
		boolean add = false;
		boolean replace= false;
		int offset=0;

		int max = a.length();

		for(int i=0; i<max; i++) {
			if(max==a.length() && replace == false) {
				return true;
			}
			if(a.charAt(i) != b.charAt(i-offset)) {
				if(replace == false ){
					offset++;
					replace=true;
				} else {
				return false;
				}
			}
		}
		return replace;

	}

	public static boolean replace(String a, String b) {
		boolean flag = false;
		for(int i =0; i < a.length(); i++) {
			if(a.charAt(i)!=b.charAt(i)){
				if(flag == true){
					return false;
				}
				else{
					flag=true;
				}
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		//System.out.println("Answer replace is " + oneAway("pale","ple"));//add
		System.out.println("Answer remove is " + oneAway("pale","palse")); //remove
		//System.out.println("Answer add is " + oneAway("pale","bake"));//replace
		//System.out.println("Answer add is " + oneAway("bake","false"));//Invalid
	}
	}
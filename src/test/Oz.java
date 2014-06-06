package test;

public class Oz {
	
	public char charToBig(char x){
		int code = x-('a'-'A');
		char X = (char) code;
		return X;
	}

}

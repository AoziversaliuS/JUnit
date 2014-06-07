package junit.clazz;

public class Oz {
	
	public char charToBig(char x){
		int code = x-('a'-'A');
		char X = (char) code;
		return X;
	}
	public char charToSmall(char x){
		int code = x+('a'-'A');
		char x2 = (char) code;
		int a = 8/0;
		return x2;
	}

}

package corejavapackage;

public class JavaBiggestofFournos {

	public static void main(String[] args) {
		int a =10, b=98, c=7, d=20;
	    
		if ((a>b) && (a>c) && (a>d)){
		System.out.println("A is a Big Number");
		}
		else if (((b>a) && (b>c) && (b>d))) {
		System.out.println("B is a Big Number");    
		}
		else if (((c>a) && (c>b) && (c>d))) {
		System.out.println("C is a Big Number");    
		}
		else{
		System.out.println("D is a Big Number");
		}


	}

}

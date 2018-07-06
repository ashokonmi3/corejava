package SeleniumTestOne;

public class JavaModifiers {
	
	//a Variable is a Class/Static variable
	
	static int a =100;
	
	

	
	public int salary(){
	    int mysalary =10000+2000+1500; //mysalary variable is a Local variable.- declared in methods or blocks.
	    mysalary=mysalary + a;
	    return mysalary;
	}


	public static void main(String[] args) {
		//Instance variable b (Instance variables are declared in a class but outside of a method or any block)
		int b =200;
		System.out.println(a);//100
		System.out.println(b); //200    
		        
		JavaModifiers obj= new JavaModifiers(); 
		System.out.println(obj.salary());
		// i is a Local Variable    
		for (int i=1; i<=5; i++){
		    System.out.println(i);
		    System.out.println(a);
		    System.out.println(b);



		}

	}
}

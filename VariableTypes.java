package SeleniumTestOne;

public class VariableTypes {
	
	static int a =100;//static variable

	//mysalary variable is a Local variable.
	public int salary(){
	    int mysalary =10000+2000+1500;
	    mysalary=mysalary + a;
	    return mysalary;
	}

	public static void main (String[]args){
	//Instance variable
	int b =200;
	System.out.println(a);//100
	System.out.println(b); //200    
	        
	VariableTypes obj= new VariableTypes();    
	System.out.println(obj.salary()); 
	// i is a Local Variable    
	for (int i=1; i<=5; i++){
	    System.out.println(i);
	    System.out.println(a);
	    System.out.println(b);
	}
	
	}
	
}

	
	
	
	

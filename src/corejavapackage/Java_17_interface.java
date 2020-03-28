package corejavapackage;

/*
 * Interface declaration interface <interface_name>{
 * 
 * // declare constant fields // declare methods that abstract // by default. }
 * 
 */

//
interface Callback {
	void callback(int param);
}

////
//////
////////
class Client implements Callback {
	// // // // Implement Callback's interface
	public void callback(int p) {
		System.out.println("callback called with " + p);
	}
}

////
//////
class AnotherClient implements Callback {
	// // // Implement Callback's interface
	public void callback(int p) {
		System.out.println("Another version of callback");
		System.out.println("p squared is " + (p * p));
	}
}

////
//////
class Interface {
	public static void main(String args[]) {
		Callback c = new Client();
		// webdriver driver= new ChromeDriver()
		// webdriver driver= new Firefoxdriver()
		// webdriver driver= new IeDriver()

		AnotherClient ob = new AnotherClient();
		// Callback ob = new AnotherClient();

		c.callback(42);
		c = ob; // c now refers to AnotherClient object
		// ob.callback(42);
		c.callback(20);
	}
}

// Done for ambreen

// =======================

//// Interface can be extended

// interface Ainterface {
// void meth1();
//
// void meth2();
// }
//
//// B now includes meth1() and meth2() -- it adds meth3().
// interface B extends Ainterface {
// void meth3();
// }
//
//// This class must implement all of A and B
// class MyClass implements B {
// public void meth1() {
// System.out.println("Implement meth1().");
// }
//
// public void meth2() {
// System.out.println("Implement meth2().");
// }
//
// public void meth3() {
// System.out.println("Implement meth3().");
// }
// }
//
// class Interface {
// public static void main(String arg[]) {
// MyClass ob = new MyClass();
// ob.meth1();
// ob.meth2();
// ob.meth3();
// }
// }

// ====================

/*
 * Multiple inheritence - If a class implements multiple interfaces, or an
 * interface extends multiple interfaces i.e. known as multiple inheritance.
 */
//
// interface Printable {
// void print();
// }
//
// interface Showable {
// void show();
// }
//
////
//////
// class Interface implements Printable, Showable {
// public void print() {
// System.out.println("Hello");
// }
//
// //
// public void show() {
// System.out.println("Welcome");
// }
//
// //
// public static void main(String args[]) {
// Interface obj = new Interface();
// obj.print();
// obj.show();
// }
// }
// ======================================
/*
 * As we have explained in the inheritance chapter, multiple inheritance is not
 * supported in case of class because of ambiguity. But it is supported in case
 * of interface because there is no ambiguity as implementation is provided by
 * the implementation class. For example:
 */
interface Printable {
	void print();
}

//
interface Showable {
	void print(int a);
}

//
class Interface implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void print(int a) {
		System.out.println("Hello: " + a);
	}

	//
	public static void main(String args[]) {
		Interface obj = new Interface();
		obj.print();
		obj.print();
	}
}
//// =============================
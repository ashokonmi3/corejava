package corejavapackage;

//class A2 {
//	int i, j;
//
//	A2(int a, int b) {
//		i = a;
//		j = b;
//	}
//
//	// display i and j
//	void show() {
//		System.out.println("I am in A2 parent class");
//		System.out.println("i and j: " + i + " " + j);
//	}
//}
//
////
//class B2 extends A2 {
//	int k;
//
//	B2(int a, int b, int c) {
//		super(a, b);
//		k = c;
//	}
//
//	// display k � this overrides show() in A
//	void show() {
//		System.out.println("I am in B2 child class");
//
//		System.out.println("k: " + k);
//	}
//}
//
//class Java_12_Override {
//	public static void main(String args[]) {
//		A2 supOb = new A2(6, 7);
//		B2 subOb = new B2(1, 2, 3);
//		subOb.show(); // this calls show() in B
//		supOb.show();
//	}
//}
// ==============================

/* final to prevent inheritence */
//class A2 {
//	final void meth() {
//		System.out.println("This is a final method.");
//	}
//}
//
//class B2 extends A2 {
//	void meth() { // ERROR! Can't override.
//		System.out.println("Illegal!");
//	}
//}
// =================================
class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

// Creating child classes.
class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}

// Test class to create objects and call the methods
class Java_12_Override {
	public static void main(String args[]) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		Bank b = new Bank();
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
		System.out.println("Default Rate of Interest: " + b.getRateOfInterest());

	}
}
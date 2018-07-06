package Package;

class OtherPackage {
	OtherPackage() {
		corejavapackage.Protection p = new corejavapackage.Protection();
		System.out.println("other package constructor");
		// class or package only
		System.out.println("n = " + p.n);// default
		// class only
		System.out.println("n_pri = " + p.n_pri);// private
		// class, subclass or package only
		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}

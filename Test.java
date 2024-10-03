package sit1;

public class Test {

	public static void main(String[] args) {
		A a=new A();	
		a.m1(112,22);
		System.out.println(a.b);
		a.m2(62,84);
		System.out.println(a.a);
		
		B b1=new B();
		System.out.println(b1.c);
		b1.m2(222,111);
		System.out.println(b1.d);
		b1.m3();
		System.out.println(b1.d);
		System.out.println(a.b);
		

	}

}

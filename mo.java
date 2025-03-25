import java.util.*;
abstract class Abc{
	abstract void a();
	abstract void b();
	abstract void c();
	// abstract void a();
	}
class Bc extends Abc{

	 void a(){
	System.out.println("This is method a.");
}
	 void b(){
	System.out.println("This is method b.");
}
	void c(){
	System.out.println("This is method c.");
}	
void a(){
	System.out.println("This is method a overwritten.");
}	
}
public class Mo{
	public static void main(String[]args){
	Bc d=new Bc();
	d.a();
	d.b();
	d.c();
}
}
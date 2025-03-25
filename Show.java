import java.util.*;
class Base{
	void show(){
		System.out.println("I'M the base class.");
	
}}
class Sub1 extends Base{
		void show(){
			System.out.println("I'M the Sub1 class.");
	
}}
class Sub2 extends Base{
		void show(){
			System.out.println("I'M the Sub2 class.");
	
}}
class Sub3 extends Base{
		void show(){
			System.out.println("I'M the Sub3 class.");
	
}}
class Show{
public static void main(String[] args){
	// Base a= new sub1();
	// a.show();
	Base a=new Sub1();
a.show();
	Base b=new Sub2();
b.show();
	Base c=new Sub3();
	c.show();
	}
}
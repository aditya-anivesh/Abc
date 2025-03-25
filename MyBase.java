import java.util.Scanner;
class Abc{
 Abc(int a,int b,int c){
	System.out.println("The perimeter of triangle is :"+(a+b+c));

}
 Abc(int a,int b){
	System.out.println("The Area of triangle is :"+0.5*(a*b));
}}
public class MyBase{
public static void main(String[] args){
int opt =1;
while(opt==1){
Scanner scanf =new Scanner(System.in);
Abc ab = new Abc(10,20,30);
Abc abcd = new Abc(10,20);
System.out.println("press 1 to run the code again.And 2 to exit the code:");
 opt = scanf.nextInt();
}
}
}
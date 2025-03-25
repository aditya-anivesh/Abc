import java.util.Scanner;
public class Palindrome{
public static void main(String[] args){
int opt=1;
while(opt == 1){
Scanner scanf = new Scanner(System.in);
System.out.println("Enter the string :");
String st = scanf.nextLine();
boolean a = true;
String str = new StringBuilder(st).reverse().toString();
if(!st.equals(str)){
a = false;
}
if(a == true){
System.out.println("The string is palindrome.");
} else {
System.out.println("The string is not palindrome.");
}
System.out.println("press 1 to run the code again.And 2 to exit the code:");
 opt = scanf.nextInt();
}

}
}
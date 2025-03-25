import java.util.Scanner;
public class ReverseString{
public static void main(String[] args){
int opt =1;
Scanner scanf =new Scanner(System.in);
while(opt==1){
String st;
System.out.println("Enter a string to reverse :");
st=scanf.nextLine();
String str=" ";
for(int i=st.length()-1;i>=0;i--){
str+= st.charAt(i);
}
System.out.println("The reversed string is :"+str);
System.out.println("The unreversed string was :"+ new StringBuilder(str).reverse().toString());

System.out.println("press 1 to run the code again.And 2 to exit the code:");
 opt = scanf.nextInt();
}
}
}
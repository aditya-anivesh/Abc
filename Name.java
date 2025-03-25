import java.util.Scanner;
public class Name{
public static void main(String[] args){
int opt =1;

while(opt==1){
Scanner scanf =new Scanner(System.in);
System.out.println("Enter your name :");
String st=scanf.nextLine();
String str=" ";
String temp;

for(int i=0;i<st.length();i++){
if(st.charAt(i)==' '){
str=str+' ';
System.out.print(str);
System.out.println();
} else if (st.charAt(i)>='a' && st.charAt(i)<='z'){
	char a='a';
	while(st.charAt(i)!=a){
	temp=str;
	temp=temp+a;
	System.out.print(temp);
	System.out.println();
	 try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

	a++;
}
str=str+a;
	System.out.println(str);
} else if (st.charAt(i)>='A' && st.charAt(i)<='Z') {
	char a='A';
	while(st.charAt(i)!=a){
	temp=str;
	temp=temp+a;
	System.out.print(temp);
	System.out.println();
	 try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

	a++;
}
str=str+a;
	System.out.println(str);
} else{
	System.out.println("Enter a valid Input ):");
}

}
System.out.println("press 1 to run the code again.And 2 to exit the code:");
 opt = scanf.nextInt();
}

}}
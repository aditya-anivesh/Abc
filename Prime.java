import java.util.Scanner;
public class Prime{
public static void main(String[] args){
int opt =1;
Scanner scanf=new Scanner(System.in);
while(opt==1){
boolean a= true;
System.out.println("Enter the number to check :");
int num = scanf.nextInt();
if(num <2){
System.out.println("The number is not Prime");
} else {
for(int j=2;j<=Math.sqrt(num);j++){
    if(num % j ==0){
        a = false;
    }
}
}
if(a){
    System.out.println("the number is a prime number");
} else{
    System.out.println("The number is not a prime number");
}



System.out.println("press 1 to run the code again.And 2 to exit the code:");
 opt = scanf.nextInt();
}
}
}
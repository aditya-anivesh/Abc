import java.util.*;
public class FC{
    public static void main(String[] args) {
        Scanner scanf= new Scanner(System.in);
        System.out.println("Enter the value of F :");
        int F=scanf.nextInt();
        System.out.println("Enter the value of B :");
        int B=scanf.nextInt();
        System.out.println("Enter the value of T :");
        int T=scanf.nextInt();
        System.out.println("Enter the value of D :");
        int D=scanf.nextInt();
        int t=0;
        while(D>B){
            D=D-B+F;
            t=t+((B+F)*T);
        }
        t=t+(D*T);
        System.out.println("The value of time taken by the car to hit the wall is :"+t);
    }
}
import java.util.*;
import  java.io.*;
class extendedeuclidean
{int r0,r1;
    public void getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of r0 , make sure r0>r1");
         r0 = sc.nextInt();
        System.out.println("Enter the value of r1");
         r1 = sc.nextInt();
    
    }
    public void main_algorithm(){
        int r[] = new int[10];
        int s[] = new int [10];
        int q[] =new int[10];
        int t[] = new int[10];
        r[0] = r0;
        r[1] = r1;
        s[0] = 1; t[0] = 0;
        s[1] = 0;
        t[1] = 1;
        int i = 1;
        do{
i = i +1;
r[i] =  r[i-2]% r[i-1];
q[i-1] = (int)((r[i-2] - r[i])/r[i - 1]);
s[i] = s[i-2] - q[i-1]*s[i-1];
t[i] = t[i-2]- q[i-1]*t[i-1];


        }while(r[i] != 0);
System.out.println("the gcd of 2 numbers is "+ r[i-1]);
System.out.println("The inverse is "+ t[i-1]);


    }
    public static void main(String[]args){
       
        
        extendedeuclidean eu = new extendedeuclidean();
        eu.getInput();
        eu.main_algorithm();

    }
}
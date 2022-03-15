import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) 
  {
    Scanner nowy = new Scanner(System.in);
    double a, b;
    System.out.println("Podaj a: ");
    a = nowy.nextDouble();
    System.out.println("Podaj b: ");
    b = nowy.nextDouble();
    System.out.println("Podaj wybór: ");
    int wybor = nowy.nextInt();
    switch(wybor)
      {
        case 1:
        {
        System.out.println(2*a+2*b);
        }
        case 2:
        {
        int c = 2;
        System.out.println(Math.PI*Math.pow(a, c)+Math.PI*Math.pow(b, c));   
        }
        case 3:
        {
         System.out.println((a*b)/2);   
        }
        case 4:
        {
        if(b == 0)
        {
        System.out.println("Nie dziel przez 0");
        }
        else
        {
        System.out.println(a/b);  
        }
        }  
      }
  }
}
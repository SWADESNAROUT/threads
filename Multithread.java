import java.util.Scanner;

public class Multithread
{
        static int n ;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number");
            n = sc.nextInt();

            A obj1 = new A();
            B obj2 = new B();

            obj2.start();
            obj1.start();
        }
}
    class A extends Thread
    {
        public void run() {
            for (int j = 1; j <= Multithread .n; j++)
                if(j%2==0)
                {
                    System.out.println("even"+j);
                    try{Thread.sleep(1000);} catch( Exception e){}
                }
        }
    }
    class B extends Thread
    {
        public void run()
        {
            for (int k = 1; k <=Multithread .n; k++)
                if(k%2!=0)
                {
                    System.out.println("odd"+k);
                    try{Thread.sleep(1000);} catch( Exception e){}
                }
        }
    }

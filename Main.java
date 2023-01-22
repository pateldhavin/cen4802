import java.util.Scanner;



public class Main {

  

   static int fibb(int n){
    if (n<=1)
    return n;
    return fibb(n-1)+fibb(n-2);
   }




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter nth term of the sequence: ");
        int n = scanner.nextInt();

        System.out.printf("The %dth term in the fibonacci sequence is %d \n", n, fibb(n));

     
        scanner.close();
    }
}

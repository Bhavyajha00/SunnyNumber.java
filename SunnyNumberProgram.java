import java.util.Scanner;

public class SunnyNumberProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check");
        int n = sc.nextInt();
        findSunnyNumber(n);
        sc.close();
    }
    static void findSunnyNumber(int n){
        int N = n+1;
        if(isPerfectSquare(N)){
            System.out.println(n+" is a Sunnny Number");
        }else{
            System.out.println(n+" is not a Sunnny Number");
        }
    }
    static boolean isPerfectSquare(double n){
        double squareRoot = Math.sqrt(n);
        return(squareRoot-Math.floor(squareRoot)==0);
    }
}

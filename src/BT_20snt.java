import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class BT_20snt {
    public static boolean checkPrime(int number){
        int count = 0;
        for(int i = 1; i <=number; i++) {
            if (number % i == 0) count++;
        }
        return (count == 2) ? true : false;
    }
    public static void isPrime(int number){
        int N = 1;
        int n = 1;
        while (N <= number) {
            if (checkPrime(n)) {
                System.out.println("số thứ tự : " + N + " số nguyên tố :" +n);
                N++;
                n++;
            } else {
                n++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố: ");
        int number = scanner.nextInt(); scanner.nextLine();
        isPrime(number);
//        System.out.println(checkPrime(number));;
    }
}

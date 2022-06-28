import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy, kilo, endeks;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu giriniz: ");
        boy = input.nextDouble();

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();
        endeks = kilo / (boy * boy);
        System.out.println("Vücut kitle endeksiniz: " + endeks);

    }
}
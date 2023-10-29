package java101;
    import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {

        int kenar1, kenar2 ,kenar3;
        Scanner input = new Scanner(System.in);
        System.out.print("kenar1 giriniz: ");
        kenar1 = input.nextInt();
        System.out.print("kenar2 giriniz: ");
        kenar2 = input.nextInt();
        System.out.print("kenar3 giriniz: ");
        kenar3 = input.nextInt();

        int u = (kenar1+kenar2+kenar3)/2;
        int cevre = 2*u;
        double alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Üçgenin Alanı: "+alan);

    }
}

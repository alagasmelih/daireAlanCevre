import java.util.Scanner;

public class daireAlanCevre {
    public static void main(String[] args) {
        double r, pi= 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz:");
        r = input.nextDouble();
        double alan = pi*r*r;
        double cevre= 2*pi*r;
        System.out.println("Dairenin alanı: " +alan);
        System.out.println("Dairenin çevresi: "+ cevre);

    }
}
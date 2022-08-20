package Quadratic_Eq;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utility u = new Utility();
        TamKvTen t = new TamKvTen();
        NatamamKvTen n = new NatamamKvTen();
        KvTenDEYIL td = new KvTenDEYIL();
        u.novler();
        Scanner s = new Scanner(System.in);
        int C = s.nextInt();
        do {
            if (C == 2) {
                System.out.println(" ");
                System.out.println("Əməliyyat bitirildi!");
                break;
            } else if (C != 1) {
                System.out.println("Seçim yalnışdır, yenidən cəhd edin!");
                System.out.println(" ");
                u.novler();
                System.out.println(" ");
                C = s.nextInt();
            } else {
                System.out.println(" ");
                Scanner sc = new Scanner(System.in);

                System.out.print("a" + "=");
                double a = sc.nextDouble();

                System.out.print("b" + "=");
                double b = sc.nextDouble();

                System.out.print("c" + "=");
                double c = sc.nextDouble();

                System.out.print("d" + "=");
                double d = sc.nextDouble();

                t.tamKvTen(a, b, c, d);
                td.kvTenDEYIL(a, b, c, d);
                n.natamamKvTen(a, b, c, d);

                System.out.println();
                System.out.println("Əməliyyat bitirildi!");

                u.menu();
                C = s.nextInt();
            }
        } while (C != 2);
    }
}

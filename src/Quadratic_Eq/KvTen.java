package Quadratic_Eq;

import java.util.Scanner;

public class KvTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a" + "=");
        double a = sc.nextDouble();

        System.out.print("b" + "=");
        double b = sc.nextDouble();

        System.out.print("c" + "=");
        double c = sc.nextDouble();

        System.out.print("d" + "=");
        double d = sc.nextDouble();

        double D;
        double x1;
        double x2;

        c = c - d;

        if (a != 0 && (b == 0 && c == 0)) {
            System.out.println("Sizin həll etdiyiniz tənlik Natamam kvadrat tənlikdir!");
            System.out.println("x1" + "=" + "x2" + "=" + 0);
        }
        if (a != 0 && (b != 0 && c == 0)) {
            x1 = 0;
            x2 = (-1) * (b) / a;
            System.out.println("Sizin həll etdiyiniz tənlik Natamam kvadrat tənlikdir!");
            System.out.println("x1" + "=" + x1 + ";" + " " + "x2" + "=" + x2 + ".");
        }
        if (a != 0 && (b == 0 && c != 0)) {
            System.out.println("Sizin həll etdiyiniz tənlik Natamam kvadrat tənlikdir!");
            if (c < 0) {
                x1 = (-1) * c / a;
                x2 = Math.sqrt(x1);
                System.out.println("x1" + "=" + "-" + x2 + ";" + " " + "x2" + "=" + x2 + ".");
            } else {
                System.out.println("Boş çoxluq!");
            }
        }
        if (a != 0 && (b != 0 && c != 0)) {
            D = (b * b) - (4 * a * c);
            if (a == 1) {
                System.out.println("Sizin həll etdiyiniz tənlik Çevrilmiş kvadrat tənlikdi!");
            }
            if (D > 0) {
                x1 = ((-1) * (b) + Math.sqrt(D)) / (2 * a);
                x2 = ((-1) * (b) - Math.sqrt(D)) / (2 * a);
                System.out.println("x1" + "=" + x1);
                System.out.println("x2" + "=" + x2);
            } else if (D == 0) {
                x2 = ((-1) * (b)) / (2 * a);
                System.out.println("x1" + "=" + "x2" + "=" + x2);
            } else {
                System.out.println("D<0-dır, ona görə də bu tənliyin həqiqi kökü yoxdur!");
            }
        } else if (a == 0) {
            System.out.println("Sizin həll etdiyiniz tənlik Kvadrat tənlik deyil!");
        } else {
            System.out.println();
        }
    }
}

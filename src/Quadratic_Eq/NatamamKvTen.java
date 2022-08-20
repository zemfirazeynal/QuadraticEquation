package Quadratic_Eq;

public class NatamamKvTen {
    public void natamamKvTen(double a3, double b3, double c3, double d3) {

        double x13;
        double x23;

        c3 = c3 - d3;

        if (a3 != 0 && (b3 == 0 && c3 == 0)) {
            System.out.println("Sizin həll etdiyiniz tənlik Natamam kvadrat tənlikdir!");
            System.out.println("x1" + "=" + "x2" + "=" + 0);
        }
        if (a3 != 0 && (b3 != 0 && c3 == 0)) {
            System.out.println("Sizin həll etdiyiniz tənlik Natamam kvadrat tənlikdir!");
            x13 = 0;
            x23 = (-1) * (b3) / a3;
            System.out.println("x1" + "=" + x13 + ";" + " " + "x2" + "=" + x23 + ".");
        }
        if (a3 != 0 && (b3 == 0 && c3 != 0)) {
            System.out.println("Sizin həll etdiyiniz tənlik Natamam kvadrat tənlikdir!");
            if (c3 < 0) {
                x13 = (-1) * c3 / a3;
                x23 = Math.sqrt(x13);
                System.out.println("x1" + "=" + "-" + x23 + ";" + " " + "x2" + "=" + x23 + ".");
            } else {
                System.out.println("Boş çoxluq!");
            }
        }
    }


}

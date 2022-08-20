package Quadratic_Eq;

public class TamKvTen {
    public void tamKvTen(double a2, double b2, double c2, double d2) {
        double D2;
        double x12;
        double x22;

        c2 = c2 - d2;

        if (a2 != 0 && (b2 != 0 && c2 != 0)) {
            if (a2 == 1) {
                System.out.println("Sizin həll etdiyiniz tənlik Çevrilmiş kvadrat tənlikdir!");
            } else {
                System.out.println("Sizin həll etdiyiniz tənlik Tam kvadrat tənlikdir!");
            }
            D2 = (b2 * b2) - (4 * a2 * c2);
            if (D2 > 0) {
                System.out.println("D>0-dır");
                x12 = ((-1) * (b2) + Math.sqrt(D2)) / (2 * a2);
                x22 = ((-1) * (b2) - Math.sqrt(D2)) / (2 * a2);
                System.out.println("x1" + "=" + x12);
                System.out.println("x2" + "=" + x22);
            } else if (D2 == 0) {
                System.out.println("D=0-dır");
                x22 = ((-1) * (b2)) / (2 * a2);
                System.out.println("x1" + "=" + "x2" + "=" + x22);
            } else {
                System.out.println("D<0-dır, ona görə də bu tənliyin həqiqi kökü yoxdur!");
            }
        }
    }
}

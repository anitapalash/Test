import org.junit.Test;

public class Triangle {
    private int max, as, bs;

    public void type(int a, int b, int c) {
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Из таких сторон нельзя составить треугольник");
            return;
        }

        if (a > b && a > c) {
            max = a;
            as = b;
            bs = c;
        } else if (b > a && b > c) {
            max = b;
            as = a;
            bs = c;
        } else if (c > b && c > a) {
            max = c;
            as = b;
            bs = a;
        } else if (a == b && b== c) {
            System.out.println("Треугольник остроугольный");
            return;
        }

        if (max >= as + bs) {
            System.out.println("Из таких сторон нельзя составить треугольник");
            return;
        }

        max = (int) Math.pow((double) max, 2.0);
        as = (int) Math.pow((double) as, 2.0);
        bs = (int) Math.pow((double) bs, 2.0);

        int res = 0;

        if (max == (as+bs))
            res = 1;
        else if (max < (as + bs))
            res = 2;
        else if (max > (as+bs))
            res = 3;


        switch (res) {
            case 1:
                System.out.println("Треугольник прямоугольный");
                break;
            case 2:
                System.out.println("Треугольник остроугольный");
                break;
            case 3:
                System.out.println("Треугольник тупоугольный");
                break;
        }

    }

    @Test
    public void test() {
        type(1, 1, 1);
        type(8, 16, 25);           //нельзя составить
        type(3, 4, 5);              //прямоугольный
        type(5, 6, 7);              //остроугольный
        type (3, 4, 6);             //тупоугольный
        type(0, 1, 0);
    }
}


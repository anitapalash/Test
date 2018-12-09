import org.junit.Test;

public class Triangle {
    private int max, as, bs;

    public void type(int a, int b, int c) {
        if (a == 0 || b == 0 || c == 0) {           //если хотя бы одна сторона равна 0, то треугольник составить нельзя
            System.out.println("Из таких сторон нельзя составить треугольник");
            return;
        }

        if (a == b && b== c) {                      //если треугольник равносторонний, то он остроугольный
            System.out.println("Треугольник остроугольный");
            return;
        } else if (a > b && a > c) {                //находим максимальное из трёх чисел
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
        }

        if (max >= as + bs) {           //проверяем, возможно ли составить треугольник из данных сторон
            System.out.println("Из таких сторон нельзя составить треугольник");
            return;
        }

        //возводим все стороны в квадрат
        max = (int) Math.pow((double) max, 2.0);
        as = (int) Math.pow((double) as, 2.0);
        bs = (int) Math.pow((double) bs, 2.0);

        int res = 0;            //вводим переменную, для вывода результата

        if (max == (as+bs))                 //условие, при котором треугольник прямоугольный
            res = 1;
        else if (max < (as + bs))           //условие, при котором треугольник остроугольный
            res = 2;
        else if (max > (as+bs))             //условие, при котором треугольник тупоугольный
            res = 3;


        switch (res) {                      //вывод результата
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
    public void test() {            //Unit-тест метода
        type(1, 1, 1);              //остроугольный
        type(8, 16, 25);            //нельзя составить
        type(3, 4, 5);              //прямоугольный
        type(5, 6, 7);              //остроугольный
        type (3, 4, 6);             //тупоугольный
        type(0, 1, 0);              //нельзя составить
    }
}


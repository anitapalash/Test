public class FirstLine {
    public static void main(String[] args) {
        //Тест для первой функции
        int[] a = {0, 1, 2, 3, 4};
        int[] b = {0, 1, 2, 3, 4};
        int[] c = {1, 2, 3, 4, 5};
        int[] d = {0, 1};

        System.out.println(isArrayEqual(a, b));
        System.out.println(isArrayEqual(a, c));
        System.out.println(isArrayEqual(a, d));
        System.out.println("\n=====================================\n");

        //Тест для второй функции
        System.out.println("15! = " + IntFactorial(15));
        System.out.println("\n=====================================\n");

        //Тест для третьей функции
        FigVam(20);
    }

    //first task
    //Функция, проверяющая равны ли по содержанию два массива чисел(без использования библиотечных функций)
    private static boolean isArrayEqual(int[] a, int[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }

        return true;
    }

    //second task
    //Эффективная по времени реализация нахождения факториала
    private static int IntFactorial(int x) {
        if (x == 1)
            return 1;
        return (x * IntFactorial(x - 1));
    }

    //third task
    //Для каждого числа от 1 до N:
    //если число делится на 3, но не делится на 5, вывести Фиг
    //если число делится на 5, но не делится на 3, вывести Вам
    //если число делится на 3 и 5, вывести ФигВам
    //если ни одно из условий не выполняется, вывести само число
    private static void FigVam(int n) {
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 != 0))
                System.out.println("Фиг");
            else if ((i % 3 != 0) && (i % 5 == 0))
                System.out.println("Вам");
            else if ((i % 3 == 0) && (i % 5 == 0))
                System.out.println("ФигВам");
            else
                System.out.println(i);
        }
    }
}

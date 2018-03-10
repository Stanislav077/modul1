import java.util.Scanner;




public class Main {

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {

        //Задачка номер 2
     /*   Scanner in = new Scanner(System.in);
        int num;
        int maxnum;
        int counts;
        System.out.println("Введите крайнее число диопозона");
        maxnum = in.nextInt();
        System.out.println("Введите кол-во попыток");
        counts = in.nextInt();
        final int min = 1;
        final int max = maxnum;
        final int rnd = rnd(min, max);
        int i = 0;
        while (i < counts) {
            System.out.println("Введите число");
            num = in.nextInt();
            if (num == rnd) {
                System.out.println("Вы угадали");
                break;
            } else if (num > rnd) {
                System.out.println("Ваше число больше");
            } else if (num < rnd) {
                System.out.println("Ваше число меньше");
            }
            i++;
            if (i == counts) {
                System.out.println("Попытки закончились");
            }
        }
        System.out.println("Загаданное число: " + rnd);
        */

    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;



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
// Задачка номер 3
   /*     int[] array = {1, 4, 5, 1, 1, 3, 3};
        int[] arrayNew = new int[array.length];
        int counterForArrayNew = 0;
        boolean checkTheSame = false;

        System.out.println("Исходный массив");
        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(array[i] + ", ");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j] & i != j) {
                    checkTheSame = true;
                }
            }
            if(!checkTheSame) {
                arrayNew[counterForArrayNew++] = array[i];
            }
            checkTheSame = false;

        }
        System.out.println();
        System.out.println("Различные элементы массива:");
        for (int i = 0; i < arrayNew.length & arrayNew[i] != 0; i++) {
            System.out.print(arrayNew[i] + ", ");
        }
 */
// Задачка номер 4

        ReadFile readFile = new ReadFile();
        try {
          String arr =  readFile.read("F:\\test.txt");
          String[] rgs =  arr.split(",");
int j;
int k;
int s=0;



            for (j=0;j<rgs.length;j++){
                for (k=j+1;k<rgs.length;k++){

                    if(rgs[j].compareTo(rgs[k]) ==0){
                        System.out.println(rgs[j]+" "+rgs[k]);
                 
                    }
                }
            }
            System.out.println(s);

        } catch (IOException e) {
            System.out.println("------File not found----------");
            e.printStackTrace();
        }finally {
            System.out.println("------Finally--------");

        }




    }
}


import java.util.Arrays;
import java.util.Scanner;
public class Class {
    /**
     * Дано натуральное число n ≤ 999999.
     * Заполнить массив его цифрами, расположенными в обратном порядке
     * (первый элемент равен последней цифре, второй — предпоследней и т. д.).
     */
    public static void Task10() {
        System.out.println("Task#10");
        System.out.println("Enter N: ");
        int n = new Scanner(System.in).nextInt();
        if(n > 999999){
            System.out.println("N не соответствует условию.");
        }
        else {
            int[] arr = new int[n];
            for(int i = 0; i <n; i++){ //заполняю массив числами n;
                arr[i] = i + 1;
               // System.out.println(arr[i]);
            }
            //переворот массива;
            int temp = 0;       //счетчик элементов;
            for(int i = 0; i < arr.length/2; i++){
                temp = arr[i];
                arr[i] = arr[arr.length-1-i]; //переворачиваю;
                arr[arr.length-1-i] = temp;
            }
            System.out.println(Arrays.toString(arr)); //вывод;
        }
    }

    /**
     * Даны вещественные числа а1, а2, ..., an.
     * Поменять местами наибольший и наименьший элементы.
     */
    public static void Task35() {
        System.out.println("Task#35");
        int a[] = {1, 23, 3, 4, 5, 6, 54, 87, 12, 45}; // Вещ. числа в массиве;
        int max = a[0];  //массивы для хранения элементов;
        int min = a[0];
        int imax = 0;   //для хранения адресов;
        int imin = 0;
        System.out.println("Изначальный массив: ");
        for (int i = 0; i < a.length; i++) { //Вывожу изначальный массив;
            System.out.print(a[i] + " ");
        }
        for (int i = 1; i < a.length; i++) { //прохожу по каждому элементу;
            if (a[i] > max) { //находим адрес максимального
                max = a[i];   //значение
                imax = i;     //адрес
            }
            if (a[i] < min) {                //находим адрес минимального
                min = a[i];
                imin = i;
            }
        }
        //обращаюсь по адресу и меняю;
        a[imin] = max;
        a[imax] = min;
        System.out.println("\nОтвет: ");
        for (int i = 0; i < a.length; i++) { //Вывожу измененный массив;
            System.out.print(a[i] + " ");
        }

    }

    /**
     * Даны два вектора {хi}, {уi}, i = 1, ..., 10, упорядоченные по возрастанию.
     * Объединить их в один вектор {zi}, i = 1, ..., 20, так чтобы сохранилась упорядоченность.
     */
    public static void Task58() {
        System.out.println("\nTask#58");
        //Векторы;
        int[] x = new int[11];
        int[] y = new int[11];
        int[] z = new int[22];
        int k, a;
        System.out.println("   Первый вектор x: ");
     for (int i = 1; i <=10; i++){
         x[i] = (int) (Math.random() * 99);
         System.out.println("x[" + i + "]= " + x[i]);      //вывод вектора;
}
        System.out.println("   Второй вектор y: ");
     for (int i = 1; i <= 10; i++) {
     y[i] = (int) (Math.random() * 99);
         System.out.println("y[" + i + "]= " + y[i]);      //вывод второго;
}             //слияние;
     int count = 0;                //счетчик элементов для z;
     for(int i = 0; i < x.length; i++){
    z[i] = x[i];                   //добавляю элементы из x;
    count++;
}
     for(int j = 0; j < y.length; j++){
    z[count++] = y[j];             //добавляю элементы из y;
}
          System.out.println("   Слитый вектор z: ");
     for(int i = 0; i<z.length; i ++){
          System.out.println("z[" + i + "]= " + z[i]);
}

              //сортировка;
        for(k = 1; k <= 19; k++){
            for(int i = 1; i <= 19; i++){
                if(z[i] > z[i + 1]){
                    a = z[i];
                    z[i] = z[i + 1];
                    z[i + 1] = a;
                }                //по возростанию;
            }
        }
        System.out.println("   Упорядоченный слитый вектор: ");
        for(int i = 1; i <= 20; i ++){
            System.out.println("z[" + i + "]= " + z[i]);
        }
    }

    /**
     * Дана последовательность вещественных чисел а1, a2, ..., а15.
     *    Определить, является ли она упорядоченной по возрастанию.
     *    В случае отрицательного ответа определить порядковый номер первого числа,
     *    нарушающего такую упорядоченность.
     */
    public static void Task85() {
        System.out.println("Task#85");
        int[] arr = new int[10];      //наш массив последовательности;
        int n = 0;
        for(int i = 1; i < 10; i++){
            System.out.println("Введите "+ i + "-ое число: ");
            int i1 = new Scanner(System.in).nextInt();  //ввод
            arr[i] = i1;
            if(i1 > 1 && arr[i] < arr[i - 1]){ //проверка на последовательность;
                n = i1;
            }
            if(n == 0){  //Если не по предыдущему условию;
                System.out.println("Упорядочено по возростанию.");
            } else {     //если нарушино в первом условии;
                System.out.println("Последовательность не упорядочена!\nНомер числа, норушающего последовательность: " + n);
            }
        }
    }

    /**
     * На i-e место одномерного массива целых чисел вставить число,
     *    равное произведению первого и последнего элементов.
     */
    public static void Task110() {
        System.out.println("Task#110");
        int n;                 //количество чисел в массиве
        int i;                 //номер
        int k;                 //номер меняемого числа
        System.out.println("Введите количество чисел в массиве \n");
        n = new Scanner(System.in).nextInt();
        int[] arr = new int[n + 1];  //наш массив;
        for (i = 1; i <= n; i++ )
        {   arr[i] = (int) (Math.random() * 99);
            System.out.println("Номер " + i + " = "+ arr[i]);
        }
        System.out.println("Введите номер меняемого числа \n");
        k = new Scanner(System.in).nextInt();  //ввод номера элемента для замены;
        arr[k] = arr[1] *  arr[n];             //Умножаю на первый и последний элемент;

        {
            System.out.println("Номер " + k + " = " + arr[1] + " * " + arr[n] + " = " + arr[k]);
            System.out.println("Номер " + k + " теперь = " + arr[k]); //вывод ответа;
        }
    }

    public static void main(String[] args) {
        Task10();
        Task35();
        Task58();
        Task85();
        Task110();
    }
}
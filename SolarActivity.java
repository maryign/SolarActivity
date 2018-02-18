/*На спутнике «Восход» установлен прибор, предназначенный для измерения солнечной активности.
  Каждую минуту прибор передаёт по каналу связи неотрицательное целое число – количество энергии солнечного излучения,
  полученной за последнюю минуту, измеренное в условных единицах. Временем, в течение которого происходит передача,
  можно пренебречь. Необходимо найти в заданной серии показаний прибора минимальное нечётное произведение двух показаний,
  между моментами передачи которых прошло не менее 6 минут.  Количество энергии, получаемое прибором за минуту, не превышает 1000 условных единиц.
  Общее количество показаний прибора в серии не превышает 10 000.

  Задача  Напишите программу для решения поставленной задачи, которая будет эффективна как по времени,
  так и по памяти (или хотя бы по одной из этих характеристик).
  Входные данные представлены следующим образом. В первой строке задаётся число N – общее количество показаний прибора.
  Гарантируется, что N > 6. В каждой из следующих N строк задаётся одно положительное целое число – очередное показание прибора.
  */

import java.util.ArrayList;
import java.util.Random;

public class SolarActivity {
    //N – общее количество показаний прибора, N > 6, arr[i]>0
    public static int test(int N, int arr []){
//        int N;
//        int arr [] = new int[N];

        ArrayList <Integer> proizv = new ArrayList<Integer>();
        int min=1000000;
        for(int i = 0;i<N;i++){
            if(i+6<arr.length){
            int proiz = arr[i]*arr[i+6];
//            System.out.println(proiz);
//            System.out.println(proiz%2);

            if(proiz%2!=0){
                System.out.println(proiz);
//            proizv.add(proiz);

//                min = proiz;
//                for(int n =1;n<proizv.size();n++){
//        System.out.println(proizv.get(n));
                    if(proiz<min) {
                        min = proiz;
//            System.out.println(min);
                    }

            }
        }}
//        int min = proizv.get(0);
//        for(int n =1;n<proizv.size();n++){
////        System.out.println(proizv.get(n));
//
//        if(proizv.get(n)<min){
//            min =proizv.get(n);
////            System.out.println(min);
//        }
//        }
//return min;
        return min!=0 ? min :-1;
//        else return -1;
       //минимальное нечётное произведение двух показаний, между моментами передачи которых прошло не менее 6 минут
       //Если получить такое произведение не удаётся, ответ считается равным –1.
    }
    public static void main(String[] args) {
        int N = 100;
        int arr [] = new int[N];
        Random rand = new Random();
        for(int i=0;i<N;i++){
            arr[i]=rand.nextInt(1001);
//            System.out.println(arr[i]);
        }

        System.out.println(test( N, arr));
    }
}

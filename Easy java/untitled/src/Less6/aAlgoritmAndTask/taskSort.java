package Less6.aAlgoritmAndTask;

import java.util.Arrays;

public class taskSort {
    public static void main(String[] args) {
        int[] array = {1,5,4,3,2};
        System.out.println("Сам массив" + Arrays.toString(array));
        System.out.println("Длина массива " + array.length);
        bubleSort(array);
    }
    public static void bubleSort(int[] array){
        for (int i = array.length -1; i >=0 ; i--) {//этот счетчик нужен просто чтоб перемещаться по массиву
            System.out.println("Внешний цикл равен " + i);
            for(int j=0; j<i; j++){ //мы двигаем какое то число слева на право или с право на лево и чтобы узнать сколько раз мы его двигаем мы используем этот цикл
                System.out.println("Внутренний цикл равен " + j + "и он начался");
             if (array[j]>array[j+1]){//один элемент больше другого? если да то надо его подвинуть, как? сейчас покажу
                 int t = array[j];//создаесм переменную и в неё записываем число, которое надо подвинуть
                 array[j] = array[j+1];//на индекс старого массива мы записываем нвоое число которое меньше него
                 array[j+1]=t;//на новый индекс записываем новое число
                 System.out.println(Arrays.toString(array));
                 System.out.println("Внутренний цикл равен " + j + "и он закончился");
             }
             else {
                 System.out.println("оказалось что выбранное число меньше соседнего");
             }
            }

        }

    }


}

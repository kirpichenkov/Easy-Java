package Less6.aAlgoritmAndTask.bubleSort;

import java.util.Arrays;

public class bubleSortASK {
    public static void bubleSortASK(int[] array) {
        for(int i=0; i<array.length; i++){
            System.out.println("Создали первый цикл. Сейчас ВНЕШНИЙ цикл равен"+ i );
                for (int j = 0; array[j] <array[i] ; j++) {
                    System.out.println("Значение массива "+ array[j] + " меньше" + "значения " + array[i]+" Если да, то ты увидел это сообщение и сейчас масиив будет тусоваться, если нет, то он просто внутрь цикла не зашел а пошёл обновлять цикл");
                    int temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                    System.out.println("Сам массив" + Arrays.toString(array));
                }

            }
        }


    public static void main(String[] args) {
        int [] mass = {127,43,123,95,64,891};
        System.out.println("Сам массив" + Arrays.toString(mass));
        bubleSortASK(mass);
        System.out.println("Сам массив" + Arrays.toString(mass));
    }
}

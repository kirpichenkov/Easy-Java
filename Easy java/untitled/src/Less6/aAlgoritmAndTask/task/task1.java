package Less6.aAlgoritmAndTask.task;

import java.util.Arrays;
/*задача1
В королевстве эльфов паника - перепутили бочки с вином и приворотным зельем,
а скоро начнется бал! Представляете, что начнется на эльфиской вечеринке, если
все выпьют зелье вместо вина. Нужно достать все бочки вина, если известно, что маркировка бочки
четная - то это вино, а если нет - то зелье.
 */


public class task1 {
    public static void main(String[] args) {
    int [] vinteca = {12,24,1,21,14};
    sortArray(vinteca);
    }
    public static void sortArray(int[] array){
        int wineCount = 0;
        for (int i:array) {
            if(i%2==0){
                wineCount++;
            }
        }
        int[] wineArray = new int[wineCount];
        for (int i = 0, j=0; i < array.length; i++) {               //вторая переменная здесь для того, чтобы счетчик был для меньшего массива отдельный
            if(array[i]%2==0){
                wineArray[j]=array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(wineArray));
    }
}

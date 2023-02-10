package Less5.aLec;
import  java.util.Arrays;

public class CucleFor {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        for (int i = 0, j=10; i < j; i++, j--) {
//            System.out.println(i+" "+j );
//
//        }
        
        int [] level = new int[10];
        for (int i = 0; i < level.length; i++) {
        level[i] = i+1;

        }
        System.out.println(Arrays.toString(level));

//        int [][] matrix = new int[5][5];
//        for(int i:matrix) {
//            i++;}
//        for(int j: matrix){
//            j++;
//        }

    }
}

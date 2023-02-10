package Less6.aAlgoritmAndTask.task;
/*
На полу в квадратной комнате подземелья есть плиты, и герою нужно пройти определенную
последовательность, чтобы открыть дверь. Ключ к решению загадки:
от верхнего левого угла к правому нижнему и от правого верхнего к левому нижнему.
 */
public class task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        fillDiags(matrix);
    }

    public static void fillDiags(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i==j) array[i][j] = 1;
                if(i+j == array.length-1) array[i][j] = 1;
                System.out.print(array[i][j]+ " " );
            }
            System.out.println();
        }
    }


}

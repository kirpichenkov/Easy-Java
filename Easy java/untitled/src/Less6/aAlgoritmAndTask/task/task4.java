package Less6.aAlgoritmAndTask.task;

public class task4 {
    public static void main(String[] args) {

    }
    public static void snaiMatrix(int[][] array){
        int a=0;
        int n =array.length;
        int m;
        if(n%2==0) m=n/2;
        else m = (n+1)/2;
        for(int i = 0; i<m; i++){
            for (int j = i; j < n-1 ; j++) {
                array[i][j]=a;
                a++;
            }
            for(int j=i+1;j<n-1; j++){
                array[j][n-i-1]=a;
                a++;
            }
        }
    }
}

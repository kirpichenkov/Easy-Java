package Less6.aAlgoritmAndTask.task;
/*
У входа в подземелье строгое условие на разницу уровней. Нужно найти самого старшего
т самого младшего участников группы и найти между ними разницу.
 */
public class task2 {
    public static void main(String[] args) {
        int[] level = {1,2,5};
        difence(level);
    }
    public static void difence(int[] level){
        int max=level[0];
        int min=level[0];
        for (int i = 0; i < level.length; i++) {
            if (level[i]<min){
                min = level[i];
            }else{if(level[i]>max){
                max = level[i];
            }
            }
        }
        System.out.println("" +
                "Максимальный уровень равен " + max + " Минимальный уровень равен " + min);
        System.out.println("Разница между уровнями равна: " + (max-min));
    }
}

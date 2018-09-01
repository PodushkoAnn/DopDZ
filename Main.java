//заполнение матрицы по спирали 4 строки*7 столбцов
//10*10 выглядит круче)

public class Main {
    public static void main(String[] args) {

        final int ROWS = 4;
        final int COLUMNS = 7;

        int [][] arr = new int [ROWS][COLUMNS];

        fill(arr);
        print(arr);

    }

    private static void fill(int[][] arr) {
        int x = 1;

        for (int i = 0; i < arr.length/2; i++) {
            //слева направо
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0) {
                    arr[i][j] = x;
                    x++;
                }
            }
            //сверху вниз
            for (int j = i; j < arr.length; j++) {
                if(arr[j][arr[i].length - i - 1] == 0){
                    arr[j][arr[i].length - i - 1] = x;
                    x++;
                }
            }
            //справа налево
            for (int j = arr[i].length - 1; j >= 0; j--) {
                if(arr[arr.length - i - 1][j] == 0){
                    arr[arr.length - i - 1][j] = x;
                    x++;
                }
            }
            //снизу вверх
            for (int j = arr.length - 1; j >= 0 ; j--) {
                if(arr[j][i] == 0){
                    arr[j][i] = x;
                    x++;
                }
            }
        }
    }

    private static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}



package ua.univer.lesson04;
class Box{
    int x;
    int y;
}
public class Program {
    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swap x in swap= " + x);
        System.out.println("After swap y in swap= " + y);
    }
    public static void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    public static void swap(int[][] matrix){
        int[] temp = matrix[0];
        matrix[0] = matrix[1];
        matrix[1] = temp;

    }
    public static void swap(int[][][] matrix){
        int[][] temp = matrix[0];
        matrix[0] = matrix[1];
        matrix[1] = temp;

    }
    public static void swap(Box box){
        int temp = box.x;
        box.x = box.y;
        box.y = temp;
    }

    public static int[] getSwapMas(int[] arr){
        int[] tempMas = new int[arr.length];
        tempMas[0] = arr[1];
        tempMas[1] = arr[0];
        return tempMas;
    }
    public static void printMatrix(int [][] matrix){
        System.out.println("*****************");
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(matrix[1].length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        swap(x, y);
        System.out.println("After swap x in main= " + x);
        System.out.println("After swap y in main= " + y);
        int [] arr = new int[2];
        arr[0] = x;
        arr[1] = y;

        swap(arr);

        System.out.println("After swap arr[0] in main= " + arr[0]);
        System.out.println("After swap arr[1] in main= " + arr[1]);

        int[] arrSwap = getSwapMas(arr);

        int [][] matrix = new int [2][3];
        matrix[0][0] = 11;
        matrix[0][1] = 12;
        matrix[0][2] = 13;
        matrix[1][0] = 21;
        matrix[1][1] = 22;
        matrix[1][2] = 23;

        printMatrix(matrix);
        printMatrix(matrix);

        Box box1 = new Box();
        box1.x = x;
        box1.y = y;
        System.out.println("Before swap box1.x=" + box1.x);
        System.out.println("Before swap box1.y=" + box1.y);
        swap(box1);
        System.out.println("After swap box1.x=" + box1.x);
        System.out.println("After swap box1.y=" + box1.y);
        box1 = null;
        Box box2 = new Box();
        box2.x = 10;
        box2.y = 20;

        System.out.println("Before swap box1.x=" + box2.x);
        System.out.println("Before swap box1.y=" + box2.y);
        swap(box2);
        System.out.println("After swap box1.x=" + box2.x);
        System.out.println("After swap box1.y=" + box2.y);
    }
}

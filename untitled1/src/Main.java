public class Main {
    public static void main(String[] args) {

        Matrix mx  = new Matrix (3,3);
        Matrix mx2 = new Matrix (3,3);
        Matrix mx3,mx4,mx5,mx6;

        mx.output();
        mx2.output();

        //Сложение
        System.out.println("Сложение:");
        mx3 = mx.plusMatrix(mx2);
        mx3.output();

        //№1 умножается на 3
        System.out.println("Матрица №1 умножается на число 3: ");
        mx4 = mx.multiNumber(4);
        mx4.output();

        //№3 умножается на 3
        System.out.println("Матрица №3 умножается на число 3:");
        mx5 = mx2.multiNumber(4);
        mx5.output();

        //Умножение матриц
        System.out.println("Матрицы умножаются друг на друга:");
        mx6 = mx.multiMatrix(mx2);
        mx6.output();
    }
}
import java.util.*;

// Class
public class My_Mat {
    //Функция проверки матрицы на симетричность
    static void check_matrix(int matrix[][], int row, int col)
    {
        int i, j, flag = 1;

        // Display message
        System.out.println("Сформированная матрица:");

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println("");
        }

        // Нахождение транспонированной матрицы
        int[][] transpose = new int[row][col];

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Вывод результатов
        if (row == col) {

            for (i = 0; i < row; i++) {
                for (j = 0; j < col; j++) {
                    if (matrix[i][j] != transpose[i][j]) {
                        flag = 0;
                        break;
                    }
                }

                if (flag == 0) {
                    System.out.print("\nМатрица несиметричная");
                    break;
                }
            }

            if (flag == 1) {
                System.out.print("\nМатрица симетричная");
            }
        }

        else {
            System.out.print("\nМатрица не симетричная");
        }
    }


    public static void main(String[] args)
    {
        // Получение входных данных от пользователя
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int i, j, row, col, size1, size2, size3;

        System.out.print("Задание 1\n\n");
        System.out.print("________________________________\n");

        // Получение входных данных от пользователя
        System.out.print("Введите размер первого массива:");
        size1 = sc2.nextInt();

        System.out.print("Введите элементы первого массива:");
        int[] mass1 = new int[size1];

        for(i = 0; i < size1; i++){
            mass1[i] = sc2.nextInt();
        }
        System.out.print(Arrays.toString(mass1) + "\n");

        System.out.print("Введите размер второго массива:");
        size2 = sc2.nextInt();

        System.out.print("Введите элементы второго массива:");
        int[] mass2 = new int[size2];

        for(i = 0; i < size2; i++){
            mass2[i] = sc2.nextInt();
        }
        System.out.print(Arrays.toString(mass2) + "\n");

        System.out.print("Введите размер массива индексов:");
        size3 = sc2.nextInt();

        System.out.print("Введите элементы массива индексов:");

        int[] mass3 = new int[size3];

        for(i = 0; i < size3; i++){
            mass3[i] = sc2.nextInt();
        }
        System.out.print(Arrays.toString(mass3) + "\n");

        //Процесс изменения матриц
        int flag = 0;
        for(i = 0; i < size3; i++) {
            int k = 0, n = 0;
            k = mass3[i];
            if (k < (size1 & size2)) {
                n = mass1[k];
                mass1[k] = mass2[k];
                mass2[k] = n;
            }
            else
                flag = 1;

        }

        //Вывод результатов
        if (flag == 0) {
            System.out.print("Измененные массивы\n");
            System.out.print(Arrays.toString(mass1) + "\n");
            System.out.print(Arrays.toString(mass2) + "\n");
        }
        else {
            System.out.print("В массиве индексов введен неверный индекс\n");
        }

        System.out.print("________________________________\n");
        System.out.print("Задание 2\n\n");
        System.out.print("________________________________\n");

        // Получение входных данных от пользователя
        System.out.print("Введите количество сторк:");
        row = sc.nextInt();

        System.out.print("Введите количество столбцов:");
        col = sc.nextInt();

        // Объявление двумерной матрицы
        int[][] matrix = new int[row][col];

        System.out.println("Введите элементы матрицы:");

        //Создание двумерной матрицы
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Проверка на симетричность
        check_matrix(matrix, row, col);
        System.out.print("________________________________\n");
    }
}

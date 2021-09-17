package Massiv;

public class Bubble {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;
        int size;

        size = 10;  // количество сортируемых элементов

        //отобразить исходный масив
        System.out.println("Исходный масив:");
        for(int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        // Реализовать алгоритм пузырьковой сортировки
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {   // если требуемый порядок
                if (nums[b - 1] > nums[b]) {   // следования не соблюдается,
                                                // поменять элементы местами
                    t = nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        System.out.println("Отсортированный масив:");
            for (int i = 0; i < size; i++)
                System.out.print(" " + nums[i]);
        System.out.println();
    }
}

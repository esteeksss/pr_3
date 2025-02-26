import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] cat =
                {
                        {3, 6, 1},
                        {9, 2, 7},
                        {4, 8, 5}
                };
        insertionSort(cat);
        for (int i = 0; i < cat.length; i++)
        {
            System.out.println(Arrays.toString(cat[i]));
        }
    }
    public static void insertionSort(int[][] cat)
    {
        for (int i = 0; i < cat.length; i++)
        {
            for (int j = 1; j < cat[i].length; j++)
            {
                int meow = cat[i][j];
                int a = j - 1;
                for (; a >= 0 && cat[i][a] > meow; a--) {
                    cat[i][a + 1] = cat[i][a];
                }
                cat[i][a + 1] = meow;
            }
        }
    }
}
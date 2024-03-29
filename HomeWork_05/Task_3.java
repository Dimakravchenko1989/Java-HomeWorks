// Задача 3. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. 
// Пример вывода доски 8x8

// 0  -  -  -  -  -  -  - 
// 0  -  -  -  -  -  -  -
// 0  -  -  -  -  -  -  -
// -  -  -  -  -  -  -  0
// -  -  -  -  -  0  -  -
// -  -  0  -  -  -  -  -
// -  -  0  -  -  -  -  -
// 0  -  -  -  -  -  -  -

public class Task_3 {
    public static void main(String[] args) {
        int[] figure = new int[8];

        positionFigure(figure, 3);

        for (int horiz = 0; horiz < figure.length; horiz++) {
            for (int vertic = 0; vertic < figure.length; vertic++) {
                if (figure[horiz] == vertic) System.out.print(" 0 ");
                else System.out.print(" - ");
            }

            System.out.println();
        }
    }

    public static boolean positionFigure(int[] array, int horiz) {
        if (horiz == array.length) return true;

        for (int i = 0; i < array.length; i++) {
            boolean position = true;

            for (int j = 0; j < horiz; j++) {
                if (array[j] == i || array[j] == i - horiz + j || array[j] == i + horiz - j) {
                 position = false;
                    break;
                }
            }

            if  (position) {
                array[horiz] = i;

                if (positionFigure(array, horiz + 1)) return true;
            }
        }

        return false;
    }
}

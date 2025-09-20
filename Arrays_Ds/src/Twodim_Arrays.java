import java.util.Arrays;

public class Twodim_Arrays {
    public static void main(String[] args) {

        // 2D arrays
        // cant initialize 2d arrays with elements when size is mentioned
        int[][] twod_Arrays1 = new int[4][4]; // row x columns // 3-> nested arrays 2-> elements in each nested arrays
        int[][] twod_Arrays2 = new int[][]{{1, 2}, {3, 4}, {5, 6}}; // 3x2 -> 3 nested arrays and 2 columns
        System.out.println(twod_Arrays1.length); // number of nested arrays

        for (int[] outer : twod_Arrays1) {
            System.out.println(Arrays.toString(outer));
        }
        for (int i = 0; i < twod_Arrays2.length; i++) { //3
            var innerArray = twod_Arrays2[i]; //1st nested array
            for (int j = 0; j < innerArray.length; j++) { //1st nested array length =>2
                System.out.println(twod_Arrays2[i][j]);
            }
            System.out.println();
        }

        // use of enhanced for
        for (var outer : twod_Arrays2) {
            for (var elements : outer) {
                System.out.print(elements + " ");
            }
            System.out.println();
        }

        // Arrays.deepToString(2d array)
        System.out.println(Arrays.deepToString(twod_Arrays2));

        // 2d arrays declaring and intialization
        int [][] myArray = new int[3][]; // 3 integer arrays whose size is not specified


    }
}

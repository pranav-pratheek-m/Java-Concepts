
public class RowColumnMajor {
    public static final void main(String[] args) {
        int[][] cuboidrow = new int[2][3];
        int[][] cuboidcolumn = new int[3][3];

        cuboidrow[0][0] = 10;
        cuboidrow[0][1] = 8;
        cuboidrow[0][2] = 6;

        cuboidrow[1][0] = 12;
        cuboidrow[1][1] = 6;
        cuboidrow[1][2] = 3;

        cuboidcolumn[0][0] = 20; // all lengths
        cuboidcolumn[1][0] = 16;
        cuboidcolumn[2][0] = 14;

        cuboidcolumn[0][1] = 10; // all breadths
        cuboidcolumn[1][1] = 8;
        cuboidcolumn[2][1] = 6;

        cuboidcolumn[0][2] = 4; // all heights
        cuboidcolumn[1][2] = 2;
        cuboidcolumn[2][2] = 2;

        iterateCuboid(cuboidrow);
        iterateCuboid(cuboidcolumn);
    }

    static void iterateCuboid(int[][] cuboid) {

        for (int[] row : cuboid) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println("\n");
        }

    }
}

package ex_15_Array;

public class lab_102_two_dimension_array {
    public static void main(String[] args) {
        // 1,2,3
        // 4,5,6
        // 7,8,9

        // Older Array
        int [][] array_2d_old = {{1,2,3},{4,5,6}, {7,8,9}};  // { {R1} , {R2} , {R3} };
        int [][] array_2_2 = {{1,2},{4,5} };  // { {R1} , {R2} };
        int [][] array_3_1 = {{1}, {4} , {6} };  // { {R1} , {R2} , {R3 }; one column




        // R > 3 , C > 3
        int[][] aray_2d = new int[3][3];
        aray_2d[0][0] = 1;
        aray_2d[0][1] = 2;
        aray_2d[0][2] = 3;
        aray_2d[1][0] = 4;
        aray_2d[1][1] = 5;
        aray_2d[1][2] = 6;
        aray_2d[2][0] = 7;
        aray_2d[2][1] = 8;
        aray_2d[2][2] = 9;

        for(int i = 0; i < array_2d_old.length ; i++){ // Raws
            for(int k = 0; k < array_2d_old[i].length ; k++); {
                //System.out.print(array_2d_old[i][k] + " ");
                System.out.println("*" + " ");
            }// Columns


        }



    }
}

package OOProgramming;

public class OverviewArray {
    public static void main(String[] args) {
//   int a[]=new int[5];
//   a[0]=23;
//        a[0]=23;
//        a[1]=2;
//        a[2]=3;
//        a[3]=33;
//        a[4]=63;
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
        int b[] = {1, 3, 5, 6, 7, 2, 7, 98};
//        for(int w=0;w<b.length;w++){
//            System.out.println(b[w]);
//        }
        for (int w : b) {
            System.out.println(w);
        }
        //multi-dimension array
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        //print 2d array
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }
        int c[][] = new int[3][3];
        int[][] arr1 = {{1, 2, 3}, {4, 5, 2}, {1, 2, 3}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {

                    c[i][j] += arr[i][k] * arr1[k][j];
                }
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("****************************");
        int [][] table={{2,1,4},{4,6,2},{-1,-2,7}};
        int [][] table1={{-2,4,5},{-4,-6,2},{-1,-2,7}};
        int [][] d=new int[3][3];
        for(int r=0;r<3;r++){
            for(int e=0;e<3;e++){
              d[r][e] =0;
              for(int y=0;y<3;y++) {
                  d[r][e] += table[r][y]*table1[y][e];
              }
              System.out.print(d[r][e]+ " ");
            }
            System.out.println();
        }
    }
}

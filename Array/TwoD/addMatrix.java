public class addMatrix {
    public static void main(String[] args) {
        int mar1 [][] = {{1, 2, 3},
                         {4, 5, 6}};
        int mar2 [][] = {{3,5,7},
                        {1,3,2}};
        int total[][] = {{0,0,0},{0,0,0}};       
        for(int i=0;i<mar1.length;i++) {
            for(int j=0;j<mar2.length;j++){
                System.out.format(" the total is i=%d ,j=%d\n",i,j);
                total[i][j] = mar1[i][j]+mar2[i][j];
            }
        }   
    }
}

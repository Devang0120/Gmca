
public class Simple1 {
    public static void main(String[] args) {
        int a[][] = {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };
        int b[][] = {
                { 4, 5 },
                { 8, 5 },
                { 7, 6 }
        };
        int ab[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 2; k++) {
                int ab1 = 0;
                for (int j = 0; j < 3; j++) {
                    ab1 += a[i][j] * b[j][k];
                }

                ab[i][k] = ab1;
            }

        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(ab[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}

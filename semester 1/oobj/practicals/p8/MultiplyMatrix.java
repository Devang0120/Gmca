class Matrix{
    int [][] matrix1 = {
    {1,5,3},
    {8,9,4},
    {7,5,6}
    };
    int [][] matrix2 ={
        {5,8,6},
        {5,8,6},
        {5,3,1}
    };
    // length of matrixs
    int mr1 = matrix1.length;     //matrix1 rows 
    int mc1 = matrix1[0].length;  //matrix1 cols
    int mr2 = matrix2.length;     //matrix2 rows 
    int mc2 = matrix2[0].length;  //matrix2 cols

    int [][]ans = new int[mr1][mr2];
    // Matrix Multiplication
    void multiply(){
        if(mr1 != mc2)
        System.out.println("Multiply of Matrix not Possible"); 
        for(int i=0;i<mr1;i++){
            for(int j=0;j<mc2;j++){
                int a = 0;
                for(int k=0;k<mc2;k++){
                    a += matrix1[i][k] * matrix2[k][j];
                }  
                ans[i][j] = a;
            }
        }
    }

    void matrixDispaly(){
        // Display Matrix 1
        System.out.println("Matrix 1 :-");
        for (int i=0;i<mr1;i++){
            for (int j=0;j<matrix1[0].length;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.err.println("");
        }
        // Display Matrix 2
        System.err.println("\nMatrix 2 :-");
        for(int i=0; i<mr2;i++){
            for(int j=0; j<mc2;j++){
                System.err.print(matrix2[i][j]+" ");
            }
            System.out.println("");
        }
    }

    void display(){
        System.err.println("Answers is :-");
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                System.err.print(ans[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
public class MultiplyMatrix{
public static void main(String args[]){
    Matrix m = new Matrix();
    m.matrixDispaly();
    m.multiply();
    m.display();
    }    
}

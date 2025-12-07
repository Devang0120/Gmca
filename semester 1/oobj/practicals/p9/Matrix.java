public class Matrix{
    int [][]array;
    
    Matrix(int [][]arr){
        this.array = arr;
    }

    void display(){
        for(int i=0;i<array.length;i++){
            int sum = 0;
            for(int j=0;j<array[i].length;j++){
                sum += array[i][j];
            }
            System.err.println("Sum of Row "+(i+1)+" : "+sum);

        }
    }
    public static void main(String []args){
        int [][]arr = {
            {5,7,5},
            {1,8},
            {11,3}
        };
        Matrix m = new Matrix(arr);
        m.display();

    }
}
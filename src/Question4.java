//Create a two dimensional array of integers and display: 1. sum of all elements of each column 2. sum of all elements of each row
public class Question4 {
    static void printarray(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void col(int arr[][])
    {
        int size=arr.length;
        int colsum[]=new int[size];
        for(int i=0;i<size;i++)
        {
            int row=0;
            for(int j=0;j<size;j++)
            {
                row+=arr[j][i];
            }
            colsum[i]=row;
        }
        for(int i=1;i<=size;i++)
        {
            System.out.println("Sum of column"+i+":"+colsum[i-1]);
        }
    }
    static void row(int arr[][])
    {
        int size=arr.length;
        int rowsum[]=new int[size];
        for(int i=0;i<size;i++)
        {
            int col=0;
            for(int j=0;j<size;j++)
            {
                col+=arr[i][j];
            }
            rowsum[i]=col;
        }
        for(int i=1;i<=size;i++)
        {
            System.out.println("Sum of row"+i+":"+rowsum[i-1]);
        }
    }
    public static void main(String[] args) {
        //2-D Array Created
        int arr[][] ={
                {3,8,7},
                {2,9,4},
                {4,6,3}
        };
        System.out.println("Original 2D Array:");
        //Print Array
        printarray(arr);
        //Method to show  sum of column elements colomn wise
        col(arr);
        //Method to show  sum of row elements row wise
        row(arr);

    }
}

public class ArrayBSort {
    
    void BSort1(int B[]){
        
        for (int i = 0; i < B.length-1; i++) {
            for (int j = 0; j < B.length-i-1; j++) {
                if (B[j] > B[j+1]){
                    int C = B[j];
                    B[j] = B[j+1];
                    B[j+1] = C;
                }
            }
        }
    }
    public static int find(int B[], int A){
         
        for (int i = 0; i < B.length;i++) {
             if (B[i] == A){
                return i;
             }
         }
            return -1;
     }
    void Proc(int B[], int A){
        ArrayBSort BSort = new ArrayBSort();
        
        for (int k = 0; k < B.length;k++) {
         int result = find(B,A);
         while (result != -1){
               A = (int) (Math.random() * 2000);
               result = find(B,A);
               if (result == 0){
                   break;
                }
            }
         B[k] = A;
         }
        BSort.BSort1(B);
    }
    void Print(int B[]){
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
    }
    public static void main(String[] args){
        ArrayBSort BSort = new ArrayBSort();
        
        int C[] = new int [2000];
        int A = (int) (Math.random() * 2000);
        
          BSort.Proc(C, A);
          BSort.Print(C);
         
    }   
}

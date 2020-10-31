public class GFG {
    static class Pair {
        int min;
        int max;
    }
    static Pair getp1(int arr[], int n) {
        Pair p1 = new Pair();
        int i;
        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                p1.max = arr[0];
                p1.min = arr[1];
            } else {
                p1.min = arr[0];
                p1.max = arr[1];
            }
            i = 2;
            
        }  else {
            p1.min = arr[0];
            p1.max = arr[0];
            i = 1;
           
        }
        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > p1.max) {
                    p1.max = arr[i];
                }
                if (arr[i + 1] < p1.min) {
                    p1.min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > p1.max) {
                    p1.max = arr[i + 1];
                }
                if (arr[i] < p1.min) {
                    p1.min = arr[i];
                }
            }
            i += 2;
        }
 
        return p1;
    }
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int t = in.nextInt();
       for(int i =0;i<t;i++){
           int n = in.nextInt();
           int ar[] = new int[n];
           Pair solPair = getp1(arr, n);
           System.out.println(solPair.max+" "+solPair.min);

       }
 
    }
}
public class searching {
    public static void main(String args[]) {
        int x=7;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int i = 0; i < arr.length; i++) {
             if (x==arr[i]){
                int result=arr[i];

                System.out.println("Element found:" + i );
             }

        }

    }
}
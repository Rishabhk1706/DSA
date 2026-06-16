public class Bubble {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        for(int i=n-1;i>=1;i--){
            boolean swap = false;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    swap = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!swap) break;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

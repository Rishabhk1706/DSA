public class Selection{
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int mini = arr[i];
            int idx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<mini){
                    mini = arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
class iterative{
public static void iterativeSearch(){
    
        int arr[] = { 23,34,56,78,90,12,78,87,65,43,21 };
        int element = 90;int ans = search(arr, element);
        if (ans == -1)
            System.out.println(
                    "Entered Element is not present in array"+".");
        else
            System.out.println("Entered Element is present at index Number"+" "+ ans+".");
    }
   public static int search(int arr[], int element){
    
        int number = arr.length;
        for (int i = 0; i < number; i++) {
            if (arr[i] == element)
                return i;
        }
        return -1;
    }
}

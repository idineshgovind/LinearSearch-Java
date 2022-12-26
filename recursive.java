 class recursive{
  
     static int arrayElement[] = {23,4,5,67,89,90,12,32};
      

     static int recursiveSearch(int arrayElement[], int left, int right, int number){
          if (right < left)
             return -1;
          if (arrayElement[left] == number)
             return left;
          if (arrayElement[right] == number)
             return right;
          return recursiveSearch(arrayElement, left+1, right-1, number);
     }

  public static void recursiveSearch(){
        int number = 3;
        int indexNumber = recursiveSearch(arrayElement, 0, arrayElement.length-1, number);
        if (indexNumber != -1)
           System.out.println("Entered Element " + number + " is present at index Number " + indexNumber+".");
        else
            System.out.println("Entered Element " + number + " is not present index Number"+".");
        }
 }

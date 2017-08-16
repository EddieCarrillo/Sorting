

public class SelectionSort{
    public static void main(String[] args){
      int[] arr = {1,-1,99,101,-12,};
      int[] solution = {-12, -1, 1, 99, 101};

      System.out.print("Before sorted: \t");
      printArr(arr);
      SelectionSort.sort(arr);
      System.out.print("After sorted: \t");
      printArr(arr);
      System.out.println("Is correct solution: " + checkSolution(solution, arr));
      System.out.println("Here is the correct solution: \n");
      printArr(solution);
    }

    public static void sort(int[] arr){
      //Iterate throughout all of the unsorted portion.
      for(int i = 0; i < arr.length; i++){
        int lastSortedItem = i;
        int minIndex = findMin(arr, i);
        System.out.print("min: " + arr[minIndex] +  "\t");
        printArr(arr);
        System.out.println();
        swap(arr, lastSortedItem, minIndex);

      }
    }

/*returns index of min item in list.*/
    public static int findMin(int[] arr, int startIndex){
      int min = startIndex;
      for(int i = startIndex + 1; i < arr.length; i++){
        if (arr[i] < arr[min]){ //If we found new min candidate
          System.out.println(arr[i]);
                      min = i;
        }
      }

      return min;

    }


    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }

    }

    public static boolean checkSolution(int[] solution, int[] answer){
        for(int i = 0; i < solution.length; i++){
            if (solution[i] != answer[i]){
                return false;
            }
        }

        return true;
    }


//Swaps the position of two elements of an array.
    public static void swap(int[] arr, int index_a, int index_b){
        int oldValue = arr[index_a];
        arr[index_a] = arr[index_b];
        arr[index_b] = oldValue;

    }




}

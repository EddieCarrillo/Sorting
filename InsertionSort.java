
public class InsertionSort{
    //Sorts the array in increasing order.
    public static void sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int target = arr[i];
            int j = i;
            while(j > 0 && target < arr[j - 1]){
                swap(arr, j, j-1);
                j--;
            }
        }
    }

    public static void swap(int[] arr, int index_a, int index_b){
        int oldValue = arr[index_a];
        arr[index_a] = arr[index_b];
        arr[index_b] = oldValue;

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


public static void main(String[] args){
    int[] arr = {1,-1,99,101,-12,};
    int[] solution = {-12, -1, 1, 99, 101};

    System.out.print("Before sorted: \t");
    printArr(arr);
    InsertionSort.sort(arr);
    System.out.print("After sorted: \t");
    printArr(arr);
    System.out.println("Is correct solution: " + checkSolution(solution, arr));
    System.out.println("Here is the correct solution: \n");
    printArr(solution);

}


}

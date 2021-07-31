public class Search {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int x = 5;
        System.out.println(findUsingLinearSearchLoop(arr, x));
        System.out.println(findUsingLinearSearchRecursion(arr, x, 0));
    }
    // Time Complexity:
    // Rough Estimate time to run a code
    // Linear Search : Worst time complexity is O(n)
    static boolean findUsingLinearSearchLoop(int arr[], int x) {
        // Using loop
        int i;
        for(i=0; i< arr.length; i++) {
            System.out.println("Time taken: " + i);
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    // Time Complexity:
    // Rough Estimate time to run a code
    // Linear Search : Worst time complexity is O(n)
    static boolean findUsingLinearSearchRecursion(int arr[], int x, int i) {

        System.out.println("array: " + arr +"\t" + x + "\t" + i);
        // i = 4, x =5
        if (i >= arr.length) {
            return false;
        }
        if (arr[i] == x) {
            return true;
        }

        return findUsingLinearSearchRecursion(arr, x, i+1);
    }

    // find(arr, x, 0) -> find(arr, x , 1) -> find(arr, x , 2) -> find(arr, x, 3) -> find(arr, x, 4)
    //                                                                              return true
    // Array of length n, x
    // Worst time complexity to find a number in that array?

    //Binary Search

    /*     O
         L   R
     */
    // Binary search only work in sorted array
    // x = 5
    // 5 3 7 4 2 1
    // 1 2 3 4 5 7 - increasing order
    // 7 5 4 3 2 1 - decreasing order
    // 1 2 3 4 5 7
    /*
    Mid = arr.length/2
    if (arr[mid] == x) {

    }
    else if (arr[mid] > x) {
        Search(arr[start-mid] , x)
    }
    else if (arr[mid] < x){
        Search(arr[mid-end] , x)
    }
    */
}

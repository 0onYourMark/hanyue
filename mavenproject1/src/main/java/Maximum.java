public class Maximum {
    public static int maximum(int[] array) {
        int tempMaximum = array[0];
        int i = 1;
        while (i < array.length) {
            if (array[i] > tempMaximum)
                tempMaximum = array[i];
            i++;
        }
        return tempMaximum;
    }

    public static int maxima(int[] array) {
        int maxIndex = 0;
        int i = 1;
        while (i < array.length) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
            i++;
        }
        return maxIndex;
    }

    static int maximum(int[][] x) {
    int max = Integer.MIN_VALUE;
    
    for (int[] row : x) {
        for (int num : row) {
            if (num > max) {
                max = num;
            }
        }
    }
    
    return max;
}

    public static int minima(int[] array) {
        int minIndex = 0;
        int i = 1;
        while (i < array.length) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            i++;
        }
        return minIndex;
    }

    static int count = 0;
    static boolean compare(int x, int y) {
    count++;
    return x > y;
    }
    

    static void extremal(int[] arr) {
       if (arr.length == 0) {
        System.out.println("Array is empty");
        return;
       }

       int min = arr[0];
       int max = arr[0];

       for (int i = 1; i < arr.length; i += 2) {
          if (i == arr.length - 1) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
           } else {
            int smaller;
            int larger;

            if (compare(arr[i], arr[i + 1])) {
                smaller = arr[i + 1];
                larger = arr[i];
            } else {
                smaller = arr[i];
                larger = arr[i + 1];
            }

            min = Math.min(min, smaller);
            max = Math.max(max, larger);
           }
       }

    System.out.println("Minimum value: " + min);
    System.out.println("Maximum value: " + max);
    System.out.println("Number of comparisons: " + count);
    }
}
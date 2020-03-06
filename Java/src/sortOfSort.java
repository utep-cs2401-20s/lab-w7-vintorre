public class sortOfSort {

    public static void sortOfSort(int[] array){
        int change = 0;
        int temp;

            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0) {
                    change++;
                }

                if (change % 2 == 0) {
                    temp = array[i - change];
                    array[i - change] = array[findMaxEven(array, i - change)];
                    array[findMaxEven(array, i - change)] = temp;
                }

                if (change % 2 == 1) {
                    temp = array[array.length-((i+2)-change)];
                    array[array.length-((i+2)-change)] = array[findMaxOdd(array, (i+2-change))];
                    array[findMaxOdd(array, (i+2-change))] = temp;
                }
            }
        }


    public static int findMaxEven(int[] arr, int position) {
        int max = 0;
        for (int i = position; i < arr.length; i++) {


            if (i + 1 < arr.length) {
                if ((arr[i] > arr[i + 1])) {
                    max = i;
                } else
                    max = i + 1;

            }
        }
        return max;
    }

    public static int findMaxOdd(int[] arr, int position) {
        int max = 0;
        for(int i = 0; i < arr.length - position; i++) {
            if (i + 1 < arr.length) {
                if (arr[i] > arr[i + 1]) {
                    max = i;
                } else max = i + 1;
            }
        }

        return max;

    }

    public static void main(String[] args) {
        int[] test = {4, 3, 2, 9, 8};
            sortOfSort(test);
            for(int i = 0; i < test.length; i++){
                System.out.print(test[i] + " ");
            }

    }


  
}

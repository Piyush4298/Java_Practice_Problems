package Basics;

public class Frequencies {

    static boolean searchInTemp(int temp[], int element) {
        for(int i = 0; i < temp.length; i++) {
            if(temp[i] == element) {
                return true;
            }
        }
        return false;
    }

    static void printFrequencies(int arr[]) {
        int n = arr.length;
        int[] tempArray = new int[n];
        int idx = 0;
        for(int i = 0; i < n; i++) {
            int count = 1;
            if(!searchInTemp(tempArray, arr[i])) {
                for(int j = i + 1; j < n; j++) {
                    if(arr[j] == arr[i]) {
                        count++;
                    }
                }
                tempArray[idx] = arr[i];
                idx++;
                System.out.println("Element = " + arr[i] + ", Frequency = " + count);
            }
        }
    }

    static void optimisedFrequencies(int arr[]) {
        int n = arr.length;
        int maxElement = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        int[] hash = new int[maxElement + 1];
        for(int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        for(int i = 0; i < hash.length; i++) {
            System.out.println("Element = " + i + ", Frequency = " + hash[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,2,2,3,4,5,6,7,1};
        //printFrequencies(arr);
        optimisedFrequencies(arr);
    }
}

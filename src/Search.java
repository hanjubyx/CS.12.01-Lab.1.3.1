import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(ArrayList<String> list, String string) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(string)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (array[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(String[] array, String string) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = array[mid].compareTo(string);
            if (comparison == 0) {
                return mid;
            }
            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] intArray = {5, 2, 9, 1, 5, 6};
        System.out.println("Linear Search (int array): " + linearSearch(intArray, 9));

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        System.out.println("Linear Search (String ArrayList): " + linearSearch(stringList, "banana"));

        int[] sortedIntArray = {1, 2, 5, 6, 9, 12};
        System.out.println("Binary Search (int array): " + binarySearch(sortedIntArray, 6));

        String[] sortedStringArray = {"apple", "banana", "cherry", "date"};
        System.out.println("Binary Search (String array): " + binarySearch(sortedStringArray, "cherry"));
    }
}
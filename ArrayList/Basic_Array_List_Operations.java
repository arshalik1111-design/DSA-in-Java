import java.util.*;

public class Basic_Array_List_Operations {

    // Demonstrates basic ArrayList operations
    public static void BasicOperations() {
        ArrayList<Integer> list = new ArrayList<>();
        // Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1, 9); // Insert 9 at index 1

        System.out.println(list);

        // Print size and elements
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // Get element at index 2
        int element = list.get(2);
        System.out.println(element);

        // Remove element at index 2
        list.remove(2);
        System.out.println(list);

        // Set value at index 1 to 10
        list.set(1, 10);
        System.out.println(list);

        // Check if list contains certain elements
        System.out.println(list.contains(10));
        System.out.println(list.contains(13));
    }

    // Prints the list in reverse order
    public static void ReverseList(ArrayList<Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    // Finds and prints the maximum element in the list
    public static void MaximumNum(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max Element: " + max);
    }

    // Swaps elements at idx1 and idx2 in the list
    public static void Swap(ArrayList<Integer> list, int idx1, int idx2) {
        System.out.println(list);
        int i1 = list.get(idx1);
        int i2 = list.get(idx2);
        int temp = i1;
        list.set(idx1, i2);
        list.set(idx2, temp); // Fixed: should set idx2, not i2
        System.out.println();
        System.out.println(list);
        System.out.println();
    }

    // Demonstrates a 2D ArrayList (ArrayList of ArrayLists)
    public static void twoDArrayList() {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        // Print each sub-list
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Uncomment to test individual methods:
        // BasicOperations();
        // ReverseList(list);
        // MaximumNum(list);
        // Swap(list, 1, 2);

        // Collections.sort(list);
        // System.out.println(list);
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);

        twoDArrayList();
    }
}

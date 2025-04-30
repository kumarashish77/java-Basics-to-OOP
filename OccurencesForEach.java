import java.util.Scanner;

class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = input.nextInt();
        }
        return nums;
    }
}

class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding occurrences!");

        int[] nums = ArrayUtility.inputArray();

        System.out.println("Now, enter the number you want to search:");
        int element = input.nextInt();

        int occ = countOccurrences(nums, element);
        System.out.println("Your element was found: " + occ + " times.");

        input.close();
    }

    public static int countOccurrences(int[] nums, int element) {
        int occ = 0;
        for (int num : nums) {
            if (num == element) {
                occ++;
            }
        }
        return occ;
    }
}

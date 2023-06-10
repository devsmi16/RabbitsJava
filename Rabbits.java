
import java.util.Arrays;
import java.util.Scanner;

public class Rabbits {

    public int MinRabbitsInForest(int nums[]){
        int rabbit = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != nums[i + 1]){
                rabbit = rabbit + nums[i] + 1;
            }
            if (nums[nums.length - 2] != nums[nums.length - 1])
                rabbit = rabbit + nums[nums.length - 1] + 1;
            if (rabbit == 0)
                rabbit = nums[0] + 1;

        }
        return rabbit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter the number of elements: ");
        x = sc.nextInt();
        int[] nums = new int[x];
        for (int i = 0; i < nums.length; i++){
            System.out.println("Enter data: ");
            nums[i] = sc.nextInt();
        }
        Rabbits rabbits  =new Rabbits();

        x = rabbits.MinRabbitsInForest(nums);
        System.out.println("The min number of rabbits in the forest are: " + x);
        sc.close();
    }
}

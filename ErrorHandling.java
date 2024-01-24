public class ErrorHandling {
    public static void main(String[] args) {
        try {
            int[] nums = { 1, 2, 3 };
            System.out.println(nums[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong!");
            throw new ArithmeticException("Out of range");
        } finally {
            System.out.println("End of try - catch exception!.");
        }
    }
}

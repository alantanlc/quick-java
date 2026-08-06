public class ForEachArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int result = sum(arr);
        System.out.println(result);
    }

    static int sum(int... args) {
        int result = 0;
        for (int arg: args) {
            result += arg;
        }
        return result;
    }
}


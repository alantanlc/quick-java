public class Average {

    public static void main(String[] args) {
        double result = average(10.0, 20.0, 30, 41.0);
        System.out.println(result);
    }

    static double average(double... args) {
        double sum = 0;
        for (double arg: args) {
            sum += arg;
        }
        return sum / args.length;
    }

}

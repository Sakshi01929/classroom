public class CommandLine {
    public static void main(String[] args) {
        // System.out.println(args[0]);

        // // System.out.println("Hello " + args[0]);

        // int num1 = Integer.parseInt(args[0]);
        // int num2 = Integer.parseInt(args[1]);
        // int sum = num1 + num2;
        // System.out.println(sum);

        int sum1 = 0;
        for (int i = 0; i < args.length; ++i) {

            sum1 = sum1 + Integer.parseInt(args[i]);

        }
        System.out.println("sum is:" + sum1);

        int num1 = Integer.parseInt(args[0]);
        float num2 = Float.parseFloat(args[1]);
        double num3 = Double.parseDouble(args[2]);
        System.out.println("sum:" + (num1 + num2 + num3));

    }
}

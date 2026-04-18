public class UC4 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            String result = "";

            for (int i = 0; i < args.length; i++) {
                result += args[i];

                if (i < args.length - 1) {
                    result += ", ";
                }
            }

            System.out.println("Hello, " + result + "!");
        }
    }
}
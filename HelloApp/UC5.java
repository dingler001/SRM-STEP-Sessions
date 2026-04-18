public class UC5 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            String result = "";
            boolean first = true;

            for (String name : args) {

                if (!first) {
                    result += ", ";
                }

                result += name;
                first = false;
            }

            System.out.println("Hello, " + result + "!");
        }
    }
}
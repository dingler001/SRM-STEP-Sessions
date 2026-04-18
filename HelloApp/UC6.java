public class UC6 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            StringBuilder sb = new StringBuilder();

            for (String name : args) {
                sb.append(name).append(", ");
            }

            // Remove last ", "
            String result = sb.substring(0, sb.length() - 2);

            System.out.println("Hello, " + result + "!");
        }
    }
}
public class App {

    public static void main(String[] args) throws Exception {
        String str = "pankaj kumar singh";
        // for (int i = 0; i <str.length(); i++) {
        // char reverse = str.charAt(i);
        // System.out.print(reverse);

        // }
        // String reversed = new StringBuilder(str).reverse().toString();
        // System.out.println(reversed);

        // String reverse = str.chars().mapToObj(c -> c).reduce(" ", (s, c) -> c + s,
        // (s1, s2) -> s2 + s1);
        // System.out.println(reverse.length());
        String reversed = str.chars()
                .collect(StringBuilder::new,
                        (b, c) -> b.insert(0, (char) c), (b1, b2) -> b1.insert(0, b2))
                .toString();
        System.out.println(reversed);
    }
}

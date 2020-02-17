public class thisIsTest {
    public static void main(String[] args) {

        int numb = 0;
        String hello;

        System.out.println("Here it will be posted some tests! ");

        for (int i = 0; i <= 10; i++) {
            i += numb;
            if (i < 10) {
                hello = " " + i + ", ";
            } else {
                hello = " " + i + " END! ";
            }
            System.out.print(hello);
        }

    }
}

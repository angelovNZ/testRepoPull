public class thisIsTest {
    public static void main(String[] args) {

        int numb = 0;
        String hello;

        System.out.println("Here it will be posted some tests! ");
        /* The xMan is changing
         */

        System.out.print("Starting after ... ");
        for (int i = 10; i >= 0; i--) {
            i += numb;
            if (i <= 10 && i >= 1) {
                hello = " " + i + ", ";
            } else {
                hello = " " + i + " ...  FIGHT !!! ";
            }
            System.out.print(hello);
        }

    }
}

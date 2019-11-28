package consol;

public class ConsoleWriterTest {

    public static void main(String args[]) {
        try {
            ConsoleWriter out = new ConsoleWriter(System.out);
            double d = 123.456789;
            int money = 1234567;

            out.println(d);
            out.println(d, 2);
            out.printlnWon(money);
            out.printlnDollar(money);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

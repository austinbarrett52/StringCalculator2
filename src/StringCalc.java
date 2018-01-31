

public class StringCalc {

    public static int Add (String numbers) {
        //no items
        if (numbers == "") {
            return 0;
        }
        //1 item
        else if (!numbers.contains(",")) {
            return Integer.parseInt(numbers);
        } else {
            return -1;
        }
    }
}

package ExceptionsTests;

public class RunTimeException {
    public static void main(String[] args) {
        int [] array = {1, 2, 4, 0, 6};
       // try {
            for (int i : array) {
                if (i == 0){
                    System.out.println("Delit na nol nelzya");
                }
                else {
                    int a = 24/i;
                System.out.println(a);
            }

      //  catch (ArithmeticException e){
//            System.out.println("Byl Poyman Exception : "+ e.getSuppressed());
//            System.out.println(e.getMessage());
//            System.out.println(e.getCause());
//            System.out.println(e.fillInStackTrace());
        }
    }
}

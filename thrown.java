package winterCamp;
class Illustrate_thrown {
    static int divideByZero(int a, int b)
    {

        int i = a / b;

        return i;
    }
    static int computeDivision(int a, int b)
    {
        // Try block to check for exceptions

        int res = 0;

        // Try block to check for exceptions
        try {

            res = divideByZero(a, b);
        }
        catch (NumberFormatException ex) {
            System.out.println(
                    "NumberFormatException is occurred");
        }
        return res;
    }

    public static void main(String args[])
    {

        int a = 1;
        int b = 0;
        try {
            int i = computeDivision(a, b);
        }
        catch (ArithmeticException ex) {

            System.out.println(ex.getMessage());
        }
    }
}


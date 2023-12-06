public class Main {
    public static void main(String[] args) {
// 1
        If1 isEven = (n) -> (n % 2) == 0;

        if (isEven.fun(21))
            System.out.println("21 is even");
        else
            System.out.println("21 is odd");


// 2
        Func f = (n) ->
        {
            int res = 1;

            for (int i = 1; i <= n; i++)
                res = i * res;
            return res;
        };

        System.out.println("Factorial of 5 : " + f.fact(5));


// 3
        New leapyr = (year) ->
        {
            if (((year % 400 == 0)
                    || (year % 4 == 0) && (year % 100 != 0)))
                return true;
            else
                return false;
        };

        if (leapyr.test(2020))
            System.out.println("leap year");
        else
            System.out.println("Non leap year");
    }
}
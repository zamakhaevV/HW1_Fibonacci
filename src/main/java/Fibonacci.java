import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fibonacci {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        final Logger log = LoggerFactory.getLogger(Fibonacci.class);

        int n;

        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            log.error("Wrong input!");
            return;
        }

        if (n > -1 && n < 94) {
            long[] f = {0, 1};
            long fn;

            for (int i = 0; i < n; ++i) {
                if (i > 1) {
                    fn = f[0] + f[1];
                    f[0] = f[1];
                    f[1] = fn;
                    System.out.println("F(" + i + ") = " + fn);
                } else {
                    System.out.println("F(" + i + ") = " + f[i]);
                }
            }

            log.info("Program execution time: " + (System.currentTimeMillis() - startTime) + "ms");
        } else {
            log.error("Input out of bounds! (Use number from [0;93])");
        }
    }
}

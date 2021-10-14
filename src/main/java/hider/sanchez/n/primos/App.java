package hider.sanchez.n.primos;

import java.util.Scanner;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class App {
    private static final Logger LOG = Logger.getLogger("App");
    private static final LosNPrimos nPrimos = new LosNPrimos();

    public static void main(String[] args) {
        try {
            LOG.log(INFO, "Escribe un numero");
            Scanner in = new Scanner(System.in);
            Long num = in.nextLong();

            Object[] params = {num, nPrimos.printNPrimos(num)};
            LOG.log(INFO, "los {0} primeros primos son \n\n --> {1}", params);
            main(args);
        } catch (Exception e) {
            LOG.log(INFO, "error al leer el numero, intenta");
        }
    }
}

package hider.sanchez.n.primos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Un número primo: Es un número natural mayor que 1 que tiene únicamente dos divisores positivos distintos: él mismo y el 1.
 *
 * @since 1.0
 */
public class LosNPrimos {

    /**
     * se cambio por el nuevo metodo que se creo desde cero {@link #printNPrimos(Long)}
     *
     * @deprecated este metodo fue creado con guia de internet.
     */
    @Deprecated(since = "1.0")
    public static void getPrimos(int numero) {
        List<Integer> primos = new ArrayList<>();
        int c = 1;
        int p = 2;
        int d = 2;
        while (c <= numero) {
            if (p % d == 0) {
                if (p == d) {
                    primos.add(p);
                    c++;
                }
                d = 2;
                p++;
            } else
                d++;
        }
        for (int i = primos.size() - 1; i >= 0; i--) {
            System.out.print(primos.get(i) + ",");
        }
    }


    /**
     * Escribir un algoritmo que muestre los N números primos de manera inversa. Por ejemplo,
     * si N vale 10 se mostrará en pantalla: 29, 23, 19, 17, 13, 11, 7, 5, 3, 2
     */
    public String printNPrimos(Long nPrimerosPrimos) {
        final List<Long> nPrimos = primerosNPrimos(nPrimerosPrimos);
        final List<Long> reverseNPrimos = reverse(nPrimos);
        return convert(reverseNPrimos);
    }

    private List<Long> primerosNPrimos(Long nPrimerosPrimos) {
        List<Long> nPrimos = new ArrayList<>();
        Long num = 0L;
        Long count = 0L;
        while (count < nPrimerosPrimos) {
            if (esPrimo(num)) {
                nPrimos.add(num);
                count++;
            }
            num++;
        }
        return nPrimos;
    }

    private List<Long> reverse(List<Long> primos) {
        return primos.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    }

    private String convert(List<Long> reversePrimos) {
        return reversePrimos.stream().map(String::valueOf).collect(Collectors.joining(", "));
    }

    private boolean esPrimo(Long numero) {
        byte count = 0;
        if (numero == 1) return false;
        for (Long i = 1L; i <= numero; i++) {
            if (numero % i == 0) {
                count++;
            }
            if (count > 2) return false;
        }
        return count == 2;
    }
}

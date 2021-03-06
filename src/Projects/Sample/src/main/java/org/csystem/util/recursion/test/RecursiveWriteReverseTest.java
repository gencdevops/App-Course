/*----------------------------------------------------------------------------------------------------------------------
    Bir yazıyı tersten yazdıran algoritmanın recursive versiyonu
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.util.recursion.test;

import org.csystem.util.Console;
import org.csystem.util.recursion.RecursionUtil;

public class RecursiveWriteReverseTest {
    public static void main(String [] args)
    {
        run();
    }

    public static void run()
    {
        for (;;) {
            var s = Console.read("Bir yazı giriniz:");

            RecursionUtil.writeReverse(s);
            Console.writeLine();

            if ("quit".equals(s))
                break;
        }
    }
}

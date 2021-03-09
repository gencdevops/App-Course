
package org.csystem.app;


import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("konsoldan bir sayı giriniz... : ");
        int sayi = Integer.parseInt(kb.nextLine());

        var a = sayi > 0 ? "ankara" : 50;
        System.out.println(a);



    }
}

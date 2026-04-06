package ro.ase.cts.program;

import ro.ase.cts.aplicatii.AplicatieMobila;

public class Program {

    public static void main(String[] args) {
        AplicatieMobila aplicatieMobila = AplicatieMobila.getInstance();
        AplicatieMobila aplicatieMobilaSecond = AplicatieMobila.getInstance();

        if (aplicatieMobila == aplicatieMobilaSecond) {
            System.out.println("Idem");
        }

        System.out.println(aplicatieMobila);
        System.out.println(aplicatieMobilaSecond);
    }
}

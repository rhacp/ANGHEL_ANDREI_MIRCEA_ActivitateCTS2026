package A4.program;

import A4.models.Reteta;

public class Program {

    public static void main(String[] args) {
        Reteta reteta = new Reteta(2, 3, 4);
        Reteta reteta2 = new Reteta(13, 12, 11);
        Reteta reteta3 = reteta2.clone();

        System.out.println(reteta);
        System.out.println(reteta2);
        System.out.println(reteta3);
    }
}

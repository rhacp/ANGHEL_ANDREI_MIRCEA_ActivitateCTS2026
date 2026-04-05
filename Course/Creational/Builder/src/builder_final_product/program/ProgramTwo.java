package builder_final_product.program;

import builder_final_product.models.RezervareFinal;

public class ProgramTwo {

    public static void main(String[] args) {
        RezervareFinal rezervare = new RezervareFinal.Builder().setNrPersoane(3).build();

        System.out.println(rezervare.toString());
    }
}

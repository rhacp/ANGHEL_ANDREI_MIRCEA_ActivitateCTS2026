package program;

import models.PantofFinal;
import models.TipPantof;

import java.util.List;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        PantofFinal pantof = new PantofFinal.Builder(
                TipPantof.BALERINI,
                36,
                10.4,
                "Piele")
                .setMaterialeSecundare(Set.of("Plastic"))
                .setMesaje(List.of("yolo", "punkIsNotDead"))
                .build();

        PantofFinal pantofTwo = new PantofFinal.Builder(
                TipPantof.STILETTO,
                41,
                8.4,
                "Piele")
                .setMaterialeSecundare(Set.of("Bumbac"))
                .setMesaje(List.of("john", "doe"))
                .build();

        PantofFinal pantofThree = new PantofFinal.Builder(
                TipPantof.BALERINI,
                38,
                0.6,
                "Cauciuc")
                .build();

        System.out.println(pantof);
        System.out.println(pantofTwo);
        System.out.println(pantofThree);

        try {
            PantofFinal pantofFour = new PantofFinal.Builder(
                    TipPantof.BALERINI,
                    48,
                    10.4,
                    "Piele")
                    .setMaterialeSecundare(Set.of("Plastic", "Cauciuc"))
                    .setMesaje(List.of("yolo", "punkIsNotDead"))
                    .build();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            PantofFinal pantofFive = new PantofFinal.Builder(
                    TipPantof.BALERINI,
                    36,
                    16.4,
                    "Piele")
                    .setMaterialeSecundare(Set.of("Plastic", "Cauciuc"))
                    .setMesaje(List.of("yolo", "punkIsNotDead"))
                    .build();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            PantofFinal pantofSix = new PantofFinal.Builder(
                    TipPantof.BALERINI,
                    36,
                    10.4,
                    "Piele")
                    .setMaterialeSecundare(Set.of("Plastic"))
                    .setMesaje(List.of("yolo", "punkIsNotDeadtestttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt"))
                    .build();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            PantofFinal pantofSeven = new PantofFinal.Builder(
                    TipPantof.BALERINI,
                    36,
                    10.4,
                    "Piele")
                    .setMaterialeSecundare(Set.of("Plastic", "Cauciuc"))
                    .setMesaje(List.of("yolo", "punkIsNotDead"))
                    .build();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

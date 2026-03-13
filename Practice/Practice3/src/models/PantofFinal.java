package models;

import builder.AbstractBuilder;
import exceptions.DimensiuneTocInvalidException;
import exceptions.MaterialeSecundareInvalidException;
import exceptions.MesajeInvalidException;
import exceptions.NumarPantofInvalidException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PantofFinal {

    private TipPantof tipPantof;

    private int numar;

    private double dimensiuneToc;

    private String material;

    private Set<String> materialeSecundare = new HashSet<>();

    private List<String> mesaje = new ArrayList<>();

    private PantofFinal(TipPantof tipPantof, int numar, double dimensiuneToc, String material, Set<String> materialeSecundare, List<String> mesaje) {
        if (tipPantof != null) {
            this.tipPantof = tipPantof;
        } else {
            throw new IllegalArgumentException("TipPantof is null");
        }

        if (numar >= 35 && numar <= 45) {
            this.numar = numar;
        } else {
            throw new NumarPantofInvalidException("Numar pantof invalid (intre 35 si 45, inclusiv).");
        }

        if (dimensiuneToc >= 0.5 && dimensiuneToc <= 12.5) {
            this.dimensiuneToc = dimensiuneToc;
        } else {
            throw new DimensiuneTocInvalidException("Dimensiune toc invalid (intre 0.5 si 12.5, inclusiv).");
        }

        if (material != null && !material.isBlank()) {
            this.material = material;
        } else {
            throw new IllegalArgumentException("Material invalid.");
        }

        switch (tipPantof) {
            case BALERINI -> {
                if (materialeSecundare.size() <= 1) {
                    this.materialeSecundare = new HashSet<>(materialeSecundare);
                } else {
                    throw new MaterialeSecundareInvalidException("Balerini: 1 material secundar maxim.");
                }
            }
            case STILETTO -> {
                if (materialeSecundare.size() <= 2) {
                    this.materialeSecundare = new HashSet<>(materialeSecundare);
                } else {
                    throw new MaterialeSecundareInvalidException("Stiletto: 2 material secundar maxim.");
                }
            }
            case TENISI -> {
                if (materialeSecundare.size() <= 3) {
                    this.materialeSecundare = new HashSet<>(materialeSecundare);
                } else {
                    throw new MaterialeSecundareInvalidException("Tenisi: 3 material secundar maxim.");
                }
            }
            case GHETE -> {
                if (materialeSecundare.size() <= 4) {
                    this.materialeSecundare = new HashSet<>(materialeSecundare);
                } else {
                    throw new MaterialeSecundareInvalidException("Ghete: 4 material secundar maxim.");
                }
            }
        }

        if (calculeazaTotalCaractereList(mesaje) < numar) {
            this.mesaje = new ArrayList<>(mesaje);
        } else {
            throw new MesajeInvalidException("Lista mesaje invalida (suma lungimii elementelor mai mica ca numarul pantofului).");
        }
    }

    public TipPantof getTipPantof() {
        return tipPantof;
    }

    public int getNumar() {
        return numar;
    }

    public double getDimensiuneToc() {
        return dimensiuneToc;
    }

    public String getMaterial() {
        return material;
    }

    public Set<String> getMaterialeSecundare() {
        return new HashSet<>(materialeSecundare);
    }

    public List<String> getMesaje() {
        return new ArrayList<>(mesaje);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PantofFinal{");
        sb.append("tipPantof=").append(tipPantof);
        sb.append(", numar=").append(numar);
        sb.append(", dimensiuneToc=").append(dimensiuneToc);
        sb.append(", material='").append(material).append('\'');
        sb.append(", materialeSecundare=").append(materialeSecundare);
        sb.append(", mesaje=").append(mesaje);
        sb.append('}');
        return sb.toString();
    }

    private int calculeazaTotalCaractereList(List<String> input) {
        int total = 0;
        for (String element : input) {
            total += element.length();
        }

        return total;
    }

    public static class Builder implements AbstractBuilder {

        private TipPantof tipPantof;

        private int numar;

        private double dimensiuneToc;

        private String material;

        private Set<String> materialeSecundare = new HashSet<>();

        private List<String> mesaje = new ArrayList<>();

        public Builder(TipPantof tipPantof, int numar, double dimensiuneToc, String material) {
            this.tipPantof = tipPantof;
            this.numar = numar;
            this.dimensiuneToc = dimensiuneToc;
            this.material = material;
        }

        @Override
        public AbstractBuilder setMaterialeSecundare(Set<String> materialeSecundare) {
            this.materialeSecundare = materialeSecundare;
            return this;
        }

        @Override
        public AbstractBuilder setMesaje(List<String> mesaje) {
            this.mesaje = mesaje;
            return this;
        }

        @Override
        public PantofFinal build() {
            return new PantofFinal(this.tipPantof,
                    this.numar,
                    this.dimensiuneToc,
                    this.material,
                    this.materialeSecundare,
                    this.mesaje);
        }
    }
}

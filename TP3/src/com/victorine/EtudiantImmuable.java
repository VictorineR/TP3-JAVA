package com.victorine;

import java.util.ArrayList;

public final class EtudiantImmuable {
    private final String name;
    private final String dateNaiss;
    private final ArrayList<Integer> listeModuleNote;

    public EtudiantImmuable(String name, String dateNaiss, ArrayList<Integer> listeModuleNote) {
        this.name = name;
        this.dateNaiss = dateNaiss;
        this.listeModuleNote = listeModuleNote;
    }

    //Getter
    public String getNom() {
        return name;
    }
    public String getDateNaiss() {
        return dateNaiss;
    }
    public ArrayList<Integer> getListeModuleNote() {
        return listeModuleNote;
    }


    //Setter
    // There is no Setter beaucause we deal with finale variable
}

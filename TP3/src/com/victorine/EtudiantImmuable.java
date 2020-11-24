package com.victorine;

public class EtudiantImmuable {
    protected String name;
    protected String dateNaiss;
    protected double listeModuleNote;

    //Constructeur
    public EtudiantImmuable(String _name, String _dateNaiss, double _listeModuleNote) {
        this.name = _name;
        this.dateNaiss = _dateNaiss;
        this.listeModuleNote = _listeModuleNote;
    }

    //Getteur
    public String getName() {return name;}
    public String getDateNaiss() {return dateNaiss;}
    public double getListeModuleNote() {return listeModuleNote;}

    //Setteur
    public void setName(String name) {this.name = name;}
    public void setDateNaiss(String dateNaiss) {this.dateNaiss = dateNaiss; }
    public void setListeModuleNote(double listeModuleNote) {this.listeModuleNote = listeModuleNote;}
}

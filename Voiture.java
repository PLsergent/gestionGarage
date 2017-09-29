package gestionGarage;

import java.util.*;
public class Voiture {
  private String marque;
  private String modele;
  private String couleur;
  private double longueur;
  private double prix;
  private static Integer nbVoiture=0;
  //attribut de classe init à 0

  public Voiture() {
    marque="";
    modele="";
    couleur="";
    longueur=0;
    prix=0;
  }

  public Voiture(String marque, String modele, double prix){
    this.marque=marque;
    this.modele=modele;
    this.prix=prix;
    nbVoiture++;
  }
  public Voiture (String marque, String modele, String couleur, double longueur, double prix){
    this.marque=marque;
    this.modele=modele;
    this.couleur=couleur;
    this.longueur=longueur;
    this.prix=prix;
    nbVoiture++;
  }
//////ACCESSEUR/////
  public static Integer getnbVoiture(){
    return nbVoiture;
  }
  public String getMarque(){
    return marque;
  }
  public String getModele(){
    return modele;
  }
  public String getCouleur(){
    return couleur;
  }
  public double getPrix(){
    return prix;
  }
  public double getLong(){
    return longueur;
  }
  public void setCouleur(String couleur){
    this.couleur=couleur;
  }
  public void setLongueur(double longueur){
    this.longueur=longueur;
  }
  public void setPrix(double prix){
    this.prix=prix;
  }
  //comparer deux voitures et afficher la plus longue et la plus chère

  public void compare(Voiture v){
    if (v.getLong()>this.longueur)
    {
      System.out.println("La voiture "+v.getMarque()+" "+v.getModele()+" est la plus longue.");
    }else{
      System.out.println("La voiture "+this.getMarque()+" "+this.getModele()+" est la plus longue.");
    }
    if (v.getPrix()>this.prix)
    {
      System.out.println("La voiture "+v.getMarque()+" "+v.getModele()+" est la plus chere.");
    }else{
      System.out.println("La voiture "+this.getMarque()+" "+this.getModele()+" est la plus chere.");
    }
  }

  public void finalize(){
    nbVoiture--;
  }

  public void afficheV(){
    System.out.println(marque);
    System.out.println(modele);
    System.out.println(couleur);
    System.out.println("Longueur de la voiture : "+longueur);
    System.out.println(prix+"€");
    System.out.println("============");
  }
  /////////=====Main=====/////////
  public static void main (String[] args){
    Voiture v1 = new Voiture ("Renault","Laguna","rouge",5,20000);
    Voiture v2 = new Voiture ("Citroen","DS3","blanche",4,15000);
    System.out.println("Nombre de voitures "+v1.getMarque()+" "+v1.getModele()+" : "+v1.getnbVoiture());
    v1.compare(v2);
    v1.setCouleur("Vert");
    System.out.println("=========");
    v1.afficheV();
    v1.finalize();
    System.out.println(getnbVoiture());
  }

}

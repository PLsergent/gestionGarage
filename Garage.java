package gestionGarage;

import java.util.ArrayList;
public class Garage{
  private String nom;
  private String adresse;
  private ArrayList<Voiture> lesVoitures;
  private static Integer numbCarTot=0;
  private static double coutTotal=0;

  public Garage(){
    nom="";
    adresse="";
    lesVoitures = new ArrayList<Voiture>();
  }

  public Garage(String nom, String adresse){
    this.nom=nom;
    this.adresse=adresse;
    lesVoitures=new ArrayList<Voiture>();
  }

  public Garage(String nom, String adresse, ArrayList<Voiture> lesVoitures){
    this.nom=nom;
    this.adresse=adresse;
    this.lesVoitures=lesVoitures;
  }

  public void listesVoitures(){
    for (Voiture v:lesVoitures)
    {
      v.afficheV();
    }
  }
  public void ajoutVoiture(Voiture v){
    lesVoitures.add(v);
    numbCarTot++;
    coutTotal=coutTotal+v.getPrix();
  }

  public String toString(){
    return nom+" "+adresse;
  }

  public boolean equals(Garage g){
    if (this.nom.equals(g.nom)&&this.adresse.equals(g.adresse)&&this.lesVoitures.equals(g.lesVoitures))
    {
      return true;
    }else{
      return false;
    }
  }
  public static double getnumCartot(){
    return numbCarTot;
  }
  public static double getCouttotal(){
    return coutTotal;
  }

  public static void main (String[] args){
    Garage g1 = new Garage ("Garage Etoile","6 rue de Brest");
    Garage g2 = new Garage ("Garage Etoile","6 rue de Brest");
    Voiture v1 = new Voiture ("Renault","Laguna","rouge",5,10000);
    Voiture v2 = new Voiture ("Citroen","DS3","blanche",4,20000);
    Voiture v3 = new Voiture ("Audi","RS3","noir",4.5,30000);
    Voiture v4 = new Voiture ("Porche","911","grise",4.7,40000);
    g1.ajoutVoiture(v1);
    g1.ajoutVoiture(v2);
    g2.ajoutVoiture(v1);
    g2.ajoutVoiture(v2);
    g2.ajoutVoiture(v3);
    g1.ajoutVoiture(v4);
    g1.listesVoitures();

    if (g1.equals(g2)==true)
    {
      System.out.println("Ils sont pareils pelo.");
    }else{
      System.out.println("Raieieieiei pas les mêmes");
    }
    System.out.println("Nombre de voitures dans tous les garages : "+Garage.getnumCartot());
    System.out.println("Cout total de toutes les voitures : "+Garage.getCouttotal());
  }
}

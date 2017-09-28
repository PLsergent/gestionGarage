package gestionGarage;
import java.util.ArrayList;
public class Garage{
  private String nom;
  private String adresse;
  private ArrayList<Voiture> lesVoitures;

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
  }

  public static void main (String[] args){
    Garage g1 = new Garage ("Garage Etoile","6 rue de Brest");
    Voiture v1 = new Voiture ("Renault","Laguna","rouge",5,20000);
    Voiture v2 = new Voiture ("Citroen","DS3","blanche",4,15000);

    g1.ajoutVoiture(v1);
    g1.ajoutVoiture(v2);

    g1.listesVoitures();

  }
}

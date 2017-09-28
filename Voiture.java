package gestionGarage;

public class Voiture {
  private String marque;
  private String modele;
  private String couleur;
  private double longueur;
  private double prix;

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
  }
  public Voiture (String marque, String modele, String couleur, double longueur, double prix){
    this.marque=marque;
    this.modele=modele;
    this.couleur=couleur;
    this.longueur=longueur;
    this.prix=prix;
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
  }
  public void afficheV(){
    System.out.println(marque);
    System.out.println(modele);
    System.out.println(couleur);
    System.out.println("Longueur de la voiture : "+longueur);
    System.out.println(prix+"€");
    System.out.println("============");
  }
  ////////=====Main=====/////////
  public static void main (String[] args){
    Voiture v1 = new Voiture ("Renault","Laguna","rouge",5,20000);
    Voiture v2 = new Voiture ("Citroen","DS3","blanche",4,15000);

    v1.compare(v2);
    v1.setCouleur("Vert");
    v1.afficheV();
  }



}

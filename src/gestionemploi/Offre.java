/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionemploi;


public class Offre {
  private int idOffre;
  private String poste;
  private String typeOffre;
  private String NomEntreprise;
  private String Adresse;
  private String Domaine;
  private String DateExpiration;

    public Offre(int idOffre, String poste, String typeOffre, String NomEntreprise, String Adresse, String Domaine, String DateExpiration) {
        this.idOffre = idOffre;
        this.poste = poste;
        this.typeOffre = typeOffre;
        this.NomEntreprise = NomEntreprise;
        this.Adresse = Adresse;
        this.Domaine = Domaine;
        this.DateExpiration = DateExpiration;
    }

    public int getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getTypeOffre() {
        return typeOffre;
    }

    public void setTypeOffre(String typeOffre) {
        this.typeOffre = typeOffre;
    }

    public String getNomEntreprise() {
        return NomEntreprise;
    }

    public void setNomEntreprise(String NomEntreprise) {
        this.NomEntreprise = NomEntreprise;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public String getDomaine() {
        return Domaine;
    }

    public void setDomaine(String Domaine) {
        this.Domaine = Domaine;
    }

    public String getDateExpiration() {
        return DateExpiration;
    }

    public void setDateExpiration(String DateExpiration) {
        this.DateExpiration = DateExpiration;
    }
  
 
}

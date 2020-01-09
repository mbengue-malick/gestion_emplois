
package gestionemploi;



public class Demande {
    
  private int idDemande;
  private int identifiant;
  private String nomDemande;
  private String typeDemande;
  
  /**
   * Declaration d'un constructeur qui permet d'avoir acce a l'esemble des demandes d'emploi qui sont postees
   * par les deamndeurs et retourne les parametres suivant :
   * @param idDemande
   * @param identifiant
   * @param nomDemande
   * @param typeDemande
   * 
   */

    public Demande(int idDemande, int identifiant, String nomDemande, String typeDemande) {
        this.idDemande = idDemande;
        this.identifiant = identifiant;
        this.nomDemande = nomDemande;
        this.typeDemande = typeDemande;
    }
    
/**
 * Declaration des getters et setters de l'ensemble des parametre pour pouvoir acceder et modifier leur valeurs
 * @return 
 */

    public int getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(int idDemande) {
        this.idDemande = idDemande;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNomDemande() {
        return nomDemande;
    }

    public void setNomDemande(String nomDemande) {
        this.nomDemande = nomDemande;
    }

    public String getTypeDemande() {
        return typeDemande;
    }

    public void setTypeDemande(String typeDemande) {
        this.typeDemande = typeDemande;
    }
  
    
}

package models;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Etudiant {
    
    protected String matricule;
    protected String email;
    protected String adresse;
    protected String telephone;
    protected boolean etat;
    protected DateTimeAtCompleted datenaissance;




    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public boolean isEtat() {
        return etat;
    }
    public void setEtat(boolean etat) {
        this.etat = etat;
    }







}

package services;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;
import models.Responsable;

public class ServiceTableau implements Iservice {


    public final int NOMBRE = 10;

    private Chambre chambres[] = new Chambre[NOMBRE];
    private int indexChambre = 0;

    @Override
    public void ajouterPavillon(Pavillon pavion) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void suprimerPavillon(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerPavillon() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ajouterChambre(Chambre chambre) {
        // TODO Auto-generated method stub
        if(indexChambre < NOMBRE){
            chambres[indexChambre] = chambre;
            indexChambre++;
       }
       else{
            System.out.println("Le tableau est rempli");
       }
       
        
    }

    @Override
    public void suprimerChambre(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerChambre() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerEtudiant() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ajouterEtudiant(Etudiant Etudiant) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerResponsable() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ajouterResponsable(Responsable responsable) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void surpimerReseponsable(int id) {
        // TODO Auto-generated method stub
        
    }
    
}

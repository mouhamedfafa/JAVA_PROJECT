package services;
import models.Pavillon;
import models.Chambre;
import models.Etudiant;
import models.Responsable;





public interface Iservice {
    
/**
 * @param pavion
 */
public void ajouterPavillon(Pavillon pavion);


/**
 * @param id
 */
public void suprimerPavillon(int id);

public void listerPavillon();

/**
 * @param chambre
 */
public void ajouterChambre(Chambre chambre);

/**
 * @param id
 */
public void suprimerChambre(int id);


/**
 * 
 */
public void listerChambre();

public void listerEtudiant();

/**
 * @param Etudiant
 */
public void ajouterEtudiant(Etudiant Etudiant);



public void listerResponsable();

/**
 * @param responsable
 */
public void ajouterResponsable(Responsable responsable);


public void surpimerReseponsable(int id);












}

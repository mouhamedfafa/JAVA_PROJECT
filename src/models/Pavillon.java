package models;

public class Pavillon {
    
    protected int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    protected int numero;
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    protected int nbr_etage;
    public int getNbr_etage() {
        return nbr_etage;
    }
    public void setNbr_etage(int nbr_etage) {
        this.nbr_etage = nbr_etage;
    }
    @Override
    public String toString() {
        return "Pavillon [id=" + id + ", nbr_etage=" + nbr_etage + ", numero=" + numero + "]";
    }

}

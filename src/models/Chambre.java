package models;

public class Chambre {
    
    private int id;
    private int numero;
    private int etage;
    private TypeChambre type;

    public TypeChambre getType() {
        return type;
    }

    public void setType(TypeChambre type) {
        this.type = type;
    }



    private Pavillon pavillon;



    public Pavillon getPavillon() {
        return pavillon;
    }

    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }



    @Override
    public String toString() {
        return "Chambre [etage=" + etage + ", id=" + id + ", numero=" + numero + ", type=" + type + "]";
    }
 
}

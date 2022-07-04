import models.Chambre;
import models.Pavillon;
import models.TypeChambre;
import services.Iservice;
import services.ServiceTableau;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Iservice service = new ServiceTableau();
        Chambre chambre = new Chambre();

        Pavillon pavillon = new Pavillon();
        pavillon.setId(1);

        chambre.setId(1);
        chambre.setNumero(1);
        chambre.setEtage(2);
        chambre.setType(TypeChambre.DOUBLE);
        chambre.setPavillon(pavillon);

       



        
    }
}

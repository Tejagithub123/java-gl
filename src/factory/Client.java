package factory;

public class Client {
    public static void main(String[] args) {
        OeuvreFactory oeuvreElectroniqueFactory = new OeuvreElectroniqueFactory();
        OeuvreFactory oeuvrePhysiqueFactory = new OeuvrePhysiqueFactory();

        Livre livreElectronique = oeuvreElectroniqueFactory.makeLivre();
        livreElectronique.make();

        Magazine magazineElectronique = oeuvreElectroniqueFactory.makeMagazine();
        magazineElectronique.make();

        Livre livrePhysique = oeuvrePhysiqueFactory.makeLivre();
        livrePhysique.make();

        Magazine magazinePhysique = oeuvrePhysiqueFactory.makeMagazine();
        magazinePhysique.make();
    }
}

package factory;

public class OeuvreElectroniqueFactory implements OeuvreFactory {
    public Livre makeLivre() {
        return new LivreElectronique();
    }

    public Magazine makeMagazine() {
        return new MagazineElectronique();
    }
}

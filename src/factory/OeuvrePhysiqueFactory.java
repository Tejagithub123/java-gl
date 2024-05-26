package factory;

public class OeuvrePhysiqueFactory implements OeuvreFactory {
    public Livre makeLivre() {
        return new LivrePhysique();
    }

    public Magazine makeMagazine() {
        return new MagazinePhysique();
    }
}

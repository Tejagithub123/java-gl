package factory;
public class LivreElectronique implements Livre {
    public LivreElectronique() {
        this.make();
    }

    public void make() {
        System.out.println("Créer un livre électronique !");
    }
}

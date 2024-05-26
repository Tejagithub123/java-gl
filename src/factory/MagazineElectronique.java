package factory;

public class MagazineElectronique implements Magazine {
    public MagazineElectronique() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("Créer un magazine électronique !");
    }
}

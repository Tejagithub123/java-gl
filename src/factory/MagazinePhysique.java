package factory;

public class MagazinePhysique implements Magazine {
    public MagazinePhysique() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("Créer un magazine physique !");
    }
}
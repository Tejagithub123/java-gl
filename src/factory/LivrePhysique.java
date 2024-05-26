package factory;

public class LivrePhysique implements Livre {
    public LivrePhysique() {
        this.make();
    }

    public void make() {
        System.out.println("Créer un livre physique !");
    }
}



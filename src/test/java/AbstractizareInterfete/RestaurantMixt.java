package AbstractizareInterfete;

public class RestaurantMixt extends Restaurant implements InterfaceRestaurantCarne, InterfaceRestaurantVegan{
    public RestaurantMixt(String denumire, String felPrincipal, Integer numarStele) {
        super(denumire, felPrincipal, numarStele);
    }

    @Override
    public void CumparaCarne() {
        System.out.println("Cumpara carne pentru gratar");
    }

    @Override
    public void CresteAnimale() {
        System.out.println("Creste animale pentru consum intern");

    }

    @Override
    public void PreparaCarne() {
        System.out.println("Prepara carne pentru gratar");

    }

    @Override
    public void cresteLegume() {
        System.out.println("Cumpara legume pentru gratar");

    }

    @Override
    public void cumparaZarzavat() {
        System.out.println("Cumpara zarzavat pentru ciorba");
    }

    @Override
    public void preparaLegume() {
        System.out.println("Prepara legume la gratar");

    }
}

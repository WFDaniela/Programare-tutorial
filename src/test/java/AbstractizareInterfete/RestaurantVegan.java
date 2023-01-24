package AbstractizareInterfete;

public class RestaurantVegan extends Restaurant implements InterfaceRestaurantVegan{
    public RestaurantVegan(String denumire, String felPrincipal, Integer numarStele) {
        super(denumire, felPrincipal, numarStele);
    }

    @Override
    public void cresteLegume() {
        System.out.println("Creste legume in gradina");
    }

    @Override
    public void cumparaZarzavat() {
        System.out.println("Cumpara zarzavat pentru ciorbe");

    }

    @Override
    public void preparaLegume() {
        System.out.println("Prepara legume pentru clienti");

    }
}

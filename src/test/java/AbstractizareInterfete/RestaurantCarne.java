package AbstractizareInterfete;

public class RestaurantCarne extends Restaurant implements InterfaceRestaurantCarne{
    public RestaurantCarne(String denumire, String felPrincipal, Integer numarStele) {
        super(denumire, felPrincipal, numarStele);
    }
    @Override
    public void CumparaCarne() {
        System.out.println("Cumpara carne pentru preparate");

    }

    @Override
    public void PreparaCarne() {
        System.out.println("CPrepara carne ptr meniu");

    }

    @Override
    public void CresteAnimale() {
        System.out.println("Creste animale ptr hrana");

    }


}

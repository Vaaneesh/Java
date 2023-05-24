import java.util.Comparator;

public class carPriceComparator implements Comparator<car>{
    @Override
    public int compare(car o1, car o2) {
        return o1.price-o2.price;
    }
}


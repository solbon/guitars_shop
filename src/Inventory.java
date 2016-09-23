import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sdaribazaron on 2016-09-23.
 */
public class Inventory {

    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price, String builder,
                          String model, String type, String backWood, String topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            String builder = searchGuitar.getBuilder();
            if ((builder != null) && (!builder.isEmpty()) && !builder.equals(guitar.getBuilder()))
                continue;
            String model = searchGuitar.getModel();
            if ((model != null) && (!model.isEmpty()) && !model.equals(guitar.getModel()))
                continue;
            String type = searchGuitar.getType();
            if ((type != null) && (!type.isEmpty()) && !type.equals(guitar.getType()))
                continue;
            String backWood = searchGuitar.getBackWood();
            if ((backWood != null) && (!backWood.isEmpty()) && !backWood.equals(guitar.getBackWood()))
                continue;
            String topWood = searchGuitar.getTopWood();
            if ((topWood != null) && (!topWood.isEmpty()) && !topWood.equals(guitar.getTopWood()))
                continue;
        }
        return null;
    }

}

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HireWarehouse {
    private static HireWarehouse instance;
    private List<Hire> hires = new ArrayList();

    public HireWarehouse() {
    }

    public void addHire(Hire hire) {
        this.hires.add(hire);
    }

    public void removeHire(Hire hire) {
        this.hires.remove(hire);
    }

    public List<Hire> getHires() {
        return this.hires;
    }

    public String toString() {
        String result = "";

        Hire hire;
        for(Iterator var2 = this.hires.iterator(); var2.hasNext(); result = result + hire.toString() + "\n") {
            hire = (Hire)var2.next();
        }

        return result;
    }

    public static HireWarehouse getInstance() {
        if (instance == null) {
            instance = new HireWarehouse();
        }

        return instance;
    }

    public boolean isAvailableInDate(String vin, Date dateFrom, Date dateTo) {
        Iterator var4 = this.hires.iterator();

        while(var4.hasNext()) {
            Hire hire = (Hire)var4.next();
            if (hire.getCar().getVin().equals(vin)) {
                if (hire.getDateFrom().before(dateFrom) && hire.getDateTo().after(dateFrom)) {
                    return false;
                }

                if (hire.getDateFrom().before(dateTo) && hire.getDateTo().after(dateTo)) {
                    return false;
                }
            }
        }

        return true;
    }
}

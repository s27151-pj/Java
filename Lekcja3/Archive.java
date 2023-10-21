import java.util.List;

public class Archive {
private int client_id;
private List<Car> CarRentList;

    public Archive(int client_id, List<Car> carMagList) {
        this.client_id = client_id;
        this.CarRentList = carMagList;
    }

    public int getClient_id() {
        return client_id;
    }

    public List<Car> getCarMagList() {
        return CarRentList;
    }
}

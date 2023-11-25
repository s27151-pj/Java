public class Car {
    private String brand;
    private String model;
    private String vin;
    private CarClass carClass;
    private Boolean isBorrow;

    public Car(String brand, String model, String vin, CarClass carClass, Boolean isBorrow) {
        this.brand = brand;
        this.model = model;
        this.vin = vin;
        this.carClass = carClass;
        this.isBorrow = isBorrow;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getVin() {
        return this.vin;
    }

    public CarClass getCarClass() {
        return this.carClass;
    }

    public Boolean getIsBorrow() {
        return this.isBorrow;
    }

    public Float getPriceMultiplier() {
        Float var10000;
        switch (this.carClass) {
            case BUDGET:
                var10000 = 1.0F;
                break;
            case STANDARD:
                var10000 = 1.2F;
                break;
            case PREMIUM:
                var10000 = 1.5F;
                break;
            default:
                throw new IncompatibleClassChangeError();
        }

        return var10000;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setCarClass(CarClass carClass) {
        this.carClass = carClass;
    }

    public void setIsBorrow(Boolean isBorrow) {
        this.isBorrow = isBorrow;
    }

    public String toString() {
        String var10000 = this.brand;
        return "Car{brand='" + var10000 + "', model='" + this.model + "', vin='" + this.vin + "', carClass=" + String.valueOf(this.carClass) + ", isBorrow=" + this.isBorrow + "}";
    }
}

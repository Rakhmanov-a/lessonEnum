package homeWork;

public enum TransportType {
    CAR(0.1),
    BUS(0.05),
    TRUCK(0.02);

    private double priceKm;

    TransportType(double priceKm){
        this.priceKm = priceKm;
    }

    public double getPriceKm() {
        return priceKm;
    }

    public void setPriceKm(double priceKm) {
        this.priceKm = priceKm;
    }

    public  double calculateTravelCost(double distance){
        return getPriceKm()*distance;
    }
}

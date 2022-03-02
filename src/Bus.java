import java.util.ArrayList;

public class Bus {
    final ArrayList<Passenger> passenger = new ArrayList<Passenger>();
    final double fares = 15000;
    String name;
    Driver driver;
    int usedCapacity;
    double profit;
    String[] Route;
    private int Capacity;

    public Bus(String name, Driver driver) {
        setName(name);
        setDriver(driver);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public ArrayList<Passenger> getPassenger() {
        return passenger;
    }

    public int getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(int usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public String[] getRoute() {
        return Route;
    }

    public void setRoute(String[] Route) {
        this.Route = Route;
    }

    public double getFares() {
        return fares;
    }

    boolean checkPassengerBalance(Passenger passenger) {
        if (passenger.getBalance() > 0) {
            return true;
        } else {
            return false;
        }
    }

    void topUpBalance(double topup, Passenger passenger) {
        passenger.setBalance(topup);
    }

    void dropPassengers(String s, Passenger adit) {

    }
}

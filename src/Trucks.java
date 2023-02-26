public abstract class Trucks extends Transport implements Competitor{
    private String mark;
    private static String model;
    private double engineCapacity;

    public Trucks(String mark, String model, double engineCapacity, Driver<TruckLicenseC> driver2) {
        this.mark = mark;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    public void pitStop() {
        System.out.println("Car pit stop");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Car best lap time");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Car maximum speed");
    }

    public String getMark() {
        return mark;
    }

    public static String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public void start() {
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }
}

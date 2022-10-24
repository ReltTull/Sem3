public class PickUpCar extends Car implements FuelStation, Wiping
{
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    private int loadCapacity;

    @Override
    public void fuelLoad() {}

    public void wipWindshield() {}
    public void wipHeadlight() {}
    public void wipMirrors() {}
}

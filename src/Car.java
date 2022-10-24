import java.awt.*;

public abstract class Car {
    private String mark;
    private String model;
    private Color bodyColor;
    private BodyTypes body;
    private int wheelsNumber;
    private FuelTypes fuel;
    private GearBoxTypes gearBox;
    private double engineCapacity;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(Color bodyColor) {
        this.bodyColor = bodyColor;
    }

    public BodyTypes getBody() {
        return body;
    }

    public void setBody(BodyTypes body) {
        this.body = body;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public FuelTypes getFuel() {
        return fuel;
    }

    public void setFuel(FuelTypes fuel) {
        this.fuel = fuel;
    }

    public GearBoxTypes getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBoxTypes gearBox) {
        this.gearBox = gearBox;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }


    private boolean isMoving;
    private boolean doNeedService;
    private int gear;
    private int maxGear;
    private boolean isHeadlightsWorking;
    private boolean isWipersWorking;

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        this.isMoving = moving;
    }

    public boolean isDoNeedService() {
        return doNeedService;
    }

    public void setDoNeedService(boolean doNeedService) {
        this.doNeedService = doNeedService;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getMaxGear() {
        return maxGear;
    }

    public void setMaxGear(int maxGear) {
        this.maxGear = maxGear;
    }

    public boolean isHeadlightsWorking() {
        return isHeadlightsWorking;
    }

    public void setHeadlightsWorking(boolean headlightsWorking) {
        this.isHeadlightsWorking = headlightsWorking;
    }

    public boolean isWipersWorking() {
        return isWipersWorking;
    }

    public void setWipersWorking(boolean wipersWorking) {
        this.isWipersWorking = wipersWorking;
    }

    public void moving() {
    }

    public void serve() {
    }
    /*
    метод переключения передачи, изменяет значение gear, если новое значение в диапазоне от 0 до maxGear.
    Если новое значение удовлетворяет условиями, возвращает true.
     */
    public boolean switchGear(boolean up) {
        if (up && gear + 1 <= maxGear) {
            gear++;
            return true;
        } else if (!up && gear - 1 > 0) {
            gear--;
            return true;
        }
        return false;
    }

    /*
    устанавливает isHeadlightsWorking в противоположный режим
     */
    public boolean switchHeadlights() {
        if (isHeadlightsWorking) {
            setHeadlightsWorking(false);
        } else setHeadlightsWorking(true);
        return true;
    }

    /*
    устанавливает isWipersWorking в противоположный режим
     */
    public boolean switchWipers() {
        if (isWipersWorking) {
            setWipersWorking(false);
        } else setWipersWorking(true);
        return true;
    }

}

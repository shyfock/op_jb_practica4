package classes;

public abstract class SmartDevice {

    String factory;
    String model;
    String opSys;
    int year;
    boolean isNew;

    public SmartDevice() {

    }

    public SmartDevice(String factory, String model, String opSys, int year, boolean isNew) {
        this.factory = factory;
        this.model = model;
        this.opSys = opSys;
        this.year = year;
        this.isNew = isNew;
    }

    @Override
    public String toString() {
        return "SmartDevice [factory=" + factory + ", isNew=" + isNew + ", model=" + model + ", opSys=" + opSys
                + ", year=" + year + "]";
    }

}

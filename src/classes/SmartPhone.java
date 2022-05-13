package classes;

public class SmartPhone extends SmartDevice {

    String batteryCap;
    String camera;
    String frontCam;
    double display;
    int stoCap;
    boolean dualSim;

    public SmartPhone() {

    }

    public SmartPhone(String batteryCap, String camera, String frontCam, double display, int stoCap, boolean dualSim) {
        this.batteryCap = batteryCap;
        this.camera = camera;
        this.frontCam = frontCam;
        this.display = display;
        this.stoCap = stoCap;
        this.dualSim = dualSim;
    }

    public SmartPhone(String factory, String model, String opSys, int year, boolean isNew, String batteryCap,
            String camera, String frontCam, double display, int stoCap, boolean dualSim) {
        super(factory, model, opSys, year, isNew);
        this.batteryCap = batteryCap;
        this.camera = camera;
        this.frontCam = frontCam;
        this.display = display;
        this.stoCap = stoCap;
        this.dualSim = dualSim;
    }

    @Override
    public String toString() {
        return super.toString() + "SmartPhone [batteryCap=" + batteryCap + ", camera=" + camera + ", display=" + display
                + ", dualSim="
                + dualSim + ", frontCam=" + frontCam + ", stoCap=" + stoCap + "]";
    }

}

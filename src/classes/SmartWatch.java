package classes;

public class SmartWatch extends SmartDevice {
    int autonomy;
    boolean bpmMonitor;
    boolean hrMonitor;
    boolean dreamMonitor;
    boolean simCard;
    boolean gps;
    boolean stepCount;
    int sportSet;

    public SmartWatch() {

    }

    public SmartWatch(int autonomy, boolean bpmMonitor, boolean hrMonitor, boolean dreamMonitor, boolean simCard,
            boolean gps, boolean stepCount, int sportSet) {
        this.autonomy = autonomy;
        this.bpmMonitor = bpmMonitor;
        this.hrMonitor = hrMonitor;
        this.dreamMonitor = dreamMonitor;
        this.simCard = simCard;
        this.gps = gps;
        this.stepCount = stepCount;
        this.sportSet = sportSet;
    }

    public SmartWatch(String factory, String model, String opSys, int year, boolean isNew, int autonomy,
            boolean bpmMonitor, boolean hrMonitor, boolean dreamMonitor, boolean simCard, boolean gps,
            boolean stepCount, int sportSet) {
        super(factory, model, opSys, year, isNew);
        this.autonomy = autonomy;
        this.bpmMonitor = bpmMonitor;
        this.hrMonitor = hrMonitor;
        this.dreamMonitor = dreamMonitor;
        this.simCard = simCard;
        this.gps = gps;
        this.stepCount = stepCount;
        this.sportSet = sportSet;
    }

    @Override
    public String toString() {
        return super.toString() + "SmartWatch [autonomy=" + autonomy + ", bpmMonitor=" + bpmMonitor + ", dreamMonitor="
                + dreamMonitor
                + ", gps=" + gps + ", hrMonitor=" + hrMonitor + ", simCard=" + simCard + ", sportSet=" + sportSet
                + ", stepCount=" + stepCount + "]";
    }

}

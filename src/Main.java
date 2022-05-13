import classes.SmartDevice;
import classes.SmartPhone;
import classes.SmartWatch;

public class Main {
    public static void main(String[] args) throws Exception {

        SmartDevice iphone1 = new SmartPhone("Apple", "12X Pro", "IOS 14", 2020, true, "5600mAmp", "64Mpx", "16Mpx",
                6.5, 256, false);

        SmartDevice android1 = new SmartPhone("Xiaomy", "POCO X3 pro", "Android 14", 2021, false, "6500mAmp", "64Mpx",
                "8Mpx", 7.1, 256, true);

        SmartDevice versa1 = new SmartWatch("Fit Bit", "Versa 3", "fitbit", 2021, true, 144, true, true, true, false,
                true, true, 25);

        SmartDevice iwatch1 = new SmartWatch("Apple", "Series 7", "watchOS 8", 2022, false, 72, true, true, false, true,
                true, true, 60);

        System.out.println(
                "----------------------------------\n" + iphone1.toString() + "\n----------------------------------");
        System.out.println(
                "----------------------------------\n" + android1.toString() + "\n----------------------------------");

        System.out.println(
                "----------------------------------\n" + versa1.toString() + "\n----------------------------------");
        System.out.println(
                "----------------------------------\n" + iwatch1.toString() + "\n----------------------------------");

    }
}

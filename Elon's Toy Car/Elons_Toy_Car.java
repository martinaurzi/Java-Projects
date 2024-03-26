public class ElonsToyCar {
    private int distance = 0;
    private int batteryPercentage = 100;

    // Buy a brand-new remote controlled car
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    // Display the distance driven
    public String distanceDisplay() {
        return "Driven " + distance + " meters"; 
    }

    // Display the battery percentage
    public String batteryDisplay() {
        if(batteryPercentage != 0)
            return "Battery at " + batteryPercentage + "%"; 
        else
            return "Battery empty";
    }

    // Update the number of meters driven and the battery percentage when driving as long as the battery is not drained
    public void drive() {
        if(batteryPercentage != 0){
            distance += 20;
            batteryPercentage--;
        }
    }
}
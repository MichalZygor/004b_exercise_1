public class Televisor {
    String status;

    Televisor(){
        turnOff();
    }

    void turnOn(){
        this.status = "on";
    }

    void turnOff(){
        this.status = "off";
    }

    void showStatus(){
        System.out.println("Status: " + this.status);
    }
}

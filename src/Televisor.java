public class Televisor {
    private boolean status; //true --> turn on; false --> turn off

    Televisor(){
        turnOff();
    }

    void turnOn(){
        this.status = true;
    }

    void turnOff(){
        this.status = false;
    }

    void showStatus(){
        System.out.println("Status: " + this.status);
    }
}

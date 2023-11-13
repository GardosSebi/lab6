// Fisierul Vehicle.java
public abstract class Vehicle {
    private int speed;

    public abstract void speedUp();

    public int getSpeed() {
        return speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }
}


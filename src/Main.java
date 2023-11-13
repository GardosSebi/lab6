// Fisierul Main.java
public class Main {
    public static void main(String[] args) {
        // Nu se poate instantia direct clasa Vehicle, deoarece este abstractă
        // Vehicle vehicle = new Vehicle(); // Aceasta va genera eroare de compilare

        // Se pot crea obiecte din subclasele Car și Bicycle
        Car car = new Car();
        car.speedUp();

        Bicycle bicycle = new Bicycle();
        bicycle.speedUp();
    }
}

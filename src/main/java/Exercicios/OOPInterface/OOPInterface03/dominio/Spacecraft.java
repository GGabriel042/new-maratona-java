package Exercicios.OOPInterface03.dominio;

public class Spacecraft implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying");
    }
}

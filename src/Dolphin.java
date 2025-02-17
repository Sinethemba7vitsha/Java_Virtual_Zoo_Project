public class Dolphin extends  Animal implements Swim{

    private String color;
    private double swimmingSpeed;

    public Dolphin() {
        super("Dolphin");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    @Override
    public void eatingFood(){
        System.out.println("Dolphin: I am eating delicious fish");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of "+swimmingSpeed+" nautical miles per hour");
    }
}

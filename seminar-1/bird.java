/**
 * @author Skrynnik Valeria
 * created: 2023-11-06 16:17
 */

public abstract class Bird {
    private String name;
    private String featherColor;

    public Bird(String name, String featherColor) {
        this.name = name;
        this.featherColor = featherColor;
    }

    public String getName() {
        return name;
    }

    public String getFeatherColor() {
        return featherColor;
    }
}
class Titmouse extends Bird {

    public Titmouse(String name, String featherColor) {
        super(name, featherColor);
    }

    public void sing() {
        System.out.println("Синица чирикает!");
    }

    public void buildNest() {
        System.out.println("Синица стоит гнездо.");
    }

    public static void main(String[] args) {
        Titmouse titmouse = new Titmouse("Крошечная", "Серая");

        System.out.println("Имя: " + titmouse.getName());
        System.out.println("Цвет: " + titmouse.getFeatherColor());

        titmouse.sing();
        titmouse.buildNest();
    }
}
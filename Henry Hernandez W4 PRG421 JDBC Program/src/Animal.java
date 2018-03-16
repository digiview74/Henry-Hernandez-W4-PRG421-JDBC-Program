/**
 Henry Hernandez W4 PRG421 JDBC Program
 */

public class Animal {

    private String name;
    private String color;
    private boolean canSwim;
    private boolean canFly;
    private boolean isVertebrate;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String color, boolean canSwin, boolean canFly, boolean isVertebrate) {
        this.name = name;
        this.color = color;
        this.canSwim = canSwin;
        this.canFly = canFly;
        this.isVertebrate = isVertebrate;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isVertebrate() {
        return isVertebrate;
    }

    public void setVertebrate(boolean vertebrate) {
        isVertebrate = vertebrate;
    }

    @Override
    public String toString() {

        return getName() + "\n"
                + " - Color         : " + getColor() + "\n"
                + " - Can Swim      : " + canSwim() + "\n"
                + " - Can Fly       : " + canFly() + "\n"
                + " - Is Vertebrate : " + isVertebrate();

    }
}

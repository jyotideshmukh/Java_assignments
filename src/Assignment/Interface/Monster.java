package Assignment.Interface;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Savable{
    private String name;
    private int strength;
    private int hitPoints;

    public Monster(String name, int strength, int hitPoints) {
        this.name = name;
        this.strength = strength;
        this.hitPoints = hitPoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public List<String> write() {
        List<String> monsterDetails = new ArrayList<String>();
        monsterDetails.add(this.name);
        monsterDetails.add(String.valueOf(this.strength));
        monsterDetails.add(String.valueOf(this.hitPoints));
        return monsterDetails;

    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", hitPoints=" + hitPoints +
                '}';
    }

    @Override
    public void read(List<String> savedValues) {
        this.name = savedValues.get(0);
        this.strength = Integer.parseInt(savedValues.get(1));
        this.hitPoints= Integer.parseInt(savedValues.get(2));

    }


}

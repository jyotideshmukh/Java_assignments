package Assignment.Interface;

import java.util.ArrayList;
import java.util.List;

public class Player implements Savable{

    private String name;
    private String weapon;
    private int strength;
    private int hitPoints;

    public Player(String name,int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }


    @Override
    public List<String> write() {
        List<String> playerDetails = new ArrayList<String>();
        playerDetails.add(this.name);
        playerDetails.add(String.valueOf(this.strength));
        playerDetails.add(String.valueOf(this.hitPoints));
        playerDetails.add(this.weapon);
        return playerDetails;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
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

    public String getWeapon() {
        return weapon;
    }

    public int getStrength() {
        return strength;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public void read(List<String> savedValues) {
        this.name = savedValues.get(0);
        this.strength = Integer.parseInt(savedValues.get(1));
        this.hitPoints= Integer.parseInt(savedValues.get(2));
        this.weapon = savedValues.get(3);

    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name +
                ", weapon='" + weapon +
                ", strength=" + strength +
                ", hitPoints=" + hitPoints +
                '}';
    }
}

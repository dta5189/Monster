package Monsters;

public final class Demon extends Monster {

    private int hornCount;
    private String skinTexture;

    public Demon(String name, int health, int attack, Powers power, int level, int hornCount, String skinTexture) {
        super(name, health, attack, power, level);
        this.hornCount = hornCount;
        this.skinTexture = skinTexture;
    }

    public int getHornCount(){
        return hornCount;
    }
    public String getSkinTexture(){
        return skinTexture;
    }
    @Override
    public void specialPowers(){
        System.out.println("Demon Azrael has lifted a car using " + getPower());
    }
}

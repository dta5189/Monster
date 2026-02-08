package Monsters;

public final class Wraith extends Monster {

    private int transparencyLevel;
    private boolean emitsColdAura;

    public Wraith(String name, int health, int attack, Powers power, int level, int transparencyLevel, boolean emitsColdAura) {
        super(name, health, attack, power, level);
        this.transparencyLevel = transparencyLevel;
        this.emitsColdAura = emitsColdAura;
    }

    public int getTransparencyLevel(){
        return transparencyLevel;
    }


    public boolean emitsColdAura() {
        return emitsColdAura;
    }

    @Override
    public void specialPowers() {
        System.out.println("Wraith fades into the shadows using " + getPower());
    }
}

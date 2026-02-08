package Monsters;


public final class Vampire extends Monster {

    private int fangLength; // unique to vampire
    private boolean hasRetractableFangs;

    public Vampire(String name, int health, int attack, Powers power, int level, int fangLength,boolean hasRetractableFangs) {
        super(name, health, attack, power, level);
        this.fangLength = fangLength;
        this.hasRetractableFangs = hasRetractableFangs;
    }

    public int getFangLength() {
        return fangLength;
    }

    public boolean hasRetractableFangs() {
        return hasRetractableFangs;
    }

    @Override
    public void specialPowers() {
        System.out.println("Vampire bites with fangs of length " + fangLength);
    }
}
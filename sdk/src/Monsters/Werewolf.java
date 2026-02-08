package Monsters;


public final class Werewolf extends Monster {

    private String furColor;
    private double clawSharpness;


    public Werewolf(String name, int health, int attack, Powers power, int level, String furColor, double clawSharpness) {
        super(name, health, attack, power, level);
        this.furColor = furColor;
        this.clawSharpness = clawSharpness;
    }
    public String getFurColor(){
        return furColor;
    }

    public double getClawSharpness() {
        return clawSharpness;
    }

    @Override
    public void specialPowers() {
        System.out.println("Werewolf unleashes " + getPower());
    }
}
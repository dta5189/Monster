/** Project: Monsters
 * Purpose Details: Create detailed monsters
 * Course: IST 242
 * Author: David Adeleye
 * Date Developed:2/4/26
 * Last Date Changed: 2/7/26
 * Rev: 1.0
 */

package Monsters;


//you can now manipulate the powers since we have a setter
public class Main {
    public static void main(String[] args) {

        // Create 5 monsters (each subclass has a unique characteristic)
        Monster m1 = new Vampire("Dracula", 100, 40, Powers.FLIGHT, 5, 5, true);
        Monster m2 = new Werewolf("George", 100, 50, Powers.SHAPESHIFT, 10, "Dark Gray", 8.5);
        Monster m3 = new Zombie("Frank", 200, 30, Powers.BITE, 3, 8, true);
        Monster m4 = new Wraith("Nyx", 400, 80, Powers.BLOOD_MANIPULATION, 30, 90, true);
        Monster m5 = new Demon("Azrael", 300, 67, Powers.TELEKINESIS, 40, 2, "Obsidian");

        //set the powers for monsters (required to use setter methods)
        m1.setPower(Powers.FLIGHT);
        m2.setPower(Powers.SHAPESHIFT);
        m3.setPower(Powers.BITE);
        m4.setPower(Powers.BLOOD_MANIPULATION);
        m5.setPower(Powers.TELEKINESIS);

        //Vampire
        System.out.println("Name: " + m1.getName());
        System.out.println("Health: " + m1.getHealth());
        System.out.println("Attack: " + m1.getAttack());
        System.out.println("Level: " + m1.getLevel());
        System.out.println("Power: " + m1.getPower());

        Vampire v = (Vampire) m1;
        System.out.println("Fang Length: " + v.getFangLength());
        System.out.println("Retractable Fangs: " + v.hasRetractableFangs());

        m1.specialPowers();
        System.out.println("--------------------");

        //Werewolf
        System.out.println("Name: " + m2.getName());
        System.out.println("Health: " + m2.getHealth());
        System.out.println("Attack: " + m2.getAttack());
        System.out.println("Level: " + m2.getLevel());
        System.out.println("Power: " + m2.getPower());

        Werewolf w = (Werewolf) m2;
        System.out.println("Fur Color: " + w.getFurColor());
        System.out.println("Claw Sharpness: " + w.getClawSharpness());

        m2.specialPowers();
        System.out.println("--------------------");

        //Zombie
        System.out.println("Name: " + m3.getName());
        System.out.println("Health: " + m3.getHealth());
        System.out.println("Attack: " + m3.getAttack());
        System.out.println("Level: " + m3.getLevel());
        System.out.println("Power: " + m3.getPower());

        Zombie z = (Zombie) m3;
        System.out.println("Decay Level: " + z.getDecayLevel());
        System.out.println("Missing Limbs: " + z.hasMissingLimbs());

        m3.specialPowers();
        System.out.println("--------------------");

        //Wraith
        System.out.println("Name: " + m4.getName());
        System.out.println("Health: " + m4.getHealth());
        System.out.println("Attack: " + m4.getAttack());
        System.out.println("Level: " + m4.getLevel());
        System.out.println("Power: " + m4.getPower());

        Wraith wr = (Wraith) m4;
        System.out.println("Transparency Level: " + wr.getTransparencyLevel());
        System.out.println("Emits Cold Aura: " + wr.emitsColdAura());

        m4.specialPowers();
        System.out.println("--------------------");

        //Demon
        System.out.println("Name: " + m5.getName());
        System.out.println("Health: " + m5.getHealth());
        System.out.println("Attack: " + m5.getAttack());
        System.out.println("Level: " + m5.getLevel());
        System.out.println("Power: " + m5.getPower());

        Demon d = (Demon) m5;
        System.out.println("Horn Count: " + d.getHornCount());
        System.out.println("Skin Texture: " + d.getSkinTexture());

        m5.specialPowers();
    }
}
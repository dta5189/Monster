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
        Monster m1 = new Vampire("Dracula", 100, 40, Powers.FLIGHT, 5);


        Monster m2 = new Werewolf("George", 100, 50, Powers.SHAPESHIFT, 10);


        Monster m3 = new Zombie("Frank", 200, 30, Powers.BITE, 3);

        Monster m4 = new Wraith("Nyx", 400, 80, Powers.BLOOD_MANIPULATION, 30);

        Monster m5 =  new Demon("Azrael", 300, 67, Powers.TELEKINESIS, 40);

        //set the powers for monsters
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
        m1.specialPowers();
        System.out.println("--------------------");

        //Werewolf
        System.out.println("Name: " + m2.getName());
        System.out.println("Health: " + m2.getHealth());
        System.out.println("Attack: " + m2.getAttack());
        System.out.println("Level: " + m2.getLevel());
        m2.specialPowers();
        System.out.println("--------------------");


        //Zombie
        System.out.println("Name: " + m3.getName());
        System.out.println("Health: " + m3.getHealth());
        System.out.println("Attack: " + m3.getAttack());
        System.out.println("Level: " + m3.getLevel());
        m3.specialPowers();
        System.out.println("--------------------");

        //Wraith
        System.out.println("Name: " + m4.getName());
        System.out.println("Health: " + m4.getHealth());
        System.out.println("Attack: " + m4.getAttack());
        System.out.println("Level: " + m4.getLevel());
        m4.specialPowers();
        System.out.println("--------------------");


        //Demon
        System.out.println("Name: " + m5.getName());
        System.out.println("Health: " + m5.getHealth());
        System.out.println("Attack: " + m5.getAttack());
        System.out.println("Level: " + m5.getLevel());
        m5.specialPowers();




    }

}

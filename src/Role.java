public class Role {
    String name;
    int health;
    int attackDamage;
    boolean alive;

    Role(String roleName, int roleHealth, int roleAttackDamage){
        name = roleName;
        health = roleHealth;
        attackDamage = roleAttackDamage;
        alive = true;
    }

    //attack method
    void attack(Role target) {
        if(alive) {
            System.out.println(name + " is attacking " + " target ");
            if(target.alive) {
                target.takeDamage(attackDamage);
            }
            else{
                System.out.println(target + " dead");
            }
        }
        else{
            System.out.println(name + " has died");
        }
    }
    //take damage method
    void takeDamage(int damage){

        health -= damage;
        System.out.println(name + " took " + damage + " damage! \n" + name +" has " + health + " health left");
        if(health<=0){
            alive = false;
            System.out.println(name + " has died");
        }
    }

    //healing method
    void heal(int healAmount){
        health += healAmount;
        System.out.println(name + " healed by " + healAmount + "\n" + name +" has " + health + " health left");

    }
}


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Role hero = new Role("hero", 80, 40);
        Role villian = new Role("villian", 100, 30);



        while(hero.alive && villian.alive) {
            Thread.sleep(1000);
            //attack = 0, heal = 1
            int action = (int) (Math.random() * 2);
            int whoDoesAction = (int) (Math.random() * 2);

            if (action == 0) {
                if (whoDoesAction == 0) {
                    hero.attack(villian);

                } else {
                    villian.attack(hero);
                }
            }
            else {
                int howMuchDoTheyHealBy = (int) (Math.random()*10);
                if (whoDoesAction == 0) {
                    hero.heal(howMuchDoTheyHealBy);
                } else {
                    villian.heal(howMuchDoTheyHealBy);
                }
                }
        }
        }

    }

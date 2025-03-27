public class Battle {
    public static void main(String[] args) {
    Actor dragon = new Actor("Dragon", 30, 25, 75);
    Actor hero = new Actor("Hero", 20,50, 50);
    }
    static class Actor {
        String name;
        int damage;
        int dodgeChance;
        int hitPoints;

        public Actor(String name, int damage, int dodgeChance, int hitPoints) {
            this.name = name;
            this.damage = damage;
            this.dodgeChance = dodgeChance;
            this.hitPoints = hitPoints;
        }
    }
        static class Fight {
            Actor actor1;
            Actor actor2;

            Main.Random random = new Main.Random(13,31,71, 256);

       public Fight(Actor actor1, Actor actor2) {
        this.actor1 = actor1;
        this.actor2 = actor2;
       }
        }

    }


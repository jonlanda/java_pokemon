package code;

import java.util.ArrayList;

public abstract class Pokemon {
    protected String name;
    public int health;
    protected int maxHealth;
    protected int energy;
    protected int level;
    protected int nextLevel;
    protected int nextHealth;
    protected double nextDmg;
    protected double nextEff;
    public ArrayList<Attack> attacks;

    public Pokemon(String name, int health, int energy, int level) {
        this.name = name;
        this.maxHealth = health;
        this.health = health;
        this.energy = energy;
        this.level = level;
        this.nextLevel = level + 1;
        this.nextHealth = health + 10;
        this.nextDmg = 1;
        this.nextEff = 1.25;
        this.attacks = new ArrayList<Attack>();
    }

    String getName() {
        return this.name;
    }

    int getHealth() {
        return this.health;
    }

    int getEnergy() {
        return this.energy;
    }

    int getLevel() {
        return this.level;
    }

    abstract String getType();

    public boolean attack(int number, Pokemon enemy) {
        Attack attack = attacks.get(number);
        int energycost = attack.getEnergycost();
        if (attack.getEffective() == enemy.getType()) {
            if (energy < energycost) {
                return false;
            } else {
                System.out.println(Colors.PURPLE + "\nIt's super effective!\n" + Colors.RESET);
                enemy.health -= attack.getDmg() * nextEff;
                energy -= energycost;
                energy++;
                return true;
            }
        } else {
            if (energy < energycost) {
                return false;
            } else {
                enemy.health -= attack.getDmg() * nextDmg;
                energy -= energycost;
                energy++;
                return true;
            }
        }

    }

    public boolean atkEne(int number, Pokemon enemy) {
        Attack attack = attacks.get(number);
        if (attack.getEffective() == enemy.getType()) {
            System.out.println(Colors.RED + "It's super effective!\n" + Colors.RESET);
            enemy.health -= attack.getDmg() * 1.75;
            return true;
        } else {
            enemy.health -= attack.getDmg();
            return true;
        }
    }

    public void heal() {
        this.health = this.maxHealth;
    }

    public void getLevelUp(int PkmW) {
        if (level == 1) {
            level = 2;
            level2up();
        } else if (this.level == 2) {
            level = 3;
            level3up();
        } else if (this.level == 3) {
            level = 4;
            level4up();
        } else if (this.level == 4) {
            level = 5;
            evolution(PkmW);
        }
    }

    public void level2up() {
        this.health += 5;
        this.maxHealth += 5;
        this.nextDmg = 1.1;
        this.nextEff = 1.25;
        System.out.println("Congratulations! Your " + Colors.BLUE + this.name + Colors.RESET
                + " leveled up! Its now level " + Colors.CYAN + "2" + Colors.RESET);
    }

    public void level3up() {
        this.health += 5;
        this.maxHealth += 5;
        this.nextDmg = 1.2;
        this.nextEff = 1.5;
        System.out.println("Congratulations! Your " + Colors.BLUE + this.name + Colors.RESET
                + " leveled up! Its now level " + Colors.CYAN + "3" + Colors.RESET);
    }

    public void level4up() {
        this.health += 5;
        this.maxHealth += 5;
        this.nextDmg = 1.3;
        this.nextEff = 1.75;
        System.out.println("Congratulations! Your " + Colors.BLUE + this.name + Colors.RESET
                + " leveled up! Its now level " + Colors.CYAN + "4" + Colors.RESET);
    }

    public void evolution(int PkmW) {
        if (fight.team.get(PkmW).getName() == "Swablu") {
            Pokemon newpoke = new Altaria("Altaria", 80, 2, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.remove(PkmW);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Shellos") {
            Pokemon newpoke = new Gastrodon("Gastrodon", 90, 2, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.remove(PkmW);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Zorua") {
            Pokemon newpoke = new Zoroark("Zoroark", 90, 2, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.remove(PkmW);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Cutiefly") {
            fight.team.remove(PkmW);
            Pokemon newpoke = new Ribombee("Ribombee", 75, 2, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Foongus") {
            fight.team.remove(PkmW);
            Pokemon newpoke = new Amoongus("Amoongus", 75, 2, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Bronzor") {
            Pokemon newpoke = new Bronzong("Bronzong", 100, 2, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.remove(PkmW);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Sizzlipede") {
            Pokemon newpoke = new Centiskorch("Centiskorch", 75, 2, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.remove(PkmW);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Skwovet") {
            Pokemon newpoke = new Greedent("Greedent", 85, 2, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.remove(PkmW);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Riolu") {
            Pokemon newpoke = new Lucario("Lucario", 75, 3, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.remove(PkmW);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Kabuto") {
            Pokemon newpoke = new Kabutops("Kabutops", 75, 2, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.remove(PkmW);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Librava") {
            Pokemon newpoke = new Libelldra("Libelldra", 85, 2, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.remove(PkmW);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Morelull") {
            Pokemon newpoke = new Shiinotic("Shiinotic", 75, 3, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.remove(PkmW);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Snom") {
            Pokemon newpoke = new Frosmoth("Frosmoth", 70, 4, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.remove(PkmW);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Spoink") {
            Pokemon newpoke = new Grumpig("Grumpig", 75, 2, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.remove(PkmW);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Croagunk") {
            Pokemon newpoke = new Toxicroak("Toxicroak", 80, 2, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.remove(PkmW);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Drilbur") {
            Pokemon newpoke = new Excadrill("Excadrill", 75, 2, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.remove(PkmW);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Phantump") {
            Pokemon newpoke = new Trevenant("Trevenant", 75, 2, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.remove(PkmW);
            fight.team.add(newpoke);
        } else if (fight.team.get(PkmW).getName() == "Grimer") {
            Pokemon newpoke = new Muk("Muk", 90, 2, 5);
            System.out.println(Colors.PURPLE + "Your " + fight.team.get(PkmW).getName() + " evolved to "
                    + newpoke.getName() + Colors.RESET);
            fight.team.remove(PkmW);
            fight.team.add(newpoke);
        }
    }

    public void showAttacks() {
        System.out.println(" Here the list of its attacks: \n");
        int i = 0;
        for (Attack attack : this.attacks) {
            i++;
            double dmg = attack.getDmg() * nextDmg;
            System.out.print(i + ")  " + attack.getAttackName());
            System.out.print("  deals " + Colors.RED + String.format("%.0f", dmg) + Colors.RESET + " damage,");
            System.out.print("  costs " + Colors.YELLOW + attack.getEnergycost() + Colors.RESET + " Energy and");
            System.out.println(" is effective against " + attack.getEffective() + "\n");
        }
    }
}

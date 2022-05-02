package code;

public class Attack {
    private String attackName;
    private int dmg;
    private int energycost;
    private String effective;

    public Attack(String attackName, int dmg, int energycost, String effective) {
        this.attackName = attackName;
        this.dmg = dmg;
        this.energycost = energycost;
        this.effective = effective;
    }

    String getAttackName() {
        return this.attackName;
    }

    int getDmg() {
        return this.dmg;
    }

    int getEnergycost() {
        return this.energycost;
    }

    String getEffective() {
        return this.effective;
    }
}

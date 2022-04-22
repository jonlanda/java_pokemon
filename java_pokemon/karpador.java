package java_pokemon;

<<<<<<< HEAD
public class Karpador {
    enemy karpador = new enemy("Magikarp", 20, "Type");
    Attack attack1 = new Attack("Splash", 0, 0, "Fire");
=======
public class Karpador extends Pokemon {
    public Karpador(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Splash", 0, 0, "Fire"));
    }



    String getType() {
        return "Water";
    }
>>>>>>> 0c143ace9b548fb5ac041202007a1b0aa62c7255
}

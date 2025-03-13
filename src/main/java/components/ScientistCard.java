package components;

import enums.ParticleTypes;

import java.util.HashMap;

public abstract class ScientistCard extends AbstractCard {
    protected int health;
    protected int attack;

    public ScientistCard(HashMap<ParticleTypes, Integer> castingCost, String name, int decade, int health, int attack) {
        super(castingCost, name, decade);
        this.health = health;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}

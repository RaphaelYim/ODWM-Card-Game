package components;

import enums.CardTypes;
import enums.ParticleTypes;

import java.util.HashMap;

public abstract class ScientistCard extends AbstractCard {
    protected int health;
    protected int attack;

    public ScientistCard(HashMap<ParticleTypes, Integer> castingCost, String name, int[] decade, CardTypes cardType, int health, int attack) {
        super(castingCost, name, decade, cardType);
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

    public abstract void attackCard(ScientistCard targetCard);
    public abstract void isAttackedByCard(ScientistCard attackingCard);
    public void checkTick() {
        
    }
}

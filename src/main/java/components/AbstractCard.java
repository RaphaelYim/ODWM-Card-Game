package components;

import enums.ParticleTypes;

import java.util.HashMap;

public abstract class AbstractCard {

    protected HashMap<ParticleTypes,Integer> castingCost;
    protected String name;
    protected int decade;

    public AbstractCard(HashMap<ParticleTypes, Integer> castingCost, String name, int decade) {
        this.castingCost = castingCost;
        this.name = name;
        this.decade = decade;
    }

    public abstract void castCard(Player castingPlayer);

    public HashMap<ParticleTypes, Integer> getCastingCost() {
        return castingCost;
    }

    public int getDecade() {
        return decade;
    }
    public String getName() {
        return name;
    }
}

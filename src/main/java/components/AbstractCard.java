package components;

import enums.CardTypes;
import enums.ParticleTypes;

import static util.CastingUtil.*;
import java.util.HashMap;

public abstract class AbstractCard {

    protected HashMap<ParticleTypes,Integer> castingCost;
    protected String name;
    protected int[] timeframe;
    protected CardTypes cardType;
    protected Player owner;

    public AbstractCard(HashMap<ParticleTypes, Integer> castingCost, String name, int[] timeframe, CardTypes cardType) {
        this.castingCost = castingCost;
        this.name = name;
        this.timeframe = timeframe;
        this.cardType = cardType;
    }

    public void castCard(Player castingPlayer) {
        if (canCastCard(castingPlayer,this)) {

            castingCost.forEach(
                    (particle,amount) ->
                    {
                        castingPlayer.removeParticle(particle,amount);
                    }
            );

            owner = castingPlayer;
            castingPlayer.removeFromHand(this);
            castingPlayer.addToField(this);
            etbEffect();
        } else {
            System.out.println("Insufficient Particles: You Cannot Cast This Card.");
        }
    }
    public abstract void etbEffect();
    public abstract void destroyEffect();
    public abstract void triggerEffect();

    public HashMap<ParticleTypes, Integer> getCastingCost() {
        return castingCost;
    }

    public int[] getTimeframe() {
        return timeframe;
    }
    public String getName() {
        return name;
    }
}

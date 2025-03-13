package components;

import enums.ParticleTypes;

import java.util.HashMap;
import java.util.LinkedList;
import static util.CastingUtil.createCastingCost;

public class Player {

    private int hp;
    private String name;
    private LinkedList<AbstractCard> deckList;
    private LinkedList<AbstractCard> hand;
    private LinkedList<AbstractCard> field;
    private HashMap<ParticleTypes,Integer> heldParticles;

    public Player(int hp, LinkedList<AbstractCard> deckList) {
        this.hp = hp;
        this.deckList = deckList;
        this.hand = new LinkedList<AbstractCard>();
        this.field = new LinkedList<AbstractCard>();
        this.heldParticles = createCastingCost(ParticleTypes.ELECTRON,0,ParticleTypes.PHOTON,0,ParticleTypes.QUARK,0);

    }

    public HashMap<ParticleTypes, Integer> getHeldParticles() {
        return heldParticles;
    }

    public void subtractParticle(ParticleTypes particleType, int amount) {
        heldParticles.replace(particleType,heldParticles.get(particleType)-amount);
    }

    public void addParticle(ParticleTypes particleType, int amount) {
        heldParticles.replace(particleType,heldParticles.get(particleType)+amount);
    }


}

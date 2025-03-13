package util;

import components.AbstractCard;
import components.Player;
import enums.ParticleTypes;

import java.util.HashMap;

public class CastingUtil {

    // Method Overloading is amazing
    // Methods to help create HashMaps for card casting costs.

    /**
     Helps define the casting cost for cards.
     * @param particleType Particle needed.
     * @param amount Amount of Particle needed.
     * @return Returns a HashMap with the appropriate casing cost.
     */
    public static HashMap<ParticleTypes, Integer> createCastingCost(ParticleTypes particleType, int amount) {
        HashMap<ParticleTypes,Integer> createdCastingCost = new HashMap<ParticleTypes,Integer>();
        createdCastingCost.put(particleType,amount);
        return createdCastingCost;
    }

    /**
     Helps define the casting cost for cards.
     * @param particleTypeA 1st Particle needed.
     * @param amountA Amount of the 1st Particle needed.
     * @param particleTypeB 2nd Particle needed.
     * @param amountB Amount of the 2nd Particle needed.
     * @return Returns a HashMap with the appropriate casing cost.
     */
    public static HashMap<ParticleTypes, Integer> createCastingCost(ParticleTypes particleTypeA, int amountA, ParticleTypes particleTypeB, int amountB) {
        HashMap<ParticleTypes,Integer> createdCastingCost = new HashMap<ParticleTypes,Integer>();
        createdCastingCost.put(particleTypeA,amountA);
        createdCastingCost.put(particleTypeB,amountB);
        return createdCastingCost;
    }

    /**
     Helps define the casting cost for cards.
     * @param particleTypeA 1st Particle needed.
     * @param amountA Amount of the 1st Particle needed.
     * @param particleTypeB 2nd Particle needed.
     * @param amountB Amount of the 2nd Particle needed.
     * @param particleTypeC 3rd Particle needed.
     * @param amountC Amount of the 3rd Particle needed.
     * @return Returns a HashMap with the appropriate casing cost.
     */
    public static HashMap<ParticleTypes, Integer> createCastingCost(ParticleTypes particleTypeA, int amountA, ParticleTypes particleTypeB, int amountB, ParticleTypes particleTypeC, int amountC) {
        HashMap<ParticleTypes,Integer> createdCastingCost = new HashMap<ParticleTypes,Integer>();
        createdCastingCost.put(particleTypeA,amountA);
        createdCastingCost.put(particleTypeB,amountB);
        createdCastingCost.put(particleTypeC,amountC);
        return createdCastingCost;
    }

    /**
     * Check to see if a player has the sufficient particles to cast a card.
     * @param player The player who is casting the card.
     * @param card The card that is being casting.
     * @return True or False, depending on if the player can cast the card.
     */
    public boolean canCastCard(Player player, AbstractCard card) {
        return player.getHeldParticles().getOrDefault(ParticleTypes.ELECTRON,0) >= card.getCastingCost().getOrDefault(ParticleTypes.ELECTRON,0) &&
                player.getHeldParticles().getOrDefault(ParticleTypes.PHOTON,0) >= card.getCastingCost().getOrDefault(ParticleTypes.PHOTON,0) &&
                player.getHeldParticles().getOrDefault(ParticleTypes.QUARK,0) >= card.getCastingCost().getOrDefault(ParticleTypes.QUARK,0);
    }


}

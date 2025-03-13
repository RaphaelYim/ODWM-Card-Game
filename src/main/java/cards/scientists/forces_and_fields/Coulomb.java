package cards.scientists.forces_and_fields;

import components.AbstractCard;
import components.Player;
import enums.ParticleTypes;

import java.util.HashMap;

public class Coulomb extends AbstractCard {

    public Coulomb(HashMap<ParticleTypes, Integer> castingCost, String name, int decade) {
        super(
                castingCost,
                name,
                decade);
    }

    @Override
    public void castCard(Player castingPlayer) {

    }


}

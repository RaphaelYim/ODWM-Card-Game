package cards.scientists.forces_and_fields;

import cards.apparatus.ParallelPlates;
import cards.apparatus.TorsionBalance;
import components.AbstractCard;
import components.ScientistCard;
import enums.CardTypes;
import enums.ParticleTypes;

import java.util.HashMap;
import java.util.LinkedList;

import static util.CastingUtil.createCastingCost;
import static util.DecadeUtil.outsideTimeframe;

// Faraday - F&F Scientist | 3 Electron
// Timeframe {1777, 1851}
// ATK: 3, HP: 5
// When [Faraday] enters the battlefield, all scientists you control gain 1 attack.

public class Faraday extends ScientistCard {

    public Faraday() {
        super(
                createCastingCost(ParticleTypes.ELECTRON,3),
                "Faraday",
                new int[]{1777, 1851},
                CardTypes.FNF_SCIENTIST,
                3,
                5);
    }
    @Override
    public void isAttackedByCard(ScientistCard attackingCard) {}

    @Override
    public void etbEffect() {
        owner.getField().forEach(
                (card ->  {
                    if (card instanceof ScientistCard scientistField) {
                        scientistField.setAttack(scientistField.getAttack()+1);
                    }
                })
        );
    }

    @Override
    public void triggerEffect() {
    }

    @Override
    public void destroyEffect() {

    }
}

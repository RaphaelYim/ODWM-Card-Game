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

// Henry - F&F Scientist | 4 Electron
// Timeframe {1777, 1851}
// ATK: 2, HP: 4
// When [Henry] enters the battlefield, reduce the attack of opponent scientists by 1.

public class Henry extends ScientistCard {

    public Henry() {
        super(
                createCastingCost(ParticleTypes.ELECTRON,3),
                "Henry",
                new int[]{1777, 1851},
                CardTypes.FNF_SCIENTIST,
                2,
                4);
    }
    @Override
    public void isAttackedByCard(ScientistCard attackingCard) {}

    @Override
    public void etbEffect() {
        owner.getOpponent().getField().forEach(
                (card -> {
                    if (card instanceof ScientistCard scientistField) {
                        scientistField.setAttack(scientistField.getAttack()-1);
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

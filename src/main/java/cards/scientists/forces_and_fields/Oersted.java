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

// Oersted - F&F Scientist | 3 Electron
// Timeframe {1777, 1851}
// ATK: 1, HP: 3
// When [Oersted] enters the battlefield, draw 1 card.

public class Oersted extends ScientistCard {

    public Oersted() {
        super(
                createCastingCost(ParticleTypes.ELECTRON,3),
                "Oersted",
                new int[]{1777, 1851},
                CardTypes.FNF_SCIENTIST,
                1,
                3);
    }
    @Override
    public void isAttackedByCard(ScientistCard attackingCard) {}

    @Override
    public void etbEffect() {
        owner.drawCard();
    }

    @Override
    public void triggerEffect() {
    }

    @Override
    public void destroyEffect() {

    }
}

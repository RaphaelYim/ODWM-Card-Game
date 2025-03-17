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

// Millikan - F&F Scientist | 1 Electron
// Timeframe {1868, 1953}
// ATK: 0, HP: 1
// When Millikan enters the battlefield, deal 1 damage to all scientists on enemy field.
// On your upkeep, deal 1 all scientists on enemy field.

public class Millikan extends ScientistCard {

    public Millikan() {
        super(
                createCastingCost(ParticleTypes.ELECTRON,1),
                "Millikan",
                new int[]{1868, 1953},
                CardTypes.FNF_SCIENTIST,
                1,
                0);
    }
    @Override
    public void isAttackedByCard(ScientistCard attackingCard) {}

    @Override
    public void etbEffect() {triggerEffect();}

    @Override
    public void triggerEffect() {
        LinkedList<AbstractCard> opponentField = owner.getOpponent().getField();

        int parallelPlatesCount = (int) owner.getField().stream()
                .filter(card -> card instanceof ParallelPlates)
                .count();

        int hpLost = 1 + parallelPlatesCount;

        opponentField.forEach(
                (fieldCard) -> {
                    if (fieldCard instanceof ScientistCard fieldScientist) {
                        fieldScientist.setHealth(fieldScientist.getHealth()-hpLost);
                    }
                }
        );
    }

    @Override
    public void destroyEffect() {

    }
}

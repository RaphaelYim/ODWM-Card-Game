package cards.scientists.forces_and_fields;

import components.ScientistCard;
import enums.CardTypes;
import enums.ParticleTypes;

import java.util.HashMap;
import static util.CastingUtil.createCastingCost;

// Millikan - F&F Scientist | 1 Electron
// Timeframe {1868, 1953}
// ATK: 0, HP: 1
// When Millikan enters the battlefield, deal 1 damage to any target.
// On your upkeep, deal 1 damage to any target.

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
    public void attackCard(ScientistCard targetCard) {

    }

    @Override
    public void isAttackedByCard(ScientistCard attackingCard) {

    }

    @Override
    public void etbEffect() {

    }

    @Override
    public void destroyEffect() {

    }
}

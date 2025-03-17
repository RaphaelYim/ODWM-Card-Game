package cards.scientists.forces_and_fields;

import components.Player;
import components.ScientistCard;
import enums.CardTypes;
import enums.ParticleTypes;

import static util.CastingUtil.*;
import static util.DecadeUtil.*;

// Coulomb - F&F Scientist | 7 Electrons
// Timeframe {1736, 1806}
// ATK: 3, HP: 7
// If Coulomb attacks a Scientist who has a timeframe outside his, ATK is doubled.

public class Coulomb extends ScientistCard {


    public Coulomb() {
        super(
                createCastingCost(ParticleTypes.ELECTRON,7),
                "Coulomb",
                new int[]{1736, 1806},
                CardTypes.FNF_SCIENTIST,
                3,
                2);
    }

    @Override
    public void attackCard(ScientistCard targetCard) {
        targetCard.isAttackedByCard(this);
        if(outsideTimeframe(this.timeframe,targetCard.getTimeframe())) {
            targetCard.setHealth(targetCard.getHealth()-attack*2);
        } else {
            targetCard.setHealth(targetCard.getHealth()-attack);
        }
        health -= targetCard.getAttack();
        if (health <= 0) {
            destroyEffect();
        }
        if (targetCard.getHealth() <= 0) {
            targetCard.destroyEffect();
        }
    }

    @Override
    public void isAttackedByCard(ScientistCard attackingCard) {}

    @Override
    public void etbEffect() {}

    @Override
    public void destroyEffect() {}

    @Override
    public void triggerEffect() {}
}

package cards.discovery;

import cards.scientists.forces_and_fields.Oersted;
import components.AbstractCard;
import components.Player;
import components.ScientistCard;
import enums.CardTypes;
import enums.ParticleTypes;

import java.util.HashMap;

import static util.CastingUtil.canCastCard;
import static util.CastingUtil.createCastingCost;

// ElectricMotor - F&F Discovery | 2 Electron
// Timeframe {1820,1820}
// When [Henry] enters the battlefield, reduce the attack of opponent scientists by 1.

public class SelfInductanceHenry extends AbstractCard {


    public SelfInductanceHenry() {
        super(
                createCastingCost(ParticleTypes.ELECTRON,2),
                "Self Inductance",
                new int[]{1820, 1820},
                CardTypes.DISCOVERY);
    }

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
    public void destroyEffect() {

    }

    @Override
    public void triggerEffect() {

    }
}

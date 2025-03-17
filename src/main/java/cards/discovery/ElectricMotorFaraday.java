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
// Increase attack of all scientists under your control by 1.

public class ElectricMotorFaraday extends AbstractCard {


    public ElectricMotorFaraday() {
        super(
                createCastingCost(ParticleTypes.ELECTRON,2),
                "Electric Motor",
                new int[]{1820, 1820},
                CardTypes.DISCOVERY);
    }

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
    public void destroyEffect() {

    }

    @Override
    public void triggerEffect() {

    }
}

package cards.discovery;

import cards.scientists.forces_and_fields.Oersted;
import components.AbstractCard;
import components.Player;
import enums.CardTypes;
import enums.ParticleTypes;

import java.util.HashMap;

import static util.CastingUtil.canCastCard;
import static util.CastingUtil.createCastingCost;

// Electromagnetism - F&F Discovery | 4 Electron
// Timeframe {1820,1820}
// Draw 2 cards. Can only be cast if Oersted is on the field.

public class ElectromagnetismOersted extends AbstractCard {


    public ElectromagnetismOersted() {
        super(
                createCastingCost(ParticleTypes.ELECTRON,4),
                "Electromagnetism",
                new int[]{1820, 1820},
                CardTypes.DISCOVERY);
    }

    @Override
    public void castCard(Player castingPlayer) {
        if (canCastCard(castingPlayer,this)) {

            boolean oerstedOnField = false;

            for (AbstractCard card : castingPlayer.getField()) {
                if (card instanceof Oersted) {
                    oerstedOnField = true;
                }
            }

            if (oerstedOnField) {
                castingCost.forEach(
                        (particle, amount) ->
                        {
                            castingPlayer.removeParticle(particle, amount);
                        }
                );

                owner = castingPlayer;
                castingPlayer.removeFromHand(this);
                castingPlayer.addToField(this);
                etbEffect();
            } else {
                System.out.println("You need Oersted on the field to cast this card.");
            }
        } else {
            System.out.println("Insufficient Particles: You Cannot Cast This Card.");
        }
    }

    @Override
    public void etbEffect() {
        owner.drawCard();
        owner.drawCard();
    }

    @Override
    public void destroyEffect() {

    }

    @Override
    public void triggerEffect() {

    }
}

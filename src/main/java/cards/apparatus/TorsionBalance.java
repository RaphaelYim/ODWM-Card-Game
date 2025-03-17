package cards.apparatus;

import cards.scientists.forces_and_fields.Coulomb;
import components.AbstractCard;
import components.Player;
import enums.CardTypes;
import enums.ParticleTypes;
import static util.CastingUtil.*;
import java.util.HashMap;

// Torsion Balance - F&F Apparatus | 1 Electron
// Timeframe {1785,1785}
// On upkeep, if you do not have a scientist named [Coulomb] on your field, destroy this card.
// Whenever [Coulomb] attacks, gain 1 Charge.
// Charge >= 8.99: Increase the attack of all Coulomb cards by 9.
// 8.99E9

public class TorsionBalance extends AbstractCard {

    private int charge;

    public TorsionBalance(HashMap<ParticleTypes, Integer> castingCost, String name, int[] timeframe, CardTypes cardType) {
        super(
                createCastingCost(ParticleTypes.ELECTRON,1),
                "Torsion Balance",
                new int[]{1785,1785},
                CardTypes.APPARATUS);
    }

    @Override
    public void etbEffect() {}

    @Override
    public void destroyEffect() {}

    @Override
    public void triggerEffect() {
        charge += 1;
        if (charge == 9) {
            owner.getField().forEach(
                    (card -> {
                        if (card instanceof Coulomb coulomb) {
                            coulomb.setAttack(coulomb.getAttack()+9);
                        }
                    })
            );
        }
    }
}

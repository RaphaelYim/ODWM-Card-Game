package cards.apparatus;

import components.AbstractCard;
import components.Player;
import enums.CardTypes;
import enums.ParticleTypes;
import static util.CastingUtil.*;
import java.util.HashMap;

// Torsion Balance - F&F Apparatus | 1 Electron
// Timeframe {1785,1785}
// On upkeep, if you do not have a scientist named [Coulomb] on your field, destroy this card.
// Whenever 1 or more [Coulomb] attacks, gain 1 Charge.
// 7 Charge: Multiply all scientists named [Coulomb] on your field's attack by 8.99E9 for 1 turn.
//           For the rest of the turn, [Coulomb] cannot inflict battle damage on a player.

public class TorsionBalance extends AbstractCard {

    public TorsionBalance(HashMap<ParticleTypes, Integer> castingCost, String name, int[] timeframe, CardTypes cardType) {
        super(
                createCastingCost(ParticleTypes.ELECTRON,1),
                "Torsion Balance",
                new int[]{1785,1785},
                CardTypes.APPARATUS);
    }

    @Override
    public void etbEffect() {

    }

    @Override
    public void destroyEffect() {

    }
}

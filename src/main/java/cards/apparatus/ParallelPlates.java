package cards.apparatus;

import components.AbstractCard;
import components.Player;
import enums.CardTypes;
import enums.ParticleTypes;
import static util.CastingUtil.*;
import java.util.HashMap;

// Parallel Plates - F&F Apparatus | 2 Electron
// Timeframe {1909,1909}
// Increase all damage dealt by [Millikan] by 1.

public class ParallelPlates extends AbstractCard {

    public ParallelPlates(HashMap<ParticleTypes, Integer> castingCost, String name, int[] timeframe, CardTypes cardType) {
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
    public void triggerEffect() {}
}

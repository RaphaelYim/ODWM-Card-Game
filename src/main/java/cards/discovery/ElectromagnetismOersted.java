package cards.discovery;

import components.AbstractCard;
import enums.CardTypes;
import enums.ParticleTypes;

import java.util.HashMap;

public class ElectromagnetismOersted extends AbstractCard {


    public ElectromagnetismOersted(HashMap<ParticleTypes, Integer> castingCost, String name, int[] timeframe, CardTypes cardType) {
        super(castingCost, name, timeframe, cardType);
    }

    @Override
    public void etbEffect() {

    }

    @Override
    public void destroyEffect() {

    }
}

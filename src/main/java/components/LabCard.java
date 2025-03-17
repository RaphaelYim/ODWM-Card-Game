package components;

import enums.CardTypes;
import enums.ParticleTypes;

import java.util.HashMap;

public abstract class LabCard extends AbstractCard{

    private ParticleTypes generatingParticle;

    public LabCard(String name, ParticleTypes generatingParticle) {
        super(new HashMap<ParticleTypes, Integer>(), name, new int[]{0, 9999}, CardTypes.LAB);
        this.generatingParticle = generatingParticle;
    }

    public ParticleTypes getGeneratingParticle() {
        return generatingParticle;
    }
}

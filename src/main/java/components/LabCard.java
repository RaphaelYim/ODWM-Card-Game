package components;

import enums.ParticleTypes;

import java.util.HashMap;

public abstract class LabCard extends AbstractCard{

    private ParticleTypes generatingParticle;

    public LabCard(HashMap<ParticleTypes, Integer> castingCost, String name, int decade, ParticleTypes generatingParticle) {
        super(new HashMap<ParticleTypes, Integer>(), name, decade);
        this.generatingParticle = generatingParticle;
    }

    public ParticleTypes getGeneratingParticle() {
        return generatingParticle;
    }
}

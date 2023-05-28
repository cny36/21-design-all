package com.cny.principle.pattern.create.abstractFactory;

/**
 * @author : chennengyuan
 */
public class MiProductFactory extends AbstractPorductFactory{

    @Override
    public Phone createPhone() {
        return new MiPhone();
    }

    @Override
    public Pad createPad() {
        return new MiPad();
    }
}

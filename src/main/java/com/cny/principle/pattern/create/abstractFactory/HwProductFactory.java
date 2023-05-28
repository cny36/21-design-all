package com.cny.principle.pattern.create.abstractFactory;

/**
 * @author : chennengyuan
 */
public class HwProductFactory extends AbstractPorductFactory{

    @Override
    public Phone createPhone() {
        return new HwPhone();
    }

    @Override
    public Pad createPad() {
        return new HwPad();
    }
}

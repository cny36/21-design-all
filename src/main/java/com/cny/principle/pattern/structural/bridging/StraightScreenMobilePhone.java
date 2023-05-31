package com.cny.principle.pattern.structural.bridging;

/**
 * @author : chennengyuan
 */
public class StraightScreenMobilePhone extends AbstractMobilePhone {

    public StraightScreenMobilePhone(AbstractBrand abstractBrand) {
        super(abstractBrand);
    }

    @Override
    public void showStyle() {
        System.out.println("直屏风格的手机");
    }
}

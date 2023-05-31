package com.cny.principle.pattern.structural.bridging;

/**
 * @author : chennengyuan
 */
public class FoldingScreenMobilePhone extends AbstractMobilePhone {

    public FoldingScreenMobilePhone(AbstractBrand abstractBrand) {
        super(abstractBrand);
    }

    @Override
    public void showStyle() {
        System.out.println("折叠屏风格的手机");
    }
}

package com.cny.principle.pattern.structural.bridging;

/**
 * @author : chennengyuan
 */
public abstract class AbstractMobilePhone {

    private AbstractBrand abstractBrand;

    public AbstractMobilePhone(AbstractBrand abstractBrand) {
        this.abstractBrand = abstractBrand;
    }

    public final void showAllInfo() {
        abstractBrand.show();
        showStyle();
    }

    /**
     * 具体风格交个子类去实现
     */
    public abstract void showStyle();


}

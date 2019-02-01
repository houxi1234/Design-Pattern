package com.hx.design.pattern.factory.abstr;

import com.hx.design.pattern.factory.IFood;
import com.hx.design.pattern.factory.function.BreadFactory;
import com.hx.design.pattern.factory.function.DrinkFactory;

/**
 * @author hx
 * @date 2019/2/1 15:16
 */
public class FoodFactory extends AbstractFactory{


    @Override
    public IFood getDrink() {
        return new DrinkFactory().getFood();
    }

    @Override
    public IFood getBread() {
        return new BreadFactory().getFood();
    }
}

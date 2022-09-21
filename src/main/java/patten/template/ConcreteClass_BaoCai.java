package patten.template;

/**
 * @author by pepsi-wyl
 * @date 2022-09-21 20:18
 */

// 炒包菜
public class ConcreteClass_BaoCai extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}

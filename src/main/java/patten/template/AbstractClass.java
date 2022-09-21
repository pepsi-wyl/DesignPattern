package patten.template;

/**
 * @author by pepsi-wyl
 * @date 2022-09-21 20:09
 */

// 抽象类 模板方法和基本方法
public abstract class AbstractClass {

    // 模板方法定义 为防止恶意操作，一般模板方法都加上 final 关键词
    public final void cookProcess() {
        this.pourOil();
        this.heatOil();
        this.pourVegetable();
        this.pourSauce();
        this.fry();
    }

    // 1 倒油
    public void pourOil() {
        System.out.println("倒油");
    }

    // 2 热油
    public void heatOil() {
        System.out.println("热油");
    }

    //3 倒蔬菜
    public abstract void pourVegetable();

    //4 倒调味料
    public abstract void pourSauce();

    //5 翻炒
    public void fry() {
        System.out.println("炒啊炒啊炒到熟啊");
    }

}

package patten.mediator;

/**
 * @author by pepsi-wyl
 * @date 2022-09-27 15:29
 */

//  测试类
public class T {
    public static void main(String[] args) {

        MediatorStructure mediatorStructure = new MediatorStructure();
        Tenant tenant = new Tenant("wyl", mediatorStructure);
        HouseOwner houseOwner = new HouseOwner("bsy", mediatorStructure);
        mediatorStructure.setTenant(tenant);
        mediatorStructure.setHouseOwner(houseOwner);

        tenant.constant("我要租房子.....");
        houseOwner.constant("我这有房子，你需要租吗？");

    }
}

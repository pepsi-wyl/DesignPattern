package patten.mediator;

/**
 * @author by pepsi-wyl
 * @date 2022-09-27 15:23
 */

// 具体中介者类
public class MediatorStructure extends Mediator {

    // 聚合房东和租房者
    private HouseOwner houseOwner;
    private Tenant tenant;

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    // 联络的方法
    @Override
    public void constant(String message, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }

}

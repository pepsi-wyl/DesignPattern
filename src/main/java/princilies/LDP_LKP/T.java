package princilies.LDP_LKP;

/**
 * @author by pepsi-wyl
 * @date 2022-04-23 17:38
 */
public class T {
    public static void main(String[] args) {
        Star star = new Star();
        star.setName("pepsi-wyl");
        Fans fans = new Fans();
        fans.setName("zhazha");
        Company company = new Company();
        company.setName("wyl");
        Agent agent = new Agent();
        agent.setStar(star);
        agent.setFans(fans);
        agent.setCompany(company);
        // 调用方法
        agent.meeting();
        agent.business();
    }
}

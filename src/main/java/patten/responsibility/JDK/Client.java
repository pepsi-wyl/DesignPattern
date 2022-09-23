package patten.responsibility.JDK;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 10:49
 */

public class Client {
    public static void main(String[] args) {
        Request req = null;
        Response res = null;
        FilterChain filterChain = new FilterChain().addFilter(new FirstFilter()).addFilter(new SecondFilter());
        filterChain.doFilter(req, res);
    }
}

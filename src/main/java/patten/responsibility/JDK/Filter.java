package patten.responsibility.JDK;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 10:42
 */

public interface Filter {
    public void doFilter(Request req, Response res, FilterChain c);
}

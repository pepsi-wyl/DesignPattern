package patten.responsibility.JDK;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 10:46
 */

public class SecondFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("过滤器2 前置处理");
        // 先执行所有request再倒序执行所有response
        chain.doFilter(request, response);
        System.out.println("过滤器2 后置处理");
    }
}

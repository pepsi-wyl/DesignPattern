package patten.responsibility.JDK;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 10:43
 */

public class FirstFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("过滤器1 前置处理");
        // 先执行所有request再倒序执行所有response
        chain.doFilter(request, response);
        System.out.println("过滤器1 后置处理");
    }
}

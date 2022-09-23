package patten.responsibility.JDK;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by pepsi-wyl
 * @date 2022-09-23 10:43
 */

public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();

    private int index = 0;

    // 链式调用
    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if (index == filters.size()) return;
        filters.get(index++).doFilter(request, response, this);
    }

}

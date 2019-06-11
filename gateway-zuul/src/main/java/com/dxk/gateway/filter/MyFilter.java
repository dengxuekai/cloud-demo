package com.dxk.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author dengxuekai
 * @Date 2019-05-15 10:15
 */
@Component
@Slf4j
public class MyFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        String accessToken = request.getParameter("token");
        if (StringUtils.isBlank(accessToken)) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseBody("{\"result\":\"not login\"}");
            ctx.setResponseStatusCode(403);
            ctx.set("isSuccess", false);
            return null;
        }
        log.info("login filter success!");
        return null;
    }
}

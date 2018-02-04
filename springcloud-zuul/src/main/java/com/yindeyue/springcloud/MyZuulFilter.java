package com.yindeyue.springcloud;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;


@Component
public class MyZuulFilter extends ZuulFilter{

	@Override
	public Object run() {
		 RequestContext ctx = RequestContext.getCurrentContext();
	        HttpServletRequest request = ctx.getRequest();
	        Object accessToken = request.getParameter("token");
	        if(accessToken == null) {
	            ctx.setSendZuulResponse(false);
	            ctx.setResponseStatusCode(401);
	            try {
	                ctx.getResponse().getWriter().write("token is empty");
	            }catch (Exception e){}

	            return null;
	        }
	        return null;
	    }

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		System.out.println("++++++++++++++++++++shouldFilter+++++++++++++++++++++++");
		return true;
	}

	@Override
	public int filterOrder() {
		System.out.println("++++++++++++++++++++filterOrder+++++++++++++++++++++++");
		return 0;
	}

	@Override
	public String filterType() {
		System.out.println("++++++++++++++++++++filterType+++++++++++++++++++++++");
		return "pre";
	}

}

package com.duan.microservice.common.filter;

import com.duan.microservice.common.support.RibbonFilterContextHolder;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 参数传递顾虑器
 * @author yinjihuan
 *
 */
public class HttpHeaderParamFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;  
        httpResponse.setCharacterEncoding("UTF-8");    
        httpResponse.setContentType("application/json; charset=utf-8"); 
        String uid = httpRequest.getHeader("uid");
		//RibbonFilterContextHolder.clearCurrentContext();
		RibbonFilterContextHolder.getCurrentContext().add("uid", uid);
		chain.doFilter(httpRequest, response);
	}
	
	@Override
	public void destroy() {
		
	}

}

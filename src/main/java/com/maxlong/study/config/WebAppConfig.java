package com.maxlong.study.config;

import com.maxlong.study.web.SystemPropertiesHelper;
import org.jasig.cas.client.authentication.AuthenticationFilter;
import org.jasig.cas.client.session.SingleSignOutFilter;
import org.jasig.cas.client.session.SingleSignOutHttpSessionListener;
import org.jasig.cas.client.util.AssertionThreadLocalFilter;
import org.jasig.cas.client.util.HttpServletRequestWrapperFilter;
import org.jasig.cas.client.validation.Cas20ProxyReceivingTicketValidationFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.EventListener;

/**
 * @author 作者 maxlong:
 * @version 创建时间：2017/1/5 10:55
 *          类说明
 */
//@Configuration
public class WebAppConfig {

    @Value("${uc.plat}")
    private String paltId;

    @Value("${uc.casurl}")
    private String casurl;

    @Value("${uc.servicename}")
    private String servicename;

    @Value("${uc.casServerUrlPrefix}")
    private String casServerUrlPrefix;

    /**
     * @return
     */
    @Bean
    public ServletListenerRegistrationBean systemPropertiesHelperRegistration (){
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(systemPropertiesHelperBean());
        return servletListenerRegistrationBean;
    }

    @Bean(name = "systemPropertiesHelper")
    public SystemPropertiesHelper systemPropertiesHelperBean() {
        SystemPropertiesHelper systemPropertiesHelper = new SystemPropertiesHelper();
        return systemPropertiesHelper;
    }

    /**
     *
     * @return
     */
    @Bean
    public ServletListenerRegistrationBean singleSignOutHttpSessionListenerRegistration (){
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(singleSignOutHttpSessionListenerBean());
        return servletListenerRegistrationBean;
    }

    @Bean(name = "singleSignOutHttpSessionListener")
    public SingleSignOutHttpSessionListener singleSignOutHttpSessionListenerBean() {
        SingleSignOutHttpSessionListener singleSignOutHttpSessionListener = new SingleSignOutHttpSessionListener();
        return singleSignOutHttpSessionListener;
    }

    /**
     * 该过滤器负责用户的认证工作，必须启用它*
     * @return
     */
    @Bean
    public FilterRegistrationBean singleSignOutFilterRegistration (){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setName("singleSignOutFilter");
        registration.setFilter(singleSignOutFilterBean());
        registration.addUrlPatterns("/*");
        return registration;
    }

    @Bean(name = "singleSignOutFilter")
    public SingleSignOutFilter singleSignOutFilterBean() {
        return new SingleSignOutFilter();
    }

    /**
     * 该过滤器负责用户的认证工作，必须启用它
     * @return
     */
    @Bean
    public FilterRegistrationBean authenticationFilterRegistration (){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setName("authenticationFilter");
        registration.setFilter(authenticationFilterBean());
        registration.addUrlPatterns("/main");
        registration.addInitParameter("plat", paltId);
        registration.addInitParameter("casServerLoginUrl",casurl + "/login");
        registration.addInitParameter("serverName", servicename);
        return registration;
    }

    @Bean(name = "authenticationFilter")
    public AuthenticationFilter authenticationFilterBean() {
        return new AuthenticationFilter();
    }

    /**
     * 该过滤器负责用户的认证工作，必须启用它
     * @return
     */
    @Bean
    public FilterRegistrationBean cas20ProxyReceivingTicketValidationFilterRegistration (){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setName("cas20ProxyReceivingTicketValidationFilter");
        registration.setFilter(cas20ProxyReceivingTicketValidationFilterBean());
        registration.addUrlPatterns("/main");
        registration.addInitParameter("casServerUrlPrefix", casServerUrlPrefix);
        registration.addInitParameter("serverName", servicename);
        return registration;
    }

    @Bean(name = "cas20ProxyReceivingTicketValidationFilter")
    public Cas20ProxyReceivingTicketValidationFilter cas20ProxyReceivingTicketValidationFilterBean() {
        return new Cas20ProxyReceivingTicketValidationFilter();
    }

    /**
     * 该过滤器负责实现HttpServletRequest请求的包裹，
     * 比如允许开发者通过HttpServletRequest的getRemoteUser()方法获得SSO登录用户的登录名，可选配置
     * @return
     */
    @Bean
    public FilterRegistrationBean httpServletRequestWrapperFilterRegistration (){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setName("httpServletRequestWrapperFilter");
        registration.setFilter(httpServletRequestWrapperFilterBean());
        registration.addUrlPatterns("/main");
        return registration;
    }

    @Bean(name = "httpServletRequestWrapperFilter")
    public HttpServletRequestWrapperFilter httpServletRequestWrapperFilterBean() {
        return new HttpServletRequestWrapperFilter();
    }

    /**
     * 该过滤器使得开发者可以通过org.jasig.cas.client.util.AssertionHolder来获取用户的登录名。
     * 比如AssertionHolder.getAssertion().getPrincipal().getName()
     * @return
     */
    @Bean
    public FilterRegistrationBean assertionThreadLocalFilterRegistration (){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setName("assertionThreadLocalFilter");
        registration.setFilter(assertionThreadLocalFilterBean());
        registration.addUrlPatterns("/main");
        return registration;
    }

    @Bean(name = "assertionThreadLocalFilter")
    public AssertionThreadLocalFilter assertionThreadLocalFilterBean() {
        return new AssertionThreadLocalFilter();
    }

}

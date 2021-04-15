/**
 * Copyright(c) 2011-2020 by YouCredit Inc.
 * All Rights Reserved
 */
package com.cnn.casdemo.config;

import org.jasig.cas.client.authentication.AuthenticationFilter;
import org.jasig.cas.client.boot.configuration.CasClientConfigurer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @date 2020/7/16
 */
@Configuration
public class CasConfig implements CasClientConfigurer {
    @Override
    public void configureAuthenticationFilter(FilterRegistrationBean authenticationFilter) {
        authenticationFilter.setFilter(new AuthenticationFilter());
        System.out.println("configureAuthenticationFilter---");
    }

    @Override
    public void configureValidationFilter(FilterRegistrationBean validationFilter) {
        System.out.println("configureValidationFilter---");

    }

    @Override
    public void configureHttpServletRequestWrapperFilter(FilterRegistrationBean httpServletRequestWrapperFilter) {
        System.out.println("configureHttpServletRequestWrapperFilter---");

    }

    @Override
    public void configureAssertionThreadLocalFilter(FilterRegistrationBean assertionThreadLocalFilter) {
        System.out.println("configureAssertionThreadLocalFilter---");

    }
}

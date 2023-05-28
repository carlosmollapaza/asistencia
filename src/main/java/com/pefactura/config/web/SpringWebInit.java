package com.pefactura.config.web;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import javax.servlet.Filter;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer
{
    @Override
    protected Class<?>[] getRootConfigClasses()
    {
        return new Class<?>[]{SpringWeb.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses()
    {
        return null;
    }

    @Override
    protected String[] getServletMappings()
    {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters()
    {
        CharacterEncodingFilter CharacterFilter = new CharacterEncodingFilter();
        CharacterFilter.setEncoding("UTF-8");
        return new Filter[]{CharacterFilter};
    }
}
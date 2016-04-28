package com.mitrais.bootcamp.cdi.exercise5.web;

import com.mitrais.bootcamp.cdi.common.web.annotations.WebRequestScope;
import com.mitrais.bootcamp.cdi.common.web.annotations.WebSessionScope;
import org.springframework.context.annotation.Jsr330ScopeMetadataResolver;
import org.springframework.web.context.WebApplicationContext;

/**
 * 4/28/2016
 *
 * @author kustian@mitrais.com
 */
public class CustomScopeMetadataResolver extends Jsr330ScopeMetadataResolver
{
    public CustomScopeMetadataResolver()
    {
        registerScope(WebRequestScope.class.getName(), WebApplicationContext.SCOPE_REQUEST);
        registerScope(WebSessionScope.class.getName(), WebApplicationContext.SCOPE_SESSION);
    }
}

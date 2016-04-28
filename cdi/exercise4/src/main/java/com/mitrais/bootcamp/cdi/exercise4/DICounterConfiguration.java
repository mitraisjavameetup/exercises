package com.mitrais.bootcamp.cdi.exercise4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */
@Configuration
@ComponentScan(basePackages = "com.mitrais.bootcamp.cdi.common.counter", scopeResolver = org.springframework.context.annotation.Jsr330ScopeMetadataResolver.class)
public class DICounterConfiguration
{

}

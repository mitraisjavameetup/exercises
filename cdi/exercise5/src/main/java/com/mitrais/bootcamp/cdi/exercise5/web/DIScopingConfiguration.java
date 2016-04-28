package com.mitrais.bootcamp.cdi.exercise5.web;

import com.mitrais.bootcamp.cdi.exercise5.web.CustomScopeMetadataResolver;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.mitrais.bootcamp.cdi.common.web","com.mitrais.bootcamp.cdi.exercise5.web"}, scopeResolver = CustomScopeMetadataResolver.class)
public class DIScopingConfiguration
{

}

package com.mitrais.bootcamp.cdi.common.web.annotations;

import javax.inject.Scope;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 4/28/2016
 *
 * @author kustian@mitrais.com
 */
@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface WebSessionScope
{
}

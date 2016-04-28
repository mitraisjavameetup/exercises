package com.mitrais.bootcamp.cdi.common.report.annotations;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */
@Target({FIELD,METHOD,TYPE,PARAMETER})
@Retention(RUNTIME)
@Qualifier
public @interface HTMLReportType{}

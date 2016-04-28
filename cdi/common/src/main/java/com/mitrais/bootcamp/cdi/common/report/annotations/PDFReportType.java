package com.mitrais.bootcamp.cdi.common.report.annotations;

import javax.inject.Qualifier;
import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.*;
import java.lang.annotation.Target;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */
@Target({FIELD,METHOD,TYPE,PARAMETER})
@Retention(RUNTIME)
@Qualifier
public @interface PDFReportType{}

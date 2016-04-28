package com.mitrais.bootcamp.cdi.common.report;

import com.mitrais.bootcamp.cdi.common.report.annotations.HTMLReportType;

import javax.inject.Named;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */

@Named
@HTMLReportType
public class HTMLReportWriter implements ReportWriter
{
    @Override
    public String write()
    {
        System.out.println("Exported to HTML.");
        return "HTML";
    }
}

package com.mitrais.bootcamp.cdi.common.report;

import com.mitrais.bootcamp.cdi.common.report.annotations.PDFReportType;

import javax.inject.Named;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */

@Named
@PDFReportType
public class PDFReportWriter implements ReportWriter
{
    @Override
    public String write()
    {
        System.out.println("Exported to PDF.");
        return "PDF";
    }
}

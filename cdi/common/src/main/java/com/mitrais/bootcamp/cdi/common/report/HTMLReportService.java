package com.mitrais.bootcamp.cdi.common.report;

import com.mitrais.bootcamp.cdi.common.report.annotations.HTMLReportType;
import com.mitrais.bootcamp.cdi.common.report.annotations.PDFReportType;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */
@Named
public class HTMLReportService implements ReportService
{
    private ReportWriter writer;

    @Inject
    public HTMLReportService(@HTMLReportType ReportWriter writer)
    {
        this.writer = writer;
    }

    @Override
    public String generate()
    {
        return writer.write();
    }
}

package com.mitrais.bootcamp.cdi.exercise3;

import com.mitrais.bootcamp.cdi.common.purchase.PurchaseServiceFreeTaxImpl;
import com.mitrais.bootcamp.cdi.common.purchase.PurchaseServiceVatTaxImpl;
import com.mitrais.bootcamp.cdi.common.report.HTMLReportService;
import com.mitrais.bootcamp.cdi.common.report.PDFReportService;
import com.mitrais.bootcamp.cdi.common.report.ReportService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */
public class Test1
{
    private ApplicationContext context;

    @Before
    public void setup(){
        context = new AnnotationConfigApplicationContext(DIReportConfiguration.class);
    }
    @Test
    public void testGenerateReport(){
        ReportService pdfService = context.getBean(PDFReportService.class);
        assertThat(pdfService.generate()).isEqualTo("PDF");

        ReportService htmlService = context.getBean(HTMLReportService.class);
        assertThat(htmlService.generate()).isEqualTo("HTML");
    }
}

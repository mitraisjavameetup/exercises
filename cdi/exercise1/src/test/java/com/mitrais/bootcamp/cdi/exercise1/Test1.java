package com.mitrais.bootcamp.cdi.exercise1;

import com.mitrais.bootcamp.cdi.common.payment.BitCoinGateway;
import com.mitrais.bootcamp.cdi.common.payment.CashGateway;
import com.mitrais.bootcamp.cdi.common.payment.GenericPaymentService;
import com.mitrais.bootcamp.cdi.common.payment.PaymentService;
import com.mitrais.bootcamp.cdi.common.payment.PayPalGateway;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * 4/27/2016
 *
 * @author kustian@mitrais.com
 */
public class Test1
{
    @Test
    public void testPaymentUsingPaypal(){
        PaymentService service = new GenericPaymentService(new PayPalGateway());
        assertThat(3).isEqualTo(service.completePayment());
    }
    @Test
    public void testPaymentUsingBitCoin(){
        PaymentService service = new GenericPaymentService(new BitCoinGateway());
        assertThat(2).isEqualTo(service.completePayment());
    }

    @Test
    public void testPaymentUsingCash(){
        PaymentService service = new GenericPaymentService(new CashGateway());
        assertThat(1).isEqualTo(service.completePayment());
    }
}

package com.mitrais.bootcamp.cdi.exercise5.web;

import com.mitrais.bootcamp.cdi.common.web.Countable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * 4/28/2016
 *
 * @author kustian@mitrais.com
 */
@Controller
public class SessionScopeInjection
{
    @Inject
    @Named("session")
    private Countable countable;

    @RequestMapping(path = "/session", method = RequestMethod.GET)
    @ResponseBody
    public int requestCount() {
        return countable.count() ;
    }
}

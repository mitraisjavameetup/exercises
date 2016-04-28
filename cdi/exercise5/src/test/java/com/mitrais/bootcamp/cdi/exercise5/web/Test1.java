package com.mitrais.bootcamp.cdi.exercise5.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.PrintingResultHandler;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.inject.Inject;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * 4/28/2016
 *
 * @author kustian@mitrais.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {DIScopingConfiguration.class})
public class Test1
{
    @Inject
    private WebApplicationContext wac;

    private MockMvc mockMvc;
    protected MockHttpSession mockSession;

    @Before
    public void setup()
    {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        mockSession = new MockHttpSession(wac.getServletContext(), UUID.randomUUID().toString());
        mockSession.setAttribute("jbhSecurityUserId", "TESTUSER");
    }

    @Test
    public void testRequestScope() throws Exception
    {
        this.mockMvc.perform(get("/request").accept(MediaType.APPLICATION_JSON).session(mockSession)).andExpect(content().string("1"));
        this.mockMvc.perform(get("/request").accept(MediaType.APPLICATION_JSON).session(mockSession)).andExpect(content().string("1"));
    }
    @Test
    public void testSessionScope() throws Exception
    {
        this.mockMvc.perform(get("/session").accept(MediaType.APPLICATION_JSON).session(mockSession)).andExpect(content().string("1"));
        this.mockMvc.perform(get("/session").accept(MediaType.APPLICATION_JSON).session(mockSession)).andExpect(content().string("2"));
    }
}

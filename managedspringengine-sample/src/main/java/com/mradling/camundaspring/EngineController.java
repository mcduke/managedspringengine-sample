/*
 * created on 10.10.2013 13:56:49
 */
package com.mradling.camundaspring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * EngineController
 * 
 * @author Michael Radlingmaier, Sony DADC Austria AG, michael.radlingmaier@sonydadc.com
 * @version $Id$
 */
public class EngineController implements Controller {

    private RuntimeService runtimeService;

    /* (non-Javadoc)
     * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

        //        this.getRuntimeService().startProcessInstanceByKey("sampleprocess",
        //                "TEST::" + System.currentTimeMillis(), null);

        return null;
    }

    public RuntimeService getRuntimeService() {
        return this.runtimeService;
    }

    public void setRuntimeService(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }
}

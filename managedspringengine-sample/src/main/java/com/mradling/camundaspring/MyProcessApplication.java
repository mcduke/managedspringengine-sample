/*
 * created on 12.11.2013 08:25:09
 */
package com.mradling.camundaspring;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.spring.application.SpringServletProcessApplication;

/**
 * MyProcessApplication
 * 
 * @author Michael Radlingmaier, mradling@michaelradlingmaier.com
 * @version $Id$
 */
public class MyProcessApplication extends SpringServletProcessApplication {

    @PostDeploy
    public void startProcess(ProcessEngine processEngine) throws Exception {
        System.out.println("\n\n\n\nDEPLOYED\n\n\n");
    }

}

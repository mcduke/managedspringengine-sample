/*
 * created on 10.10.2013 15:12:56
 */
package com.mradling.camundaspring;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * SimpleServiceTaskDelegate
 * 
 * @author Michael Radlingmaier, mradling@michaelradlingmaier.com
 * @version $Id$
 */
public class SimpleServiceTaskDelegate implements JavaDelegate {

    /* (non-Javadoc)
     * @see org.camunda.bpm.engine.delegate.JavaDelegate#execute(org.camunda.bpm.engine.delegate.DelegateExecution)
     */
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        execution.setVariable("PROCVAR", "Hello from servicetask!(" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + ")");
        System.out.println("SERVICE TASK, id=" + execution.getId());
    }

}

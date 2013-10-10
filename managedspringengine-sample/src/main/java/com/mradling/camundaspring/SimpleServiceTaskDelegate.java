/*
 * created on 10.10.2013 15:12:56
 */
package com.mradling.camundaspring;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * SimpleServiceTaskDelegate
 * 
 * @author Michael Radlingmaier, Sony DADC Austria AG, michael.radlingmaier@sonydadc.com
 * @version $Id$
 */
public class SimpleServiceTaskDelegate implements JavaDelegate {

    /* (non-Javadoc)
     * @see org.camunda.bpm.engine.delegate.JavaDelegate#execute(org.camunda.bpm.engine.delegate.DelegateExecution)
     */
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("SERVICE TASK, id=" + execution.getId());
    }

}

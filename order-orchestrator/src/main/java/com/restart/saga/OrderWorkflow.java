package com.restart.saga;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class OrderWorkflow implements Workflow{

    private List<WorkflowStep> workFlowList;
    @Override
    public List<WorkflowStep> getSteps() {
        return workFlowList;
    }
}

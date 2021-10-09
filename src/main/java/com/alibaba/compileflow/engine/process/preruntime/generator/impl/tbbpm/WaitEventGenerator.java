package com.alibaba.compileflow.engine.process.preruntime.generator.impl.tbbpm;

import com.alibaba.compileflow.engine.definition.tbbpm.WaitEventNode;
import com.alibaba.compileflow.engine.process.preruntime.generator.code.CodeTargetSupport;
import com.alibaba.compileflow.engine.process.preruntime.generator.constansts.EventConstants;
import com.alibaba.compileflow.engine.runtime.impl.AbstractProcessRuntime;

/**
 * @author wuxiang
 * since 2021/6/23
 **/
public class WaitEventGenerator extends AbstractTbbpmInOutActionNodeGenerator<WaitEventNode> {

    public WaitEventGenerator(AbstractProcessRuntime runtime,
                              WaitEventNode flowNode) {
        super(runtime, flowNode);
    }

    @Override
    public void generateCode(CodeTargetSupport codeTargetSupport) {
        String event = flowNode.getEventName() == null ? EventConstants.EMPTY_EVENT : flowNode.getEventName();
        generateCode(event, codeTargetSupport);
    }

}

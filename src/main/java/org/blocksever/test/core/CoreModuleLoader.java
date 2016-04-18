package org.blocksever.test.core;

import org.blocksever.test.core.test.TestModule1;
import org.blocksever.test.core.test.TestModule2;

/**
 * Created by Exerosis.
 */
public class CoreModuleLoader extends Module {
    private final TestModule1 testModule1;
    private final TestModule2 testModule2;

    public CoreModuleLoader() {
        testModule1 = new TestModule1();
        testModule2 = new TestModule2();
    }

    @Override
    protected void onEnable() {
        testModule1.enable();
        testModule2.enable();
    }

    @Override
    protected void onDisable() {
        testModule1.disable();
        testModule2.disable();
    }

    public TestModule1 getTestModule1() {
        return testModule1;
    }

    public TestModule2 getTestModule2() {
        return testModule2;
    }
}
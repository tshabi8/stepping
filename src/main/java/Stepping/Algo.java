package Stepping;

import java.io.Closeable;
import java.util.HashMap;

public interface Algo extends Closeable {

    void init();

    void setMessenger(IMessenger messenger);

    HashMap<String, Object> IoC();

    void tickCallBack();

    StepConfig getGlobalAlgoStepConfig();
}
package nl.harmvdhorst.agent;

import nl.harmvdhorst.manipulator.Manipulator;

import java.lang.instrument.Instrumentation;
import java.util.ArrayList;
import java.util.List;

public class AgentMain {

    public static void agentmain(String agentArgs, Instrumentation instrumentation){

        List<Class<?>> patches = new ArrayList<>();

        // TODO add patches


        new Manipulator(instrumentation, patches);

    }

}

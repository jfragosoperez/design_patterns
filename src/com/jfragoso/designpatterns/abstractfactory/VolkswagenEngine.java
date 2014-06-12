package com.jfragoso.designpatterns.abstractfactory;

/**
 * Created by jonathanfragoso on 12/06/14.
 */
public class VolkswagenEngine extends Engine{

    @Override
    EnginePart[] getEngineParts() {
        return new EnginePart[]{new VolkswagenValves(), new VolkswagenBlock()};
    }

    @Override
    void mountEngineFromParts(EnginePart[] engineParts) {

    }

    private class VolkswagenValves extends EnginePart{

    }

    private class VolkswagenBlock extends EnginePart{

    }
}

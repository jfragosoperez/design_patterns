package com.jfragoso.designpatterns.abstractfactory;

/**
 * Created by jonathanfragoso on 12/06/14.
 */
public abstract class Engine {

    private EnginePart[] engineParts;

    protected Engine() {
        this.engineParts = getEngineParts();
        mountEngineFromParts(engineParts);
    }

    abstract EnginePart[] getEngineParts();
    abstract void mountEngineFromParts(EnginePart[] engineParts);

    public abstract class EnginePart {

    }
}

package com.xiao.plug.reactnative.runner;

import com.intellij.openapi.components.ApplicationComponent;

import org.jetbrains.annotations.NotNull;

public class MainComponent implements ApplicationComponent
{
    public MainComponent()
    {
    }

    @Override
    public void initComponent()
    {
        // TODO: insert component initialization logic here
    }

    @Override
    public void disposeComponent()
    {
        // TODO: insert component disposal logic here
    }

    @Override
    @NotNull
    public String getComponentName()
    {
        return "MainComponent";
    }
}

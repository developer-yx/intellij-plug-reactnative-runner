package com.xiao.plug.reactnative.runner;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.ui.Messages;

import org.jetbrains.annotations.NotNull;

import icons.Icons;

public class ReloadComponent implements ApplicationComponent
{
    public ReloadComponent()
    {
    }

    @Override
    public void initComponent()
    {

    }

    @Override
    public void disposeComponent()
    {

    }

    @Override
    @NotNull
    public String getComponentName()
    {
        return "MainComponent";
    }

    public void reloadJs()
    {
        Runtime runtime = Runtime.getRuntime();

        try
        {
            runtime.exec("adb shell input keyevent 46 46");
        }
        catch (Exception e)
        {
            Messages.showMessageDialog("Failed to reload ReactNative Js.", "Error", Messages.getWarningIcon());
        }
    }
}

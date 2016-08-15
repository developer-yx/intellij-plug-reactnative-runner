package com.xiao.plug.reactnative.runner;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.ui.Messages;

import org.jetbrains.annotations.NotNull;

public class RunComponent implements ApplicationComponent
{
    public RunComponent()
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
        return "RunComponent";
    }

    public void runAndroid(String path)
    {
        if (path == null)
        {
            Messages.showMessageDialog("Can not find current project path.", "Error", Messages.getWarningIcon());

            return;
        }

        Runtime runtime = Runtime.getRuntime();

        try
        {
            runtime.exec("cmd.exe /c cd /d \"" + path + "\"");

            runtime.exec("react-native run-android");
        }
        catch (Exception e)
        {
            Messages.showMessageDialog("Failed to execute the cmd line.", "Error", Messages.getWarningIcon());
        }
    }
}

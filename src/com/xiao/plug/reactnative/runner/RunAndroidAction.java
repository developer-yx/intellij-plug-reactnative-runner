package com.xiao.plug.reactnative.runner;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;

public class RunAndroidAction extends AnAction
{

    @Override
    public void actionPerformed(AnActionEvent e)
    {
        Application application = ApplicationManager.getApplication();

        RunComponent component = application.getComponent(RunComponent.class);

        component.runAndroid(e.getProject().getBasePath());
    }
}

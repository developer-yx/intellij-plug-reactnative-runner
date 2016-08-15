package com.xiao.plug.reactnative.runner;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;

public class ReloadAction extends AnAction
{

    @Override
    public void actionPerformed(AnActionEvent event)
    {
        Application application = ApplicationManager.getApplication();

        ReloadComponent component = application.getComponent(ReloadComponent.class);

        component.reloadJs();
    }
}

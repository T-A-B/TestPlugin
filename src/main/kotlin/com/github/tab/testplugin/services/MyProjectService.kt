package com.github.tab.testplugin.services

import com.intellij.openapi.project.Project
import com.github.tab.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

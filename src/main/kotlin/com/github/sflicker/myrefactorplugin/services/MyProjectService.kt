package com.github.sflicker.myrefactorplugin.services

import com.github.sflicker.myrefactorplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

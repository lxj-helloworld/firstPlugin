package com.github.lxjhelloworld.firstplugin.services

import com.intellij.openapi.project.Project
import com.github.lxjhelloworld.firstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

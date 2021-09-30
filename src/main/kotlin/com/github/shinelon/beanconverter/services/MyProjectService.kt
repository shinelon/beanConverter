package com.github.shinelon.beanconverter.services

import com.intellij.openapi.project.Project
import com.github.shinelon.beanconverter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

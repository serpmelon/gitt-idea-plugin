package com.github.serpmelon.gittideaplugin.services

import com.github.serpmelon.gittideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

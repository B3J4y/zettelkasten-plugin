package com.github.b3j4y.zettelkastenplugin.services

import com.intellij.openapi.project.Project
import com.github.b3j4y.zettelkastenplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

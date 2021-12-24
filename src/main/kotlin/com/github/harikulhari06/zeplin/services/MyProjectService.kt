package com.github.harikulhari06.zeplin.services

import com.intellij.openapi.project.Project
import com.github.harikulhari06.zeplin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

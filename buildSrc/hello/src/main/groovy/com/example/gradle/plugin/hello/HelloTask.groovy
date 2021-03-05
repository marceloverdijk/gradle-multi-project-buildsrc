package com.example.gradle.plugin.hello

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class HelloTask extends DefaultTask {

    HelloTask() {
        group = "other"
        description = "Prints a hello message."
    }

    @TaskAction
    def foo() {
        println "Hello ${project.extensions.hello.name}!!"
    }
}

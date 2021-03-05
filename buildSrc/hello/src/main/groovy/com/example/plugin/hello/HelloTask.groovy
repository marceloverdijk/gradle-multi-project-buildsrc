package com.example.plugin.hello

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class HelloTask extends DefaultTask {

    // String group = "hello"

    @TaskAction
    def foo() {
        println "Hello ${project.extensions.hello.name}!!"
    }
}

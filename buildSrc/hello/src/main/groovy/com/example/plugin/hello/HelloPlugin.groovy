package com.example.plugin.hello

import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        project.extensions.create("hello", HelloPluginExtension)

        project.tasks.create("hello",  HelloTask) {
            description = "Prints a hello message."
        }
    }
}

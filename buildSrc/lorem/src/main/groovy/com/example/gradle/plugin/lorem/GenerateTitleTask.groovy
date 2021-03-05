package com.example.gradle.plugin.lorem

import com.thedeanda.lorem.LoremIpsum
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class GenerateTitleTask extends DefaultTask {

    GenerateTitleTask() {
        group = "lorem"
        description = "Generates a lorem title."
    }

    @TaskAction
    def generate() {
        int min = project.extensions.lorem.titleMin
        int max = project.extensions.lorem.titleMax
        println LoremIpsum.getInstance().getTitle(min, max)
    }
}

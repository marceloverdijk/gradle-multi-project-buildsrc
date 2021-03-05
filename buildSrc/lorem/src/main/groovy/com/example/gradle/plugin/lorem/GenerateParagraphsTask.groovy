package com.example.gradle.plugin.lorem

import com.thedeanda.lorem.LoremIpsum
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class GenerateParagraphsTask extends DefaultTask {

    GenerateParagraphsTask() {
        group = "lorem"
        description = "Generates lorem paragraphs."
    }

    @TaskAction
    def generate() {
        int min = project.extensions.lorem.paragraphsMin
        int max = project.extensions.lorem.paragraphsMax
        println LoremIpsum.getInstance().getParagraphs(min, max)
    }
}

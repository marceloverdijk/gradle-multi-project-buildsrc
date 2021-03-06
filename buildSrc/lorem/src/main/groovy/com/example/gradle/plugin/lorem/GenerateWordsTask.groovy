package com.example.gradle.plugin.lorem

import com.thedeanda.lorem.LoremIpsum
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class GenerateWordsTask extends DefaultTask {

    GenerateWordsTask() {
        group = "lorem"
        description = "Generates lorem words."
    }

    @TaskAction
    def generate() {
        int min = project.extensions.lorem.wordsMin
        int max = project.extensions.lorem.wordsMax
        println LoremIpsum.getInstance().getTitle(min, max)
    }
}

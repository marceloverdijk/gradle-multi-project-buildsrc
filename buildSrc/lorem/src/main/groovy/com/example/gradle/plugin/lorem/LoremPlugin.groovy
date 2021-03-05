package com.example.gradle.plugin.lorem

import org.gradle.api.Plugin
import org.gradle.api.Project

class LoremPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        project.extensions.create("lorem", LoremPluginExtension)

        project.tasks.create("generateWords", GenerateWordsTask) {
            description = "Generates lorem words."
        }

        project.tasks.create("generateParagraphs", GenerateParagraphsTask) {
            description = "Generates lorem paragraphs."
        }

        project.tasks.create("generateTitle", GenerateTitleTask) {
            description = "Generates a lorem title."
        }
    }
}

package com.example.gradle.plugin.lorem

import org.gradle.api.Plugin
import org.gradle.api.Project

class LoremPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create("lorem", LoremPluginExtension)
        project.tasks.create("generateWords", GenerateWordsTask)
        project.tasks.create("generateParagraphs", GenerateParagraphsTask)
        project.tasks.create("generateTitle", GenerateTitleTask)
    }
}

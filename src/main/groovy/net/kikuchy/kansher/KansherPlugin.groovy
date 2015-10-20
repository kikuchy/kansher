package net.kikuchy.kansher

import net.kikuchy.kansher.dsl.KansherBlock
import net.kikuchy.kansher.entity.AlignmentSheet
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by kikuchy on 2015/10/12.
 */
class KansherPlugin implements Plugin<Project> {
    @Override
    void apply(Project target) {
        def emptyAlignmentSheet = target.container(AlignmentSheet)
        def mainBlock = new KansherBlock(emptyAlignmentSheet)
        target.convention.plugins.osewer = mainBlock
        target.extensions.osewer = mainBlock

        target.task("osewer", KansherTask)
        target.group = "Osewer"
        target.description = "Generate legal alignment text for expressing your thanks."
    }
}

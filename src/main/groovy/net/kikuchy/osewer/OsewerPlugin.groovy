package net.kikuchy.osewer

import net.kikuchy.osewer.dsl.OsewerBlock
import net.kikuchy.osewer.entity.AlignmentSheet
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by kikuchy on 2015/10/12.
 */
class OsewerPlugin implements Plugin<Project> {
    @Override
    void apply(Project target) {
        def emptyAlignmentSheet = target.container(AlignmentSheet)
        def mainBlock = new OsewerBlock(emptyAlignmentSheet)
        target.convention.plugins.osewer = mainBlock
        target.extensions.osewer = mainBlock

        target.task("osewer", OsewerTask)
        target.group = "Osewer"
        target.description = "Generate legal alignment text for expressing your thanks."
    }
}

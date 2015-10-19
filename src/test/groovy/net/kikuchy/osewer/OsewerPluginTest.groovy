package net.kikuchy.osewer

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

/**
 * Created by kikuchy on 2015/10/12.
 */
class OsewerPluginTest {
    @Test
    public void プラグインをプロジェクトに追加できる() {
        Project project = ProjectBuilder.builder().build()
        project.plugins.apply(OsewerPlugin)

        assertTrue(project.tasks.osewer instanceof OsewerTask)
    }
}

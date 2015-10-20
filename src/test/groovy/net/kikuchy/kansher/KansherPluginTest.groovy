package net.kikuchy.kansher

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

/**
 * Created by kikuchy on 2015/10/12.
 */
class KansherPluginTest {
    @Test
    public void プラグインをプロジェクトに追加できる() {
        Project project = ProjectBuilder.builder().build()
        project.plugins.apply(KansherPlugin)

        assertTrue(project.tasks.osewer instanceof KansherTask)
    }
}

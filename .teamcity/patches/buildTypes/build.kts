package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'build'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("build")) {
    expectSteps {
    }
    steps {
        insert(0) {
            script {
                scriptContent = """
                    lerna bootstrap
                    lerna run build
                """.trimIndent()
            }
        }
    }
}

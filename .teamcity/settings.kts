import jetbrains.buildServer.configs.kotlin.v2018_2.*

version = "2019.1"

project {
    buildType(HelloWorld)
}

object HelloWorld : BuildType({
    name = "Hello World"
    steps {
        script {
            name = "Hello World"
            scriptContent = """
                echo "hello world! I'm a build"
            """.trimIndent()
        }
    }
})
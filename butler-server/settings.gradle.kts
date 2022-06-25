rootProject.name = "butler-server"


val includeProjects: List<String> = listOf(
    "butler-common",
)
includeProjects.forEach {
    include(":$it")
    project(":$it").projectDir = File(settingsDir, "../$it")
}

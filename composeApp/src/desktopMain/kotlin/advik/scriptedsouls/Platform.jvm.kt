package advik.scriptedsouls

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("java.version")} (Desktop)"
}

actual fun getPlatform(): Platform = JVMPlatform()
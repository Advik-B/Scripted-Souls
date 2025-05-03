package advik.scriptedsouls

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
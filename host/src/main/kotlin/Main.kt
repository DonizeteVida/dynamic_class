import java.io.File
import java.net.URLClassLoader

fun main(args: Array<String>) {
    val jar = File("../client.jar")
    if (!jar.exists()) throw IllegalStateException("client.jar must be built first!")
    val classLoader = URLClassLoader(
        arrayOf(jar.toURI().toURL()),
        ClassLoader.getSystemClassLoader()
    )
    //care because it'll also try to load using parent class loader
    val clazz = classLoader.loadClass("CommonBehaviorImpl")
    val instance = clazz.getDeclaredConstructor().newInstance() as CommonBehavior
    instance.run()
    println("Acabou!")
}
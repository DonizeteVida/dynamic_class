class CommonBehaviorImpl : CommonBehavior {
    override fun run() {
        println("A client implementation")
    }
}

//you cant run it
//because we've linked it at compile time, only
//we haven't CommonBehavior class at runtime
//fun main() {
//    val commonBehavior: CommonBehavior = CommonBehaviorImpl()
//    commonBehavior.run()
//}

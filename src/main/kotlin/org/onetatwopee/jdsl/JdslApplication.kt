package org.onetatwopee.jdsl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JdslApplication

fun main(args: Array<String>) {
    runApplication<JdslApplication>(*args)
}

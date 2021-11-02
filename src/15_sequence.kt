import java.util.concurrent.TimeUnit
import javax.sound.midi.Sequence
import kotlin.system.measureNanoTime

fun main() {
    measure {
        val list = generateSequence(1){ it + 1  }
            .take(50_000_000)
            .toList()

        val avg = list.filter{ it %3 == 0}.average()

        println("Done!!")
        println(avg)
    }

    println("-----------------------------")
    measure {
        val sequence = generateSequence(1){ it + 1  }
            .take(50_000_000)


        val avg = sequence.filter{ it %3 == 0}.average()

        println("Done!!")
        println(avg)
    }

    println("-----------------------------")
    listOf("A", "B", "C").filter {
        println("filter : $it")
        true
    }
    .forEach {
        println("foreach : $it")
    }

    println("-----------------------------")
    sequenceOf("A", "B", "C").filter {
        println("filter : $it")
        true
    }
    .forEach {
        println("foreach : $it")
    }
}

fun measure(block:() -> Unit){
    val nanoTime = measureNanoTime(block)
    val milliTime = TimeUnit.NANOSECONDS.toMillis(nanoTime)
    println(nanoTime)
    println(milliTime)
}
import scala.scalanative.unsafe._
import scala.scalanative.unsafe.Size.intToSize

@extern
object libc {
  def malloc(size: CSize): Ptr[Byte] = extern
}


object Main {
  def main(args: Array[String]): Unit =
    val a = libc.malloc(10.toCSize)
    println(a)
}

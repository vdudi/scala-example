package example

import scala.xml._

/**
 * Created by vdudi on 9/15/15.
 */
object XmlProcess {
  def main(args:Array[String]): Unit ={
    val foo = <xml><addme>12</addme><addme>14</addme><addme>17</addme> </xml>

    println("foo: "+foo)

    println("foo.text: "+foo.text)

    val bar = (foo \ "addme")

    println("bar: "+bar)

    val list = bar.map(_.text.toString.toInt).sum

    println("sum: "+list)

    //val sum = list.flatMap(x=> x.toString.toInt + x.toString.toInt)
    //val sum = bar.map(_.text).mkString(" ")

    //toString.toInt)

    //println("sum: "+sum)


  }

}

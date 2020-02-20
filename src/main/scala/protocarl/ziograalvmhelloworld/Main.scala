package protocarl.ziograalvmhelloworld

import zio.console.putStrLn
import zio.{App, ZIO}

object Main extends App {

  override def run(args: List[String]): ZIO[zio.ZEnv, Nothing, Int] =
    putStrLn("Hello, World!").as(0)

}

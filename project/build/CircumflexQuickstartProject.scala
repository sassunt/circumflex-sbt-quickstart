import sbt._
import com.github.olim7t.sbtscalariform._

class CircumflexQuickstartProject(info: ProjectInfo) extends DefaultWebProject(info) with ScalariformPlugin {

    val cxVer = "2.0"
    override val jettyPort = 8180

    override def libraryDependencies = Set(
        "ru.circumflex" % "circumflex-core" % cxVer % "compile->default",
        "ru.circumflex" % "circumflex-orm" % cxVer % "compile->default",
        "ru.circumflex" % "circumflex-ftl" % cxVer % "compile->default",

        "javax.servlet" % "servlet-api" % "2.5" % "compile->default",

        "org.mortbay.jetty" % "jetty" % "6.1.26" % "test->default"
    ) ++ super.libraryDependencies
}

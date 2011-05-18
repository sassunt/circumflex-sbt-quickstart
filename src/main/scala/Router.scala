package circumflex_quickstart

import ru.circumflex._, core._, web._, freemarker._

class MyRouter extends RequestRouter {

    get("/") = "<h1>it works!</h1>"

    get("/freemarker") = {
      object simpleObject {
        val name = "Joe"
        val subobj = new Object {
          val name = "Smith"
        }
        override def toString = name + " " + subobj.name
      }
      'obj:= simpleObject
      ftl("index.ftl")
    }
}

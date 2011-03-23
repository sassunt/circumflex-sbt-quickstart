package circumflex_sbt_web_project

import ru.circumflex._, core._, web._

class DefaultWebProject extends RequestRouter {

    get("/") = "<h1>it works!</h1>"
}

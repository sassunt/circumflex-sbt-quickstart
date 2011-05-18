package circumflex_quickstart

import ru.circumflex._, core._, web._, freemarker._

class MyRouter extends RequestRouter {

    get("/") = "<h1>it works!</h1>"
}

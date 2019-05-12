package controllers

import javax.inject._
import play.api._
import play.api.libs.json.Json
import play.api.mvc._
import repository.TestData
import scalikejdbc.config.DBs

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc)
{
    DBs.setupAll()

    /**
    * Create an Action to render an HTML page.
    *
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
    def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    {
        Ok(views.html.index())
    }}

    def explore(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    {
        Ok(views.html.explore())
    }}

    def tutorial(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    {
        Ok(views.html.tutorial())
    }}

}

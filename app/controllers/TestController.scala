package controllers

import javax.inject.{Inject, Singleton}
import play.api.libs.json.Json
import play.api.mvc._
import repository.TestData

@Singleton
class TestController @Inject()(cc: ControllerComponents) extends AbstractController(cc)
{
	def helloworld(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
	{
		val response_data = Json.obj(
			"message" -> "Hello world!",
			"list" -> Json.toJson(TestData.all())
		)

		Ok(response_data)
	}}
}

package repository

import play.api.libs.json.{Json, OFormat}
import scalikejdbc._

case class TestData(
	name: String,
	body: String
)

object TestData
{
	implicit val db_session: AutoSession.type   = AutoSession
	implicit val json_format: OFormat[TestData] = Json.format[TestData]

	def apply(rs: WrappedResultSet): TestData = new TestData(
		rs.string("test_name"),
		rs.string("test_body")
	)

	def all(): Seq[TestData] =
	{
		sql"""select * from testdata""".map(rs => TestData(rs)).list().apply()
	}

	def getById(id: Int): Option[TestData] =
	{
		sql"""select * from testdata where test_id = $id""".map(rs => TestData(rs)).list().apply().headOption
	}
}

package webapp.tier.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.naming.NamingException;

import webapp.tier.constant.EnumService;
import webapp.tier.util.CreateId;

@ApplicationScoped
public class PostgresService {

	private static final Logger LOG = Logger.getLogger(PostgresService.class.getSimpleName());
	private static String message = EnumService.common_message.getString();
	private static String url = EnumService.postgres_url.getString();
	private static String sqlkey = EnumService.postgres_insert_msg_id.getString();
	private static String sqlbody = EnumService.postgres_insert_msg_body.getString();
	private static String insertsql = EnumService.postgres_insert_msg.getString();
	private static String selectsql = EnumService.postgres_select_msg_all.getString();
	private static String deletesql = EnumService.postgres_delete_msg_all.getString();
	private Connection con = null;

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url);
	}

	public boolean connectionStatus() {
		boolean status = false;
		try {
			con = getConnection();
			status = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return status;
	}

	public String insert() throws SQLException, NamingException {
		Connection con = null;
		String sql  = null;
		String id = String.valueOf(CreateId.createid());

		try {
			sql = insertsql.replace(sqlkey, id).replace(sqlbody, message);

			con = getConnection();
			Statement stmt = con.createStatement();

			LOG.info("Insert SQL: " + sql);
			stmt.executeUpdate(sql);

		}  finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return sql;
	}

	public List<String> select() throws SQLException, NamingException {
		Connection con = null;
		List<String> allmsg = new ArrayList<>();

		try {
			con = getConnection();
			Statement stmt = con.createStatement();

			LOG.info("Select SQL: " + selectsql);
			ResultSet rs = stmt.executeQuery(selectsql);

			while (rs.next()) {
				String fullmsg = "Selected Msg: id: " + rs.getString("id") + ", message: " + rs.getString("msg");
				LOG.info(fullmsg);
				allmsg.add(fullmsg);
			}

			if(allmsg.isEmpty()){
				allmsg.add("No Data");
			}

		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return allmsg;
	}

	public String delete() throws SQLException, NamingException {
		Connection con = null;

		try {
			con = getConnection();
			Statement stmt = con.createStatement();

			LOG.info("Delete SQL: " + deletesql);
			stmt.executeUpdate(deletesql);

		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return "Deleted";
	}

}
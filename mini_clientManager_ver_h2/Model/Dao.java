package Model;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Dao {

	private Connection con;
	private Statement stmt = null;
	private ResultSet rs = null;
	private PreparedStatement pstmt;

	public Vector<Vector> selctAll() {
		con = Connect.getConnection();
		Vector<Vector> member = new Vector<>();

		String srt = "select * from members";
		try {
			con = Connect.getConnection();
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			rs = stmt.executeQuery(srt);

			while (rs.next()) {
				Vector vector = new Vector<>();

				int no = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);

				vector.add(no);
				vector.add(name);
				vector.add(email);
				vector.add(email);

				member.add(vector);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return member;

	}

	public void insert(Member dto) {
		con = Connect.getConnection();
		String srt = "insert into  members(name,email,phone) values (?,?,?)";

		String name = dto.getName();
		String email = dto.getMail();
		String phone = dto.getPhone();

		try {
			pstmt = con.prepareStatement(srt);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, phone);
			int cnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	public Vector<Vector> search(String nameS) {

		con = Connect.getConnection();
		Vector<Vector> member = new Vector<>();
		String srt = "select * from members";
		
		
		try {
			con = Connect.getConnection();
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			rs = stmt.executeQuery(srt);

			while (rs.next()) {
				
				if(rs.getString(2).equals(nameS)){
				Vector vector = new Vector<>(); 
						int no = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);

				vector.add(no);
				vector.add(name);
				vector.add(email);
				vector.add(email);

				member.add(vector);}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return member;

	}

	public void delete(int idx2) {
		String srt = "DELETE FROM MEMBERS WHERE NO=?";
		con = Connect.getConnection();

		try {
			con = Connect.getConnection();
			pstmt = con.prepareStatement(srt);
			pstmt.setInt(1, idx2);
			int ctn = pstmt.executeUpdate();
			if (ctn > 0) {
				System.out.println("삭제완료");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}

package Model;

import java.io.*;
import java.util.Vector;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Dao {

	private String pathname = "E:\\MR\\JavaWork2\\MiniProject_clien_manager\\src\\Resources\\students.json";
	private FileReader reader;
	private FileWriter writer;
	private int idx = 5;

	private JSONObject getObject() {

		try {
			File file = new File(pathname);
			if (!file.exists()) {
				file.createNewFile();
				writer = new FileWriter(file);

				String start = "{\"studentArr\": [{}],\"req\":1}";
				System.out.println(start);
				writer.write(start);
				writer.close();
				return null;
			}

			reader = new FileReader(file);

			JSONTokener token = new JSONTokener(reader);
			return new JSONObject(token);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public Dao() {

	}

	public Vector<Vector> selctAll() {

		JSONObject jsobj = getObject();

		if (jsobj == null || jsobj.getInt("req") == 1) {
			return null;
		}
		JSONArray jArr = jsobj.getJSONArray("studentArr");

		Vector v = new Vector<>();
		for (int i = 0; i < jArr.length(); i++) {
			JSONObject dbj = jArr.getJSONObject(i);
			Vector vector = new Vector<>();
			vector.add(dbj.get("no"));
			vector.add(dbj.get("name"));
			vector.add(dbj.get("mail"));
			vector.add(dbj.get("phone"));

			v.add(vector);

		}

		return v;

	}

	public void insert(Member dto) {

		File file = new File(pathname);

		if (!file.exists()) {
			JSONObject newobj = new JSONObject();
			newobj.put("no", 1);
			newobj.put("name", dto.getName());
			newobj.put("mail", dto.getMail());
			newobj.put("phone", dto.getPhone());

			JSONArray newArr = new JSONArray();
			newArr.put(newobj);

			JSONObject jobj = new JSONObject();
			jobj.put("studentArr", newArr);
			jobj.put("req", 2);

			try {

				writer = new FileWriter(file);
				writer.write(jobj.toString(2));
				writer.close();

			} catch (JSONException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();

			} finally {
				try {
					if (writer != null) {
						writer.close();
					}
					if (reader != null) {
						reader.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			return;

		}

		JSONObject some = getObject();
		///위에는 파일이 없을떄 =
		////// 최초입력일때/////////////////////////////////////////////////

		if (some.getInt("req") == 1) {
			JSONObject newobj = new JSONObject();
			newobj.put("no", 1);
			newobj.put("name", dto.getName());
			newobj.put("mail", dto.getMail());
			newobj.put("phone", dto.getPhone());

			JSONArray newArr = new JSONArray();
			newArr.put(newobj);

			JSONObject jobj = new JSONObject();
			jobj.put("studentArr", newArr);
			jobj.put("req", 2);

			try {

				writer = new FileWriter(file);
				writer.write(jobj.toString(2));
				writer.close();

			} catch (JSONException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();

			} finally {
				try {
					if (writer != null) {
						writer.close();
					}
					if (reader != null) {
						reader.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			return;

		}

		/////////////////
		////// 밑에는 파일이 있을때///////
		dto.setNo(idx);
		idx++;

		JSONObject obj = new JSONObject();
		int req = some.getInt("req");

		obj.put("no", req++);
		obj.put("name", dto.getName());
		obj.put("mail", dto.getMail());
		obj.put("phone", dto.getPhone());

		((JSONArray) some.get("studentArr")).put(obj);
		some.put("req", req);

		try {

			writer = new FileWriter(file);
			writer.write(some.toString(2));
			writer.close();

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public Vector search(String name) {
		JSONObject jsobj = getObject();

		JSONArray newArr = (JSONArray) jsobj.get("studentArr");

		Vector v = new Vector<>();
		for (int i = 0; i < newArr.length(); i++) {

			JSONObject oneP = (JSONObject) newArr.get(i);

			if (oneP.get("name").equals(name)) {

				Vector vector = new Vector<>();
				vector.add(oneP.get("no"));
				vector.add(oneP.get("name"));
				vector.add(oneP.get("mail"));
				vector.add(oneP.get("phone"));

				v.add(vector);

			}

		}

		if (v != null) {
			return v;
		}

		return null;

	}

	public void delete(int idx2) {

		JSONObject jsobj = getObject();

		JSONArray newArr = (JSONArray) jsobj.get("studentArr");

		Vector v = new Vector<>();

		int arrint=-1;
		for (int i = 0; i < newArr.length(); i++) {

			JSONObject oneP = (JSONObject) newArr.get(i);

			if (oneP.get("no").equals(idx2)) {

				arrint = i;
			}

		}
		
		
		newArr.remove(arrint);
		
		
		jsobj.put("studentArr", newArr);
		
		File file = new File(pathname);
		
		try {

			writer = new FileWriter(file);
			writer.write(jsobj.toString(2));
			writer.close();

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

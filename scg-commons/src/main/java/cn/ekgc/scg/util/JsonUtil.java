package cn.ekgc.scg.util;

import com.fasterxml.jackson.databind.json.JsonMapper;

/**
 * <b>智慧公务车信息平台-JSON转换工具类</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
public class JsonUtil {
	/**
	 *<b>将对象转换为Json格式数据</b>
	 * @param  obj
	 * @return
	 */
	public static String pareToJson(Object obj){
		//创建JSONMapper对象
		JsonMapper jsonMapper= new JsonMapper();
		//进行数据转换
		try {
			return jsonMapper.writeValueAsString(obj);
		}catch (Exception e){
			e.printStackTrace();
		}
		return "{}";
	}
	/**
	 *<b>按照目标对象类型将Json转换为该类型对象</b>
	 * @param json
	 * @param argClass
	 * @return
	 */
	public static Object parseToObject(String json,Class argClass){
		//创建JsonMapper对象
		JsonMapper jsonMapper = new JsonMapper();
		try {
			return jsonMapper.readValue(json,argClass);
		}catch (Exception e){
			e.printStackTrace();
		}
		return null ;
	}
}

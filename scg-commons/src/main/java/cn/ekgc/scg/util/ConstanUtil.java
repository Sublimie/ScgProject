package cn.ekgc.scg.util;

import java.util.Properties;

/**
 * <b>智慧公务车信息平台-常量工具类</b>
 *  @author Arthur
 *  @version 1.0.0
 *  @since 1.0.0
 */
public class ConstanUtil {
	private static Properties props = new Properties();

	static {
		try {
			//加载properties 配置文件
			props.load(ConstanUtil.class.getClassLoader().getResourceAsStream("props/system.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	/**
	 *<b>系统分页信息：默认当前页码<b/>
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("page.num"));
	/**
	 *<b>系统分页信息：默认每页显示信息</b>
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("page.size"));

}

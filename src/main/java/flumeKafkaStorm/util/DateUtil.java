package flumeKafkaStorm.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取当前时间戳，格式转换
 * @author Linzhiyong
 * return 当前时间String
 */
public class DateUtil {
	 /* 
     * 将时间戳转换为时间
     */
	public static String getCurrentTime(){
		SimpleDateFormat currentTime=new SimpleDateFormat("yyyyMMddHHmmss");
		return currentTime.format(new Date());
	}
}

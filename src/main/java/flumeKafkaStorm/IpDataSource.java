package flumeKafkaStorm;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import flumeKafkaStorm.util.DateUtil;

/**
 * ip数据源
 * second version
 * @author Linzhiyong
 *
 */
public class IpDataSource {

	private static final String[] BROWSER = new String[] { "IE", "Firefox", "Chrome", "Opera", "360", "UC", "Safari",
			"QQ", "百度", "猎豹", "傲游" };
	private static Logger logger = LoggerFactory.getLogger(IpDataSource.class);

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		Random random = new Random();

		String accessTime;
		String browser;
		String ip;
		String ipRecord;
		// 您的IP是：[117.176.143.9] 来自：四川省成都市 移动
	
		while(true){
		str.append(random.nextInt(254) + 1);
		str.append(".");
		str.append(random.nextInt(255));
		str.append(".");
		str.append(random.nextInt(255));
		str.append(".");
		str.append(random.nextInt(254) + 1);
		// 赋值
		ip = str.toString();
		accessTime = DateUtil.getCurrentTime();
		 browser = BROWSER[random.nextInt(11)];
		// 写到flume
		 ipRecord=accessTime + "\t" + ip + "\t" + browser;
		logger.info(ipRecord);
		System.out.println(ipRecord);
		str.setLength(0);
		}
	}

}

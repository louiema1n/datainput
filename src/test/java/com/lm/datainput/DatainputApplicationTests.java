package com.lm.datainput;

import com.lm.datainput.domain.Ansrecord;
import com.lm.datainput.service.AnsrecordService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatainputApplicationTests {

	@Autowired
	private AnsrecordService ansrecordService;

	@Test
	public void insert() {
		Ansrecord ansrecord = new Ansrecord();
		ansrecord.setExamid(111);
		ansrecord.setAnsid("222");
		ansrecord.setAnser("ACC");
		ansrecord.setSelectans("A");
		this.ansrecordService.save(ansrecord);
	}
//
	@Test
	public void query() {
        System.out.println(this.ansrecordService.getAll().get(0).getAnser());
//        System.out.println(this.ansrecordMapper.selectAlls().get(0).getAnser());
	}

	@Test
	public void contextLoads() {
		// 大型仪器-单台套
		String address = "http://oauth.qwings.cn/EquWebService/cxf/instru?wsdl";
		String json = "{\"achievement\":\"无\",\"address\":\"上海市曹安公路4800号 同济大学机械与能源学院\",\"auditStatus\":\"-1\",\"beginDate\":\"2015-04-09\",\"city\":\"上海市\",\"cname\":\"高温环境伺服成形试验机\",\"contact\":\"林建平\",\"county\":\"嘉定区\",\"email\":\"jplin58@tongji.edu.cn\",\"ename\":\"High Temperature Environment Servo Forming Test Machine\",\"fee\":\"收费标准：校内、校外2种不同收费标准。收费方式：议价及其他。1、单向拉伸实验：70-260元/样品2、板料拉伸压缩实验：750-1500元/样品3、金属板料Y-U模型参数确定实验及数据处理：6000-12000元/样品4、具体收费根据复杂程度及工作量情况而定。注：双拉试验610-25000元/件\",\"function\":\"适用于金属、非金属等板料及棒材在常温下的准静态力学性能测试；金属板材在室温至300℃下的拉伸及压缩下的性能测试；金属板料在高温下的成形实验研究。 1、成形试验：普通单向拉伸、单向压缩、弯曲试验；循环加载卸载试验；拉伸速度跳高试验；板料拉伸压缩循环加载试验等。 2、拉伸可采用载荷、位移及速度控制等方式，且可实现不同控制方式间的平滑切换。 3、具备同步接口功能，可与DIC高速相机配合使用。\",\"image\":\"http://equip-sharing.sjtu.edu.cn/UpLoadFile/ApparatusPhoto/20161227/201131779-ETAS仿真与开发装置.jpg\",\"innerId\":\"14602413\",\"insCode\":\"qwings\",\"instrBelongsName\":\"无\",\"instrBelongsType\":\"无\",\"instrCategory\":\"020101\",\"instrSource\":\"购置\",\"instrSupervise\":\"否\",\"instrVersion\":\"E45.105\",\"manufacturer\":\"美特斯工业系统（中国）有限公司\",\"nation\":\"中国\",\"phone\":\"021-65983943\",\"postalcode\":\"201804\",\"province\":\"上海市\",\"requirement\":\"预约安排，每周工作日时间9:00--12:00，13:30--16:00开放\",\"serviceContent\":\"无\",\"serviceUrl\":\"http://czb.tongji.edu.cn/dxyq/yqyygl/sbyy_add.jsp?czlx=1&innerID=14602413\",\"shareMode\":\"外部共享\",\"status\":\"正常\",\"street\":\"机械与能源工程学院B103机械与能源工程学院B103\",\"subject\":\"临床医学,化学\",\"technical\":\"1、最大负荷：±100KN； 2、引伸计标距：50mm，测量范围：50%，精度：0.5级； 3、含耐高温（II00C）压杆，能配合高温环境箱进行高温成形试验；  4、数据采样频率最大1000HZ；5、夹具夹头夹持力可调，且满足板料拉压过零试验（(±100KN），不打滑； 6、最小加载速度0.00lmm/min，最大加载速度500mm/min； 7、位移行程≥1200mm；位移精度± 0.5%，位移分辨率 0.000041 mm； 8、适用试样范围：板试样厚度0-2Imm，圆试样直径: 6-22.9mm；9、测力范围：0.4%-100%，测量精度 0.5级。\",\"type\":\"通用\",\"worth\":\"64.49\"}";
		String method = "instruInfo";
		String orgnId = "gz0d";
		runWebService(address, method, orgnId, json);

		// 服务项目
//		String address = "http://oauth.qwings.cn/EquWebService/cxf/productService?wsdl";
//		String json = "{\"name\":\"HSSSSSS01\",\"items\":[{\"name\":\"服务规格01\",\"priceDef\":20.00,\"price\":3.00,\"discountCondition\":\"7折\",\"comments\":\"高规格\",\"ID\":\"GGG01\"}],\"equs\":[{\"ID\":\"14602413\"}],\"serviceField\":\"服务领域\",\"keyWords\":\"关键字\",\"abstract\":\"摘要\",\"imgPath\":\"http://equip-sharing.sjtu.edu.cn/UpLoadFile/ApparatusPhoto/20161227/201131779-ETAS仿真与开发装置.jpg\",\"sample\":\"可测样品描述\",\"priceUnitType\":\"计价方式\",\"priceUpper\":500,\"priceLower\":100,\"priceUnitTypeOther\":\"如面议\",\"serviceTime\":\"服务时间\",\"contactPerson\":\"联系人姓名\",\"email\":\"邮箱\",\"contactTel\":\"固定电话\",\"contactMobile\":\"手机\",\"description\":\"详细描述\",\"serviceNote\":\"注意事项\",\"ID\":\"hssssssss001\"}";
//		String method = "getAddProduct";
//		String orgnId = "gz0d";
//		runWebService(address, method, orgnId, json);

		// 服务记录
//		String address = "http://oauth.qwings.cn/EquWebService/cxf/productRecordService?wsdl";
//		String json = "{\"accountId\":\"客户信息id\",\"attach\":[{\"url\":\"www.bjprd.com.cn\",\"url2\":\"www.bj.com.cn\"}],\"finalPrice\":1000.0,\"finishTime\":\"2010-07-28 00:00:00\",\"hasContract\":\"项目合同\",\"id\":\"hssssssss001\",\"machineHour\":[{\"duration\":\"50\",\"equipmentId\":\"14602413\",\"id\":\"2001\",\"remark\":\"备注\",\"testMajorId\":\"hssssssss001\"}],\"projectNoTwo\":\"项目编号\",\"reportRequire\":\"其他要求\",\"reportType\":\"报告形式\",\"reportWay\":\"报告方式\",\"sampleNum\":12,\"testMajor\":[{\"id\":\"hssssssss001\",\"standardAccord\":\"依据标准\",\"tecgRequire\":\"技术要求\",\"testRemark\":\"备注\"}]}";
//		String method = "getAddProductRecord";
//		String orgnId = "gz0d";
//		runWebService(address, method, orgnId, json);

	}

	// 调用接口
	public void runWebService(String address, String method, String orgnId, String json) {
		// 创建动态客户端
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		Client client = dcf.createClient(address);

		ArrayList list = new ArrayList();
		list.add(json);
		Object[] objects = new Object[0];
		try {
			if (method.equals("instruInfo")) {
				objects = client.invoke(method, orgnId, 4, list);
			} else {
				objects = client.invoke(method, orgnId, list);
			}
			System.out.println("返回数据:" + objects[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

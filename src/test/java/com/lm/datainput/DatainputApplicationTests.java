package com.lm.datainput;

import com.lm.datainput.domain.Ansrecord;
import com.lm.datainput.mapper.AnsrecordMapper;
import com.lm.datainput.service.AnsrecordService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatainputApplicationTests {

	@Autowired
	private AnsrecordMapper ansrecordMapper;

	@Test
	public void insert() {
		Ansrecord ansrecord = new Ansrecord();
		ansrecord.setExamid(111);
		ansrecord.setAnsid("222");
		ansrecord.setAnser("ACC");
		this.ansrecordMapper.insert(ansrecord);
	}

	@Test
	public void query() {
		this.ansrecordMapper.selectAll();
	}

}

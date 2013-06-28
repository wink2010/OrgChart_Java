package com.systemsinmotion.orgchart.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.systemsinmotion.orgchart.Entities;
import com.systemsinmotion.orgchart.dao.IJobTitleDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/test-context.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class JobTitleTest {

	private JobTitle jobTitle;

	@Autowired
	IJobTitleDao jobTitleDao;

	@After
	public void after() {
		this.jobTitleDao.delete(this.jobTitle);
	}

	@Before
	public void before() throws Exception {
		this.jobTitle = Entities.jobTitle();
		this.jobTitle.setId(this.jobTitleDao.save(this.jobTitle));
	}

	@Test
	public void created() {
		assertNotNull(this.jobTitle);
		assertNotNull(this.jobTitle.getId());
	}

}
package com.example.mathservice;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MathServiceApplicationTests {

	@Autowired
	private UserConstructorInjection userConst;
	@Autowired
	private UserSetterInjection userSetter;
	@Autowired
	private UserAddressSalaryValueInjection userAddSalValue;

	@Value("${PATH}")
	private String path;

	@Autowired
	private UserFieldInjection userField;

	@Autowired
	private Television tv;

	@Autowired
	private Faker faker; //configure bean for third party library configuration. This is manual configuration.
	// We can add @component to third party classes so we manually create an instance of that class and ask spring boot to manage it for us

	@Test
	void contextLoads() {
		userConst.getUserDetails();
		userSetter.getUserDetails();
		userField.getUserDetails();
		userAddSalValue.getUserDetails();
		System.out.println(faker.address().city());
		System.out.println(path);
		tv.playMovie();
	}



}

package com.likedbyme.cucumber;

import com.likedbyme.LikedByMeApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = LikedByMeApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}

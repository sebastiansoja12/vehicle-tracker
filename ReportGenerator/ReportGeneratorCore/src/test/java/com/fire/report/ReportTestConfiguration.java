package com.fire.report;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = { "com.fire.report"})
@EntityScan(basePackages = { "com.fire.report"})
@EnableJpaRepositories(basePackages = { "com.fire.report"})
public class ReportTestConfiguration {


}

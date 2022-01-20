package multi.database.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import lombok.extern.slf4j.Slf4j;

@Configuration
@PropertySource("classpath:/application.properties")
@MapperScan(value="multi.database.mapper.home", sqlSessionFactoryRef="homeSqlSessionFactory")

@Slf4j
public class HomeConfig {
	@Autowired
	private ApplicationContext applicationContext;

	@Bean(name="hoemHikariConfig")
	@ConfigurationProperties(prefix = "spring.datasource2.hikari")
	public HikariConfig hikariConfig() {
		return new HikariConfig();
	}

	@Bean(name="homeDataSource")
	public DataSource dataSource() {
		DataSource dataSource = new HikariDataSource(hikariConfig());
		log.info("homedatasource : {}", dataSource);
		return dataSource;
	}

	@Bean(name="homeSqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath*:mappers/home/**/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}

	@Bean(name="homeSqlSessionTemplate")
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}

package com.pefactura.config.jpa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.pefactura")
public class JpaDataBase
{
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory()
    {
        var factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource());
        factoryBean.setPackagesToScan("com");

        Properties properties = new Properties();
        properties.setProperty("hibernate.show_sql", "true");
        properties.setProperty("hibernate.generate_statistics", "true");

        var vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setShowSql(true);
        vendorAdapter.setGenerateDdl(false);// true
        vendorAdapter.setDatabase(Database.POSTGRESQL);
        vendorAdapter.setDatabasePlatform("org.hibernate.dialect.PostgreSQLDialect");
        factoryBean.setJpaVendorAdapter(vendorAdapter);
        factoryBean.setJpaProperties(properties);
        return factoryBean;
    }

    @Bean
    public DataSource dataSource()
    {
        var source = new DriverManagerDataSource();
        source.setDriverClassName("org.postgresql.Driver");
        source.setUrl("jdbc:postgresql://127.0.0.1:5432/asistencia");
        source.setUsername("postgres");
        source.setPassword("TVOGVGmcl9xDmc21");
        return source;
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf)
    {
        return new JpaTransactionManager(emf);
    }
}
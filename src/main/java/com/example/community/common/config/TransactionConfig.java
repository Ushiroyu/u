package com.example.community.common.config;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.interceptor.NameMatchTransactionAttributeSource;
import org.springframework.transaction.interceptor.RuleBasedTransactionAttribute;
import org.springframework.transaction.interceptor.TransactionAttribute;
import org.springframework.transaction.interceptor.TransactionInterceptor;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
@Configuration
public class TransactionConfig {
    @Autowired
    private DataSource dataSource;
    @Bean("transactionManager")
    public TransactionManager transactionManager(){
        return new DataSourceTransactionManager(dataSource);
    }
    @Bean("txAdvice")
    public TransactionInterceptor transactionInterceptor(TransactionManager transactionManager){
        NameMatchTransactionAttributeSource source = new NameMatchTransactionAttributeSource();
        RuleBasedTransactionAttribute requiredTx = new RuleBasedTransactionAttribute();
        requiredTx.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        RuleBasedTransactionAttribute readOnlyTx = new RuleBasedTransactionAttribute();
        readOnlyTx.setReadOnly(true);
        Map<String, TransactionAttribute> map = new HashMap<>();
        map.put("add*", requiredTx);//Pointcut匹配到的方法中所有add开头的方法
        map.put("save*", requiredTx);//Pointcut匹配到的方法中所有save开头的方法
        map.put("create*", requiredTx);//Pointcut匹配到的方法中所有save开头的方法
        map.put("insert*", requiredTx);
        map.put("update*", requiredTx);
        map.put("delete*", requiredTx);
        map.put("select*", readOnlyTx);
        map.put("get*", readOnlyTx);
        source.setNameMap(map);
        return new TransactionInterceptor(transactionManager, source);
    }
    @Bean
    public DefaultPointcutAdvisor defaultPointcutAdvisor(TransactionInterceptor txAdvice){
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();
        advisor.setAdvice(txAdvice);
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution (* com.example.community.service.impl.*.*(..))");
        advisor.setPointcut(pointcut);
        return advisor;
    }
}

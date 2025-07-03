package com.dfl.pinkRabbit.mybatis.context;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class DflongFactoryBean implements FactoryBean {

    private SqlSession sqlSession;

    private Class mapperClass;

    public DflongFactoryBean(Class mapperClass) {
        this.mapperClass = mapperClass;
    }

    @Autowired
    public void setSqlSession(SqlSessionFactory sqlSessionFactory) {
        sqlSessionFactory.getConfiguration().addMapper(mapperClass);
//                .addMappers("com.apollo.purplecat.mybatis.mapper");
        this.sqlSession = sqlSessionFactory.openSession();
    }

    @Override
    public Object getObject() throws Exception {
//        UserMapper mapper = sqlSession.getMapper(mapperClass);
//        Object o = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{UserMapper.class}, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        return sqlSession.getMapper(mapperClass);
    }

    @Override
    public Class<?> getObjectType() {
        return mapperClass;
    }
}

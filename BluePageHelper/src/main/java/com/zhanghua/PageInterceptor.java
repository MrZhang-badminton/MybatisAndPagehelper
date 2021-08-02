package com.zhanghua;

import com.zhanghua.model.Page;
import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

@Intercepts({
		@Signature(type = StatementHandler.class,
				method = "prepare",
				args = {Connection.class, Integer.class})
})
public class PageInterceptor implements Interceptor {
	@Override
	public Object intercept(Invocation invocation) throws Throwable {

		//从Innovation拿到StatementHandler对象
		StatementHandler statementHandler = (StatementHandler) invocation.getTarget();

		//从StatementHandle对象拿到原始的SQL语句和分页参数
		BoundSql boundSql = statementHandler.getBoundSql();
		String sql = boundSql.getSql();

		//获取StatementHandler
		MetaObject metaObject = SystemMetaObject.forObject(statementHandler);

		//获取分页参数
		Page page = BluePageHelper.getLocalPage();
		BluePageHelper.clearLocalPage();

		if (page != null) {

			//增加分页子句
			String pageSql = this.generatePageSql(sql, page);

			//把拼装了分页部分的pageSQL赋给StatementHandler中的boundSQL
			metaObject.setValue("delegate.boundSql.sql", pageSql);
		}

		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
	}

	/**
	 * 生成分页sql
	 *
	 * @param sql
	 * @param page
	 * @return
	 */
	private String generatePageSql(String sql, Page page) {
		StringBuffer sb = new StringBuffer();
		sb.append(sql);
		sb.append(" limit " + page.getStartRow() + " ," + page.getPageSize());
		return sb.toString();
	}

	/**
	 * 查询总数,但是还没用到
	 * @param sql
	 * @param invocation
	 * @param metaObject
	 * @return
	 * @throws SQLException
	 */
//	private int getTotal(String sql, Invocation invocation, MetaObject metaObject) throws SQLException {
//		int total = 0;
//		//基于原始SQL(select * from t_user)获取记录总数
//		String countSql = "select count(0) from (" + sql + ")temp";
//
//		//使用JDBC查询count
//		Connection connection = (Connection) invocation.getArgs()[0];
//		PreparedStatement countStatement = connection.prepareStatement(countSql);
//		ParameterHandler parameterHandler = (ParameterHandler) metaObject.getValue("delegate.parameterHandler");
//		parameterHandler.setParameters(countStatement);
//		ResultSet rs = countStatement.executeQuery();
//		if (rs.next()) {
//			total = rs.getInt(1);
//		}
//		rs.close();
//		countStatement.close();
//		return total;
//	}
}

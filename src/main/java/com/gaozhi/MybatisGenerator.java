package com.gaozhi;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.BeetlTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * mybatis-plus 代码生成器
 *
 * @author guoyu
 */
public class MybatisGenerator {

	public static void main(String[] args) {
		AutoGenerator generator = new AutoGenerator();

		// set freemarker engine
		generator.setTemplateEngine(new FreemarkerTemplateEngine());

		// set beetl engine
		generator.setTemplateEngine(new BeetlTemplateEngine());

		//配置 GlobalConfig
		GlobalConfig globalConfig = new GlobalConfig();
		globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
		globalConfig.setAuthor("guoyu");
		globalConfig.setOpen(false);
		generator.setGlobalConfig(globalConfig);

		// 包配置
		PackageConfig pc = new PackageConfig();
		pc.setModuleName(scanner("模块名,没有则输入空"));
		pc.setParent("com.gaozhi");
		generator.setPackageInfo(pc);

		// 策略配置
		StrategyConfig strategy = new StrategyConfig();
		strategy.setNaming(NamingStrategy.underline_to_camel);
		strategy.setColumnNaming(NamingStrategy.underline_to_camel);
		//strategy.setSuperEntityClass("com.baomidou.ant.common.BaseEntity");
		strategy.setEntityLombokModel(false);
		strategy.setRestControllerStyle(true);
		//strategy.setSuperControllerClass("com.baomidou.ant.common.BaseController");
		strategy.setTablePrefix("t_");
		String[] split = scanner("表名，多个英文逗号分割,生成所有则输入空").split(",");
		if(split.length > 0) split = null;
		strategy.setInclude(split);
		strategy.setSuperEntityColumns("id");
		strategy.setControllerMappingHyphenStyle(true);
		generator.setStrategy(strategy);

		//配置 DataSourceConfig
		DataSourceConfig dataSourceConfig = new DataSourceConfig();
		dataSourceConfig.setUrl("jdbc:mysql://xxxx:3306/springboot_v2?useUnicode=true&useSSL=false&characterEncoding=utf8");
		dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
		dataSourceConfig.setUsername("root");
		dataSourceConfig.setPassword("xxx");
		generator.setDataSource(dataSourceConfig);


		//自定义属性注入
		InjectionConfig injectionConfig = new InjectionConfig() {
			//自定义属性注入:abc
			//在.ftl(或者是.vm)模板中，通过${cfg.abc}获取属性
			@Override
			public void initMap() {
				Map<String, Object> map = new HashMap<>();
				map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
				this.setMap(map);
			}
		};
		AutoGenerator mpg = new AutoGenerator();
		//配置自定义属性注入
		mpg.setCfg(injectionConfig);
		generator.setCfg(injectionConfig);


		//执行生成
		generator.execute();

	}

	/**
	 * <p>
	 * 读取控制台内容
	 * </p>
	 */
	public static String scanner(String tip) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder help = new StringBuilder();
		help.append("请输入" + tip + "：");
		System.out.println(help.toString());
		if (scanner.hasNextLine()) {
			String ipt = scanner.nextLine();
			System.out.println("输入值: " + ipt.trim());
			return ipt.trim();
		}
		throw new MybatisPlusException("请输入正确的" + tip + "！");
	}
}

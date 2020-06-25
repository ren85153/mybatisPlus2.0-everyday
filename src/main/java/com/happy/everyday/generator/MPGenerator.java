package com.happy.everyday.generator;


import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @description:MP代码生成器
 */
public class MPGenerator {
	
    
    public static void main(String[] args) {
    	
    	final String path = "D:\\WorkSpace\\IDEA-space\\mybatisPlus2.0-everyday\\";
    	final String commonPath = "src\\main\\java\\";
    	final String voPath = "com\\happy\\everyday\\reqVo\\";
    	final String pageAndJSPath_base = "com\\happy\\everyday\\view\\base\\";
    	final String pageAndJSPath_vue = "com\\happy\\everyday\\view\\vue\\";
    	final String pageAndJSPath_axios = "com\\happy\\everyday\\view\\axios\\";
    	final String pageAndJSPath_table = "com\\happy\\everyday\\view\\table\\";



    	final String JAVA_CHAR = ".java";
    	final String VUE_CHAR = ".vue";
    	final String JS_CHAR = ".js";
    	final String BASE_PACKAGE = "com.happy.everyday";
    	
        //创建代码生成器
        AutoGenerator mpg = new AutoGenerator();

        
        //指定模板引擎  默认velocity 
        //mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        
        //全局配置
        GlobalConfigExtend config = new GlobalConfigExtend();
//        gc.setOpen(false);
//        config.setOutputDir("D:\\WorkSpace\\sts-space\\myProject\\src\\main\\java");
//        gc.setFileOverride(true); //是否覆盖已有文件
//        gc.setBaseResultMap(true); //XML是否需要BaseResultMap
//        gc.setBaseColumnList(true); //XML是否显示字段
//        gc.setControllerName("%sController");
//        gc.setServiceName("%sService");
//        gc.setServiceImplName("%sServiceImpl");
//        gc.setMapperName("%sMapper");
//        gc.setXmlName("%sMapper");
//        gc.setIdType(IdType.AUTO);
        ((GlobalConfigExtend) config.setActiveRecord(true)
		        .setAuthor("yanghui")
		        .setOutputDir(commonPath)
		        .setEnableCache(false)
		        .setBaseResultMap(true)
		        .setBaseColumnList(true)
		        .setIdType(IdType.AUTO)//主键类型
		        .setFileOverride(true)
		        .setControllerName("%sController")
		        .setServiceName("%sService")
		        .setServiceImplName("%sServiceImpl")
		        .setMapperName("%sMapper")
		        .setXmlName("%sMapper")
		        .setServiceName("%sService"))
		        .setSwagger2(true);  //是否使用Swagger
  
        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/study?characterEncoding=utf8&useSSL=false");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        
        String[] tables = {"sys_user","sys_role","sys_menu","sys_user_role","sys_role_menu","sys_dict","sys_logs"};
//        String[] tables = {"sys_dict"};
        
        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(BASE_PACKAGE);
        pc.setEntity("entity");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("serviceImpl");
        pc.setMapper("mapper");
        pc.setXml("mapper");
        
     // 模板配置
        InjectionConfig ic = new InjectionConfig() {
            @Override
            public void initMap() {
            }
        };
        TemplateConfig tc = new TemplateConfig();
        tc.setXml(null)
                .setServiceImpl(null)
                .setController("templates/vm/controller.java.vm")
                .setEntity("templates/vm/entity.java.vm")
                .setMapper("templates/vm/mapper.java.vm")
                .setService("templates/vm/service.java.vm");
        //添加add 请求对象
        List<FileOutConfig> foc = new ArrayList<>();
        foc.add(new FileOutConfig("/templates/vm/addVo.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return path + commonPath + voPath + "Add" + tableInfo.getEntityName() + "Req" + JAVA_CHAR;
            }
        });
        //添加update 请求对象
        foc.add(new FileOutConfig("/templates/vm/updateVo.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return path + commonPath + voPath + "Update" + tableInfo.getEntityName() + "Req" + JAVA_CHAR;
            }
        });
        //添加list请求对象
        foc.add(new FileOutConfig("/templates/vm/listVo.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return path + commonPath + voPath + "List" + tableInfo.getEntityName() + "Req" + JAVA_CHAR;
            }
        });
        //添加分页请求对象
        foc.add(new FileOutConfig("/templates/vm/pageVo.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return path + commonPath + voPath + "Page" + tableInfo.getEntityName() + "Req" + JAVA_CHAR;
            }
        });
        // vue页面
        foc.add(new FileOutConfig("/templates/vm/page.vue.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return path + commonPath + pageAndJSPath_vue + tableInfo.getEntityName() + VUE_CHAR;
            }
        });
        // JS
        foc.add(new FileOutConfig("/templates/vm/Table.js.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return path + commonPath + pageAndJSPath_table + tableInfo.getEntityName() + "Table" + JS_CHAR;
            }
        });
        // axios
        foc.add(new FileOutConfig("/templates/vm/axios.js.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return path + commonPath + pageAndJSPath_axios + tableInfo.getEntityName() + "Axios" + JS_CHAR;
            }
        });
        // baseURL
        foc.add(new FileOutConfig("/templates/vm/base.js.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return path + commonPath + pageAndJSPath_base + tableInfo.getEntityName() + "URL" + JS_CHAR;
            }
        });
        ic.setFileOutConfigList(foc);
        
        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
//        		.setTablePrefix("sys_") //表名前缀,
                .setCapitalMode(true)
//                .setLogicDeleteFieldName("rec_status")  //逻辑删除字段
//                .setEntityBuilderModel(true);
//                .setEntityLombokModel(false)
                .setNaming(NamingStrategy.underline_to_camel)
                .setInclude(tables)//修改替换成你需要的表名，多个表名传数组
                .setEntityLombokModel(true);//是否使用lombok
        

        
        mpg.setGlobalConfig(config);
        mpg.setDataSource(dsc);
        mpg.setStrategy(strategyConfig);
        mpg.setCfg(ic);
        mpg.setPackageInfo(pc);

        
        mpg.execute();
    }

}


class GlobalConfigExtend extends GlobalConfig {
	
	
	
	public GlobalConfigExtend(boolean swagger2) {
		super();
		this.swagger2 = swagger2;
	}

	public GlobalConfigExtend() {
		super();
		// TODO Auto-generated constructor stub
	}

	private boolean swagger2;

	public boolean isSwagger2() {
		return swagger2;
	}

	public GlobalConfigExtend setSwagger2(boolean swagger2) {
		this.swagger2 = swagger2;
        return this;
	}
	
	
}




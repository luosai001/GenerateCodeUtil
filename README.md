# GenerateCodeUtil
更加数据库表自动生成Entity,Dao,Service,Controller
## generator.properties
package 配置基础包
package=com.xx.xx


##配置数据源
```
        druid:
            url: jdbc:mysql://localhost:3306/test?allowMultiQueries=true&useUnicode=true
            username: root
            password: 123456
```

## 运行test包
```
	@Test
	public void generateTables()throws IOException {
		List<Map<String, Object>> maps = sysGeneratorService.queryList(new HashMap<>());
		List<String> tableName = maps.stream().map(e -> (String)e.get("tableName")).collect(Collectors.toList());
		byte[] bytes = sysGeneratorService.generatorCode(tableName.toArray(new String[]{}));
		File file = new File("E:/test.zip");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		fileOutputStream.write(bytes);
		fileOutputStream.flush();
		fileOutputStream.close();
	}
  
```
 在E盘下生成test.zip,解压即可看到生成的目录及文件。

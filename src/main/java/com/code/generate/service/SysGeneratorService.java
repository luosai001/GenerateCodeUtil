package com.code.generate.service;

import java.util.List;
import java.util.Map;

/**
 * @author luosai
 * @Description: ()
 * @date 2017-6-23 15:07
 */
public interface SysGeneratorService {

    List<Map<String, Object>> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    Map<String, String> queryTable(String tableName);

    List<Map<String, String>> queryColumns(String tableName);

    byte[] generatorCode(String[] tableNames);

}

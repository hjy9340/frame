package com.sgg.frame.common.constants.dictmap.factory;


import com.sgg.common.exception.BizExceptionEnum;
import com.sgg.common.exception.BussinessException;
import com.sgg.frame.common.constants.dictmap.base.AbstractDictMap;
import com.sgg.frame.common.constants.dictmap.base.SystemDict;

/**
 * 字典的创建工厂
 *
 * @author fengshuonan
 * @date 2017-05-06 15:12
 */
public class DictMapFactory {

    private static final String basePath = "com.sgg.frame.common.constants.dictmap.";

    /**
     * 通过类名创建具体的字典类
     */
    public static AbstractDictMap createDictMap(String className) {
        if("SystemDict".equals(className)){
            return new SystemDict();
        }else{
            try {
                Class<AbstractDictMap> clazz = (Class<AbstractDictMap>) Class.forName(basePath + className);
                return clazz.newInstance();
            } catch (Exception e) {
                throw new BussinessException(BizExceptionEnum.ERROR_CREATE_DICT);
            }
        }
    }
}

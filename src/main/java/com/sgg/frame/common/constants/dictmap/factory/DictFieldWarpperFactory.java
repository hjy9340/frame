package com.sgg.frame.common.constants.dictmap.factory;


import com.sgg.common.exception.BizExceptionEnum;
import com.sgg.common.exception.BussinessException;
import com.sgg.frame.common.constants.factory.ConstantFactory;
import com.sgg.frame.common.constants.factory.IConstantFactory;

import java.lang.reflect.Method;

/**
 * 字段的包装创建工厂
 *
 * @author fengshuonan
 * @date 2017-05-06 15:12
 */
public class DictFieldWarpperFactory {

    public static Object createFieldWarpper(Object field, String methodName) {
        IConstantFactory me = ConstantFactory.me();
        try {
            Method method = IConstantFactory.class.getMethod(methodName, field.getClass());
            Object result = method.invoke(me, field);
            return result;
        } catch (Exception e) {
            try {
                Method method = IConstantFactory.class.getMethod(methodName, Integer.class);
                Object result = method.invoke(me, Integer.parseInt(field.toString()));
                return result;
            } catch (Exception e1) {
                throw new BussinessException(BizExceptionEnum.ERROR_WRAPPER_FIELD);
            }
        }
    }

}

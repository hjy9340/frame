package com.sgg.frame.common.constants.dictmap;


import com.sgg.frame.common.constants.dictmap.base.AbstractDictMap;

/**
 * 日志的字典
 *
 * @author fengshuonan
 * @date 2017-05-06 15:01
 */
public class LogDict extends AbstractDictMap {

    @Override
    public void init() {
        put("tips","备注");
    }

    @Override
    protected void initBeWrapped() {

    }
}

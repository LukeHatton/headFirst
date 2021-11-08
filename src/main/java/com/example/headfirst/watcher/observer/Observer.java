package com.example.headfirst.watcher.observer;

import com.example.headfirst.watcher.bean.WeatherInfo;
import com.example.headfirst.watcher.interFace.Subject;

/**
 * ClassName: Observer
 * <p>Description:观察者接口
 * <p>Author: Zhao Li
 * <p>Date: 11/8/2021 21:55
 */
public interface Observer {

    /**
     * 更新天气信息
     *
     * @param weatherInfo 天气信息数据
     */
    void update(WeatherInfo weatherInfo);

    void setSubject(Subject subject);

    void removeSubject(Subject subject);
}

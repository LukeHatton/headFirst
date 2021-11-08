package com.example.headfirst.watcher.interFace;

import com.example.headfirst.watcher.bean.WeatherInfo;

/**
 * ClassName: WeatherData
 * <p>Description:
 * <p>Author: Zhao Li
 * <p>Date: 11/8/2021 22:24
 */
public class WeatherData extends AbstractSubjectAdapter {

    private WeatherInfo weatherInfo;

    public WeatherInfo getWeatherInfo() {
        return weatherInfo;
    }

    /* 当天气信息改变，此方法会被调用 */
    public void measurementChanged() {
        notifyAllObservers(this.weatherInfo);
    }

    /**
     * 测试方法，用来模拟设置天气数据信息
     *
     * @param measurement 天气数据对象
     */
    public void setMeasurement(WeatherInfo measurement) {
        this.weatherInfo = measurement;
        measurementChanged();
    }
}

package com.example.headfirst.watcher.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: WeatherInfo
 * <p>Description:天气信息数据封装bean
 * <p>Author: Zhao Li
 * <p>Date: 11/8/2021 22:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeatherInfo {

    //温度
    private double temperature;

    //湿度
    private double humidity;

    //压力
    private double pressure;
}

package com.example.headfirst.watcher.observer;

import com.example.headfirst.watcher.bean.WeatherInfo;
import com.example.headfirst.watcher.interFace.Subject;

/**
 * <p>project: headFirst
 * <p>ClassName: CurrentConditionDisplay
 * <p>Description:
 * <p>Date: 11/8/2021 22:46
 *
 * @author : Zhao Li
 */
public class CurrentConditionDisplay implements Observer, Display {

    private WeatherInfo weatherInfo;

    private Subject subject;

    @Override
    public void display() {
        System.out.println(weatherInfo);
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void removeSubject(Subject subject) {
        this.subject = null;
    }

    @Override
    public void update(WeatherInfo weatherInfo) {
        this.weatherInfo = weatherInfo;
    }

}

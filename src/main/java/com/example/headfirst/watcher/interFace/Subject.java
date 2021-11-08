package com.example.headfirst.watcher.interFace;

import com.example.headfirst.watcher.bean.WeatherInfo;
import com.example.headfirst.watcher.observer.Observer;

/**
 * ClassName: Subject
 * <p>Description:主题接口
 * <p>Author: Zhao Li
 * <p>Date: 11/8/2021 21:54
 */
public interface Subject {

    void add(Observer observer);

    boolean remove(Observer observer);

    void notifyOne(Observer observer, WeatherInfo weatherInfo);

    void notifyAllObservers(WeatherInfo weatherInfo);
}

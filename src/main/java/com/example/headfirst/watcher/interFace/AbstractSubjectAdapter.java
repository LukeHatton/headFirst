package com.example.headfirst.watcher.interFace;

import com.example.headfirst.watcher.bean.WeatherInfo;
import com.example.headfirst.watcher.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: AbstractSubject
 * <p>Description:主题接口抽象实现
 * <p>@author : Zhao Li
 * <p>Date: 11/8/2021 21:57
 */
public abstract class AbstractSubjectAdapter implements Subject {

    protected List<Observer> observerList = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        if (observer != null && !observerList.contains(observer)) {
            observerList.add(observer);
            observer.setSubject(this);
        }
    }

    @Override
    public boolean remove(Observer observer) {
        if (observer != null && observerList.contains(observer)) {
            observer.removeSubject(this);
            return observerList.remove(observer);
        } else {
            return false;
        }
    }

    @Override
    public void notifyOne(Observer observer, WeatherInfo weatherInfo) {
        observer.update(weatherInfo);
    }

    @Override
    public void notifyAllObservers(WeatherInfo weatherInfo) {
        observerList.forEach(e -> e.update(weatherInfo));
    }
}

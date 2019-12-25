package com.atguigu.gmall0513.mock.util;

/**
 * author : wuyan
 * create : 2019-12-24 19:57
 * desc :
 */
public class RanOpt<T>{
    T value ;
    int weight;

    public RanOpt ( T value, int weight ){
        this.value=value ;
        this.weight=weight;
    }

    public T getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }
}


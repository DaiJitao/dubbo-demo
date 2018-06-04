package com.alibaba.dubbo.demo;

/**
 * Created by daijitao on 2018/6/1.
 */
import java.util.List;

public interface DemoService {
    List<String> getPermissions(Long id);
}
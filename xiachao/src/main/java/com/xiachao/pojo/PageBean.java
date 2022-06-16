package com.xiachao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean<T> {
    private List<T> beanList;//当前页显示的数据，数据查询
    private int pageSize;//页大小,业务规则
    private int pageIndex;//当前页索引，用户请求
    private int totalRecord;//数据总条数，数据查询
    private int totalPage;//总页数,根据totalRecord和pageSize计算
    private int pageBegin;//显示的开始页码
    private int pageEnd;//显示的结束页码
    private String url; //在哪赋值：Servlet
}

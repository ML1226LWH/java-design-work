package swu.ml.design.service;


import swu.ml.design.page.PageResult;

public interface DestinationService {

    PageResult listPage(Integer startPage, Integer pageSize);
}

package swu.ml.design.page;


import swu.ml.design.domain.Destination;

import java.util.List;

public class PageResult {

    private Integer currentPage; // 当前页

    private Integer pageSize;   // 每页数据大小

    private Integer total;      // 总记录数

    private Integer totalPages; // 总页数

    private List<Destination> destinationList;  // 每页显示的数据

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotalPages() {
        return total % pageSize == 0 ? total / pageSize : total / pageSize + 1;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public List<Destination> getDestinationList() {
        return destinationList;
    }

    public void setDestinationList(List<Destination> destinationList) {
        this.destinationList = destinationList;
    }

    @Override
    public String toString() {
        return "{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", totalPages=" + totalPages +
                ", destinationList=" + destinationList +
                '}';
    }
}

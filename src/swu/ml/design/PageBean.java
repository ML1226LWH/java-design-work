package swu.ml.design;

import java.util.List;
//想实现分页
public class PageBean<T> {
    private int currentPage;//当前页
    private int totalPages;//总页数
    private int pageSize;//每页记录数
    private int total;//总记录数
    private List<Destination> destinationList;

    public int getCurrentPage() {
        return currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotal() {
        return total;
    }

    public List<Destination> getDestinationList() {
        return destinationList;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void setDestinationList(List<Destination> destinationList) {
        this.destinationList = destinationList;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}

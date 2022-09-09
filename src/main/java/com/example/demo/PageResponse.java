package com.example.demo;

import com.example.demo.SnippetResponse;

import java.util.List;

public class PageResponse
{
    public int pageNumber;
    public int pagesCount;
    public int pageSize;
    public int totalCount;
    public List<SnippetResponse> batches;

    public int getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPagesCount() {
        return this.pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<SnippetResponse> getBatches() {
        return this.batches;
    }

    public void setBatches(List<SnippetResponse> batches) {
        this.batches = batches;
    }
}

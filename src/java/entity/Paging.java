/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ngdugn
 */
public class Paging {
    private int nrpp;
    private int index;
    private int total;
    private int totalPage;
    private int begin;
    private int end;

    public Paging() {
    }

    public Paging(int nrpp, int index, int total) {
        this.nrpp = nrpp;
        this.index = index;
        this.total = total;
    }

    public int getNrpp() {
        return nrpp;
    }

    public void setNrpp(int nrpp) {
        this.nrpp = nrpp;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public void calc(){
//      totalPage = total/nrpp + (total%nrpp==0?0:1);
        totalPage = (total + nrpp -1)/nrpp;
        index = index<0?0:index;
        index = index >= totalPage?(totalPage-1) : index;
        begin = index*nrpp; //[begin, end]
        end = begin + nrpp;
        end = end>=total?total:end;
    }    
    
}

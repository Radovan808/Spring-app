package cz.rado.springapp.service.impl;




public class PrintService {
    private String data;

    public void print(){
        System.out.println(data);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

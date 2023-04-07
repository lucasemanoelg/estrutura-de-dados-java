package org.no.java;

public class No<T> {

    private T condeudo;
    private No proximoNo;

    public No() {
        this.proximoNo = null;
    }

    public No(T condeudo) {
        this.proximoNo = null;
        this.condeudo = condeudo;
    }

    public No(T condeudo, No proximoNo) {
        this.condeudo = condeudo;
        this.proximoNo = proximoNo;
    }

    public T getCondeudo() {
        return condeudo;
    }

    public void setCondeudo(T condeudo) {
        this.condeudo = condeudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "condeudo=" + condeudo +
                '}';
    }

    public String toStringEncadeado(){
        String str = "No{" +
                "condeudo=" + condeudo +
                '}';

        if(proximoNo != null){
            str += "->" + proximoNo.toString();
        } else {
            str += "-> null";
        }
        return str;
    }
}

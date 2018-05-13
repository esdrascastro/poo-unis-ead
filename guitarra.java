/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esdra
 */
package unidade_1;

public class guitarra {
    
    private String numeroSerie, fabricante, modelo, tipo, madeira;
    private double preco;
    
    public guitarra(
        String numeroSerie, String fabricante,
        String modelo, String tipo,
        String madeira, double preco){
      this.numeroSerie = numeroSerie;
      this.fabricante = fabricante;
      this.modelo = modelo;
      this.madeira = madeira;
      this.preco = preco;         
}
    public String getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie){
        this.numeroSerie = numeroSerie;
    }
    public String getFabricante(){
        return fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getMadeira(){
        return madeira;
    }
    public void setMadeira(String madeira){
        this.madeira = madeira;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        return preco;
    }
 public static void main(String[] args){
     
     guitarra minhaguitarra = new guitarra("01020304", "fender", "telecaster","eletrica", "mogno", 1500);
     
     System.out.println(minhaguitarra.getNumeroSerie());
     System.out.println(minhaguitarra.getMadeira());
     System.out.println(minhaguitarra.getPreco());
     System.out.println(minhaguitarra.getTipo());
 }    
    
}

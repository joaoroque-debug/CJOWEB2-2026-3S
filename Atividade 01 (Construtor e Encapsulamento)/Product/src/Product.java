public class Product {
  
    private int code;
    private String name;
    private double price;
    
    public Product(int code, String name){ //valores obrigatórios 
        this.code = code;
        this.name = name;
    }

    public void setName(String name){  // Recebe um novo nome e coloca no atributo
        this.name = name;
    }

    public String getName(){ //Devolve o nome que está armazenado.
        return name;
    }

    public void setCode(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }


    @Override 
    public String toString(){
        return  "Código do produto: " + code +
                "\nNome : " + name +
                "\nPreço: R$ " + price;
        }











}

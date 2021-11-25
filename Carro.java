public class Carro implements Motor, Veiculo {

    @Override
    public String getModelo(){
        return "Filder";
    }
    @Override
    public String getFabricante(){
        return "Golf";
    }
    @Override
    public String getNome(){
        return "Sprinter";
    }
    @Override
    public int getId(){
        return 1;
    }

}

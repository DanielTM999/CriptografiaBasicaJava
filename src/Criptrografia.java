public class Criptrografia implements IntrCripto{
    private String cript;
    private String Descript;


    public String getDescript() {
        return Descript;
    }

    private void setDescript(String descript) {
        Descript = descript;
    }

    public String getCript() {
        return cript;
    }

    private void setCript(String cript) {
        this.cript = cript;
    }

    @Override
    public void criptografar(String senha) {
        String caracter = senha;
        String newCript = "";
        int[] CaracterList = new int[caracter.length()];

        for (int i = 0; i < caracter.length(); i++) {
            char letra = caracter.charAt(i);
            CaracterList[i] = ((int)letra);
        }

        CaracterList = converter(CaracterList);

        for (int i = 0; i < CaracterList.length; i++) {
            newCript += (char)CaracterList[i];
        }

        setCript(newCript);

    }

    @Override
    public void Descriptrografar(String caracter) {

        int[] CaracterList = new int[caracter.length()];

        for (int i = 0; i < CaracterList.length; i++) {
            char letra = caracter.charAt(i);
            CaracterList[i] = (int)letra;
        }

        setDescript(desconverter(CaracterList));
    }

    private int[] converter(int[] caractere) {
        for (int i = 0; i < caractere.length; i++) {
            if(caractere[i] % 2 == 0){
                caractere[i] = ((caractere[i] * 100)/2);
            }else{
                caractere[i] += 2;
            }
        }

        return caractere;
    }

    private String desconverter(int[] senha){
        String cript = "";
        for (int i = 0; i < senha.length; i++) {
            if (senha[i] % 2 == 0) {
                senha[i] = ((senha[i] / 100) * 2);
            } else {
                senha[i] -= 2;
            }
        }

        for (int i = 0; i < senha.length; i++) {
            cript += (char)senha[i];
        }

        return cript;
    }
}

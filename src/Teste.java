public class Teste {
    public int foo(String x) throws NumberFormatException {     //M�todo que az uma convers�o de um String para int
        return(Integer.parseInt(x));             //A assinatura do m�todo diz que pode lan�ar uma NumberFormatException
    }                                                       //Mas o m�todo n�o trata, ao inv�s disso lan�a a exce��o com throws
    public void bar() throws NumberFormatException {
        try {
            int a = this.foo("x");                                  //Chama o m�todo foo() que declara lan�ar uma exce��o.
            System.out.println("String convertida em int �: " + a); //Este m�todo deve ou capturar ou relan�ar a exce��o que recebeu.
        } catch(NumberFormatException e){              //Este catch captura a exce��o.
            throw new NumberFormatException();        //Mas aqui dentro ele resolve relan�ar ela. 
//Usa throw, e new para criar o objeto. E, na assinatura deve haver um throws.
        }
    }
    public static void main(String args[]){
        try {                                                       //Esse aqui chama bar() que lan�a a exce��o que pegou de foo.
            Teste teste = new Teste();                   //Este deve ou capturar ou relan�ar.
            teste.bar();    
        } catch(NumberFormatException e){         //Ele resolve capturar e fazer o tratamento necess�rio.
            System.out.println("Capturei a exce��o lan�ada no m�todo foo()"); //Final, encerrou a pilha de propaga��o da exception.
            e.printStackTrace();
        }
    }
}
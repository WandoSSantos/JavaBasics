public class TesteCondicionais {

    public static void main (String[] args){
        
        int idade = 17;
        int quantidadePessoas = 3;
        if(idade>= 18 ){
            System.out.println("Você é considerado plenamente capaz diante da lei");
        } else{
            if(quantidadePessoas >=2) {
                System.out.println("Você não é plenamente capaz mas esta acompanhado de responsável");
            } else
             System.out.println("Você não é considerado plenamente capaz diante da lei");
        }
    }
    
}

public class TestaLacos2 {
    
    public static void main (String[] args){

        for (int i = 1; i < 100; i++ ){
            if (i % 3 == 0)    {
                System.out.println(i);
            }
        }
        int fatorial =1;
        for(int n =1; n <= 10; n++){
            fatorial *=n;
            System.out.println("Fatorial de " + n + " = " + fatorial);

        }

    } 
}

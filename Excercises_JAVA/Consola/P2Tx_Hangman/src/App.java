//p1: lineas de comentarios de author, date y description
//AUTHOR: luis fdo Castellanos G
//DATE: 2020-Nov-10
//DESCRIPTION: Design the hangman's game with 10 different words (saved in a vector) 
//             of at least 4 characters, the software must randomly select one of them 
//             and generate on screen a menu where stripes are displayed for each position of the letters

//p2: importar las librerias requeridas
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard= new Scanner(System.in);
        f_intruduction();
        String v_opt_user=f_option_user();
        String[] v_vector_words= f_fill_vector(v_opt_user);

        char v_letter_user;
        int v_random= (int) (Math.random()*9);
        String v_word_guess= v_vector_words[v_random];          //v_word_guess es la palabra que el usuario debe adivinar
        int v_failed_attempts=0;                                //contar los intentos fallidos   
        int v_total_vacios=0;                                   //contar los espacios vacios restantes en la palabra
        char [] v_vector_word_guess = new char [v_word_guess.length()]; //vector para los espacios vacios ( _ )

        
        //temporal
        //for(int i=0; i<10; i++){System.out.println("["+i+"]= "+v_vector_words[i]);}
        //System.out.println("\nWORD TO GUESS: ["+v_random+"]= "+v_word_guess);
        //temporal

        //draw underscore 
        System.out.println("The word to guess is:\n");
        for(int i=0;i<v_word_guess.length();i++){
            System.out.print(" _ ");
            v_vector_word_guess[i]='_';
        }
        //to make the game
        do{
            //a: pedir letra
            System.out.println("\nInput a letter:");
            v_letter_user=keyboard.next().charAt(0);  //solo tomara la primera letra que ingrese
            if(v_word_guess.indexOf(v_letter_user)>-1){ //si encuentra una letra dentro de la palabra
                v_vector_word_guess=f_find_letter_to_word(v_letter_user, v_word_guess, v_vector_word_guess);
            }else{    //sino encuentra la letra dentro de la palabra
                v_failed_attempts+=1;
                System.out.println("Err: This letter don't exist into the word (failed attemps "+v_failed_attempts+"/4)");
            }
            for(int i=0;i<v_word_guess.length();i++){
                System.out.print(" "+v_vector_word_guess[i]+" ");
            }
            v_total_vacios=0;
            for(int i=0;i<v_word_guess.length();i++){
                if(Character.compare(v_vector_word_guess[i], '_')==0){  //si hay un '_' dentro del vector
                    v_total_vacios+=1;     //cuente los espacio vacios
                }
            }    
           
        }while(v_failed_attempts<4 && v_total_vacios>0);
        if(v_total_vacios==0){
            System.out.println("\n!you are the best in the word¡");
        }else{
            System.out.println("\n!sorry, you lost¡, the word was: "+v_word_guess);
        }
    }
    //p3: crear el metodo de f_introduction()  <-- nos muestra información inicial del soft
    public static void f_intruduction(){
        //description: show inicial menu/information of programm
        System.out.println("---------------------------------------------------");
        System.out.println("---------------SoftHangMan-------------------------");
        System.out.println("----------Version 1.0 2020-Nov-9-------------------");
        System.out.println("---------Make by Luis Fdo Castellanos--------------");
        System.out.println("---------------------------------------------------");
    }
    
    public static String f_option_user(){
        //description: this method return a char (Y/N)
        Scanner keyboard= new Scanner(System.in);
        System.out.println("do you want to enter the words (Y/N)?");
        String v_option= keyboard.nextLine();
        while(!v_option.equalsIgnoreCase("N") && !v_option.equalsIgnoreCase("Y") ){
            System.out.println("Err: your option don't exist, do you want to enter the words (Y/N)?");
            v_option= keyboard.nextLine();
        }
        return v_option;
    }

    public static String f_word_user(int i){
        //description: this method returns a word with a least 4 letters
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Input the ["+i+"] word:");
        String v_word= keyboard.nextLine();
        while (v_word.length()<4){
            System.out.println("Err: The word should be have leats 4 letters, Input again the ["+i+"] word:");
            v_word= keyboard.nextLine();
        }
        return v_word;
    }

    public static String[] f_fill_vector(String v_opt_user){
        //description: this method returns a string vector with 10 words.
        
        String[] v_vector_words= new String[10];
        Scanner keyboard= new Scanner(System.in);

        if(v_opt_user.equalsIgnoreCase("Y")){ //input 10 words by keyboard 
            for(int i=0;i<10;i++){
                v_vector_words[i]= f_word_user(i);
            }
        }else{  // database  
           v_vector_words[0]="casa";
           v_vector_words[1]="mascota";
           v_vector_words[2]="universidad";
           v_vector_words[3]="colombia";
           v_vector_words[4]="telefono";
           v_vector_words[5]="windows";
           v_vector_words[6]="libreria";
           v_vector_words[7]="computador";
           v_vector_words[8]="java";
           v_vector_words[9]="programacion";
        }
        return v_vector_words;
    }

    public static char[] f_find_letter_to_word(char v_letter, String v_word, char[] v_vector_word_guess ){
        //description: this method return a word that find a letter
        int pos_letter=v_word.indexOf(v_letter);     //busca desde la posición 0
        while(pos_letter<=v_word.length()-1 && pos_letter>-1) {
            v_vector_word_guess[pos_letter]=v_letter;
            pos_letter=v_word.indexOf(v_letter, pos_letter+1);
        }
        return v_vector_word_guess;
        
    }
}

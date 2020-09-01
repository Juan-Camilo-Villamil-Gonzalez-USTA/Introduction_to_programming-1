package usta.sistemas;

public class Main {
    // AUTHOR: lUIS FERNANDO CASTELLANOS
    // DATE:  2020-MAY-14
    // DESCRIPTION:this program creates a 4x5 matrix with the people names and replace all the
    // vowels with = a = @, e = 3, i = 1, o = Ø (alt + 157), u = ⌂ (alt +127) and convert all words to uppercase.
    public static void main(String[] args) {
        f_menu();
        String[][] matrix_names = {{"maria" , "pedro", "JOSE", "camilo", "rodrigo"},
                                   {"Ana", "lucia", "martha", "juliana", "patricia"},
                                   {"Felipe", "ALEXANDER", "soffy", "Carmen", "Augusto"},
                                   {"Alfredo", "Luis", "Ramiro", "Karen", "ANDREA"}};
         matrix_names=f_replace_vowels(matrix_names);
        System.out.println("-------------show matrix-----------");
        for (int i=0; i<matrix_names.length;i++){  //recorrer las filas
            System.out.print("\n ("+(i+1)+")=");
            for(int j=0; j<matrix_names[0].length;j++){
                System.out.print(" | "+matrix_names[i][j]+" ");
            }
        }

    }
    public static void f_menu(){
        //description: this method display the menu
        System.out.println("╔════════════════════════════╗");
        System.out.println("║       SoftConvertWords     ║");
        System.out.println("║ Maker:LuisFdo Castellanosg ║");
        System.out.println("║ Date: 2020-may-14          ║");
        System.out.println("╚════════════════════════════╝");
        System.out.println("this program creates a 4x5 matrix with the people names");
    }

    public  static String[][] f_replace_vowels(String[][] matrix_names){
        //Description: This method replace a vowels with = a = @, E = 3, I = 1, O = Ø (alt + 157), U = ⌂ (alt +127)
        for(int i=0;i<matrix_names.length;i++){  //recorrer las filas
            for(int j=0;j<5;j++){  //recorremos las columnas
                matrix_names[i][j]=matrix_names[i][j].toUpperCase().replace('A','@').
                                    replace('E','3').replace('I','1').
                                    replace('O','Ø').replace('U','⌂');
            }
        }
        return matrix_names;
    }
}

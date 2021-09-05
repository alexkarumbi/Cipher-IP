public class CaesarCipherDecrypt {
    public static String CaesarCipherDecryption(String s,int shiftKey){
        final String ALPHABETS ="abcdefghijklmnopqrstuvwxyz";
        s =s.toLowerCase();

        StringBuilder cypherText =new StringBuilder();

        for (int counter =0;counter<s.length();counter++){
            if (!Character.isLetter(s.charAt(counter))){
                cypherText.append(s.charAt(counter));
            }
        }



    }
}

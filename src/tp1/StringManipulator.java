package tp1;

public class StringManipulator {

    private String s;

    public StringManipulator(String s) {
        this.s = s;
    }

   package Compte_Rendu_TP1;

public class StringManipulator {

    private String s;

    public StringManipulator(String s) {
        this.s = s;
    }


    public void majus(){
        String r="";
        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);
            if(ascii>90){
                ascii=ascii-32;
                char low=(char)ascii;
                r=r+low;}
            else r=r+(char)ascii;

        }
        System.out.println("uppercase : "+r);

    }

    public void min(){
        String r="";
        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);
            if(ascii<=90){
                ascii=ascii+32;
                char low=(char)ascii;
                r=r+low;}
            else r=r+(char)ascii;

        }

        System.out.println("lowercase : "+r);

    }
    public void reverse(){
        String reverse="";
        for(int i = s.length() - 1; i >= 0; i--)
        {
            reverse = reverse + s.charAt(i);
        }
        System.out.println("reverse : "+reverse);
    }

    public void isPalindrome(){
        boolean palin=true;
        for(int i=0,j=s.length()-1;i<=j;i++,j--)
        {
            if (s.charAt(i)!=s.charAt(j))
            {
                palin=false;
                break;
            }
        }
        System.out.println("isPalindrome : "+palin);
    }


    public void getVowelNumber(){
        String Vowel="AEIOUY";
        int v=0;
        for (int i=0;i<s.length();i++)
        {
            for (int j=0;j< Vowel.length();j++)
            {

                if (Character.toUpperCase(s.charAt(i))==Vowel.charAt(j))
                {
                    v++;
                    break;
                }
            }
        }
        System.out.println("vowelNumber : "+v);
    }

    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator("lAnD");
        stringManipulator.reverse();
        stringManipulator.isPalindrome();
        stringManipulator.majus();
        stringManipulator.min();
        stringManipulator.getVowelNumber();
    }
}

package ua.univer.lesson05;

public class Program {
    public static void main(String[] args) {
        String str = "mama mila ramu ramu mila mama mila mama mama mila ramu ramu mila mama mila mama";
        String word ="mama";
        int firstIndex = str.indexOf(word);
        System.out.println(firstIndex);
        int lastIndex = str.lastIndexOf(word);
        int index = firstIndex;
        while(index< lastIndex){
            index = str.indexOf(word, index+1);
            System.out.println(index);

        }
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + " : " +str.charAt(i));
        }

        System.out.println("Mama".toLowerCase());
        System.out.println("Mama".toUpperCase());
        char [] chars = "mama".toCharArray();
        chars[0] ='t';
        chars[2] = 't';
        String strt = new String(chars);
        System.out.println(strt);

        String str_tata = "mama".replace('m', 't');
        System.out.println(str_tata);
        System.out.println(str.replace("mama", "tato"));
        String d_str = "12,345";
     //   System.out.println(Double.parseDouble(d_str));
        System.out.println(Double.parseDouble(d_str.replace(',','.')));
    }
}

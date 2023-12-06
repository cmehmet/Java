import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        System.out.println(message);

        /*System.out.println("Eleman sayısı : " + message.length());
        System.out.println("5. eleman : " + message.charAt(4));
        System.out.println(message.concat(" Yaşasın!"));
        System.out.println(message.startsWith("Bu"));
        System.out.println(message.startsWith("A"));
        System.out.println(message.endsWith("."));

        char[] characters = new char[5];
        message.getChars(0,5, characters,0);
        System.out.println(characters);

        System.out.println(message.indexOf('o'));
        System.out.println(message.indexOf("ok"));
        System.out.println(message.lastIndexOf('ü'));
        System.out.println(message.lastIndexOf("gü"));*/

        String newMessage;
        //System.out.println(message.replace(' ','-'));
        newMessage = message.replace(' ','-');
        System.out.println(newMessage);

        String subMessage = message.substring(4);
        String subMessage2 = message.substring(0,4);
        System.out.println(subMessage + "\n" + subMessage2);

        System.out.println("----------------------------");

        String[] words = new String[10];
        words = message.split(" ");
        for (String word : words){
            System.out.println(word);
        }
        System.out.println(words[2]);

        System.out.println("---------------------------");

        for (String word : message.split(" ")){
            System.out.println(word);
        }

        System.out.println("---------------------------");

        System.out.println(message.toLowerCase());
        System.out.println((message.toUpperCase()));

        System.out.println("---------------------------");

        String message2 = "    Merhaba Herkese     ";
        System.out.println(message2.trim());



    }
}
import java.util.*;
import java.lang.*;
public class vigenerecipher {
    public void cipherEncypt(String message, String mappedKey)
    {
        int[][] table = creatVignereTable();
        String encryptedText = "";
        for(int i = 0; i< message.length(); i++){
            if(message.charAt(i)== (char)32 && mappedKey.charAt(i) == (char)32){
                encryptedText += " ";

            }
            else {
                encryptedText += (char)table[(int)message.charAt(i)-65][(int)mappedKey.charAt(i)-65];
            }
        }
        System.out.println("Encrypted Text : " + encryptedText);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message to be encrypted ");
        String msg = sc.nextLine();
        msg = msg.toUpperCase();
        System.out.println("Enter the key");
        String key = sc.next();
        key = key.toUpperCase();
        String keymap = ""; String message, mappedkey;
        for(int i = 0, j = 0; i< msg.length(); i++)
        {
if (msg.charAt(i) == (char)32){
//ignore space
keymap += (char)32;}
else{
    //mapping letters of key with message
    if(j<key.length())
    {
        keymap += key.charAt(j);
        j++;

    }
    else{
        //restarting key from start
        j = 0;
        keymap += key.charAt(j);
        j++;// without incrementation key's first letter will be mapped twice
    }
}

        }
        message = msg;
        mappedkey = keymap;
        vigenerecipher vc = new vigenerecipher();
     vc.cipherEncypt(message, mappedkey);
    }
    
    private static int[][] creatVignereTable() {
        //creating 26 x 26 alphabet table
        int[][] tableArr = new int[26][26];
        for(int i = 0; i<26; i++){
            for(int j = 0; j<26; j++){
                int temp;
                if((i+65)+j>90){
                    temp = ((i+65)+j) - 26;
                    tableArr[i][j] = temp;

                }
                else{
                    temp = (i+65)+j;
                    tableArr[i][j] = temp;

                }
            }
        }
        return tableArr;
    }
}

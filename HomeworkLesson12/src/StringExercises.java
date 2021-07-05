public class StringExercises {
    public static void main(String[] args) {
        String message = "Write characters";
        int messageLength = message.length();

        char[] characters= new char[messageLength];
        message.getChars(0,messageLength,characters,0);


        for (int i=0;i<characters.length;i++){
            System.out.println(characters[i]);
        }
    }
}

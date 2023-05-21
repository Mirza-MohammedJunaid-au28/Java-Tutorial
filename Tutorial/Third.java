public class Third {
    public  static  void main(String[] args){
        /*
        length(): Returns the length (number of characters) of the string.
        charAt(int index): Returns the character at the specified index.
        substring(int beginIndex), substring(int beginIndex, int endIndex): Returns a substring of the original string.
        toUpperCase(), toLowerCase(): Converts the string to uppercase or lowercase.
        concat(String str): Concatenates the specified string to the end of the original string.
        equals(Object obj), equalsIgnoreCase(String anotherString): Compares the string with another string for equality, with or without case sensitivity.
        startsWith(String prefix), endsWith(String suffix): Checks if the string starts or ends with the specified prefix or suffix.
        trim() method in Java removes leading and trailing white spaces from a string.
        */
        String name = "    Junaid     ";
        name = name.trim();
        System.out.printf("trim : %s \n",name);
        System.out.printf("charAt : %s \n",name.charAt(4));
        System.out.printf("indexOf : %s \n",name.indexOf('J'));
        System.out.printf("substring : %s \n",name.substring(3));
        System.out.printf("toUpperCase : %s \n",name.toUpperCase());
        System.out.printf("toLowerCase : %s \n",name.toLowerCase());
        System.out.printf("concat : %s \n",name.concat("Mirza"));
        System.out.printf("equals : %s \n",name.equals("Junaid"));
        System.out.printf("trim : %s \n",name.replace("n","m"));
        System.out.printf("startsWith : %s \n",name.startsWith("J"));
        System.out.printf("endsWith : %s \n",name.endsWith("d"));

    }
}

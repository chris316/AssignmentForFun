package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2)
    {
        return string2+string1;
    }

    public char getChar(String string, int index)
    {
        return string.charAt(index);
    }

    public String iCantSee(String string)
    {
        String blankString="";
        for(int i=0;i<string.length();i++)
        {
            blankString+=" ";
        }
        return blankString;
    }

    public String loudAndClear(String string)
    {
        return string.toUpperCase();
    }

    public String reverseCase(String string)
    {
        char[] chars=string.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            if(Character.isUpperCase(chars[i]))
            {
                chars[i]=Character.toLowerCase(chars[i]);
            }
            else if(Character.isLowerCase(chars[i]))
            {
                chars[i]=Character.toUpperCase(chars[i]);
            }
        }

        return new String(chars);
    }

    public String oneAtATime(String string1, String string2)
    {
        char[] chars1=string1.toCharArray();
        char[] chars2=string2.toCharArray();
        char[] finalChars=new char[chars1.length+chars2.length];
        int aPos=0, bPos=0, strPos=0;
        while(aPos!=chars1.length||bPos!=chars2.length)
        {
            if(aPos<chars1.length)
            {
                finalChars[strPos]=chars1[aPos];
                aPos++;
                strPos++;
            }
            if(bPos<chars2.length)
            {
                finalChars[strPos]=chars2[bPos];
                bPos++;
                strPos++;
            }
        }
        return new String(finalChars);
    }
}

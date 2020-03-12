package Collections;

import java.util.ArrayList;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        int sum=0;
        for(int i=0;i<list1.size();i++)
        {
            sum+=list1.get(i);
        }
        for(int i=0;i<list2.size();i++)
        {
            sum+=list2.get(i);
        }

        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove)
    {
        for(int i=0;i<original.size();i++)
        {
            if(original.get(i)==toRemove)
            {
                original.remove(i);
            }
        }
        return original;
    }

    public boolean happyList(ArrayList<String> original)
    {
        if(original.size()==1)
        {
            return true;
        }
        else
        {
        boolean isHappy=true;
        int sharedChars=0;
        while(isHappy)
        {
            for(int i=0;i<original.size();i++)
            {
                if(i==0)
                {
                    String word=original.get(i);
                    String nextNeighbor=original.get(i+1);
                    for(int j=0;j<word.length();j++)
                    {
                        if(nextNeighbor.indexOf(word.charAt(j))!=-1);
                        {
                            sharedChars++;
                        }
                    }
                    if(sharedChars<1)
                    {
                        return false;
                    }
                    sharedChars=0;
                }
                else if(i==original.size()-1)
                {
                    String word=original.get(i);
                    String prevNeighbor=original.get(i-1);
                    for(int j=0;j<word.length();j++)
                    {
                        if(prevNeighbor.indexOf(word.charAt(j))!=-1)
                        {
                            sharedChars++;
                        }
                    }
                    if(sharedChars<1)
                    {
                        return false;
                    }
                    sharedChars=0;
                }
                else
                {
                    String word=original.get(i);
                    String nextNeighbor=original.get(i+1);
                    String prevNeighbor=original.get(i-1);
                    for(int j=0;j<word.length();j++)
                    {
                        if(nextNeighbor.indexOf(word.charAt(j))!=-1)
                        {
                            sharedChars++;
                        }
                    }
                    if(sharedChars<1)
                    {
                        return false;
                    }
                    else
                    {
                        sharedChars=0;
                        for(int j=0;j<word.length();j++)
                        {
                            if(prevNeighbor.indexOf(word.charAt(j))!=-1)
                            {
                                sharedChars++;
                            }
                        }
                        if(sharedChars<1)
                        {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    }
}

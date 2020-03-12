package Collections;

import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;

public class MapPractice {

    public Object findValueOf(Map map, Object key)
    {
       return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value)
    {
        ArrayList<Object> objects=new ArrayList<Object>();
        for (Object entry:map.keySet())
        {
            if(map.get(entry).equals(value))
            {
                objects.add(entry);
            }
        }
        Object[] obj=objects.toArray();
        return obj;
    }

    public Map<Integer, Integer> fibonacciTree(int size)
    {
        Map<Integer,Integer> fibTree=new TreeMap<Integer,Integer>();
        int prev1=0;
        int prev2=1;
        int current=0;
        for(int i=1;i<=size;i++)
        {
            if(i==1)
            {
                fibTree.put(i,1);
            }
            else {
                current = prev1 + prev2;
                fibTree.put(i, current);
                prev1 = prev2;
                prev2 = current;
            }
        }
        return fibTree;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size)
    {
        Map<Integer, Integer> spiralTree=new TreeMap<Integer,Integer>();
        int prev1=first;
        int prev2=second;
        int current=0;
        for(int i=1;i<=size;i++)
        {
            if(i==1)
            {
                spiralTree.put(i,prev1);
            }
            else if(i==2)
            {
                spiralTree.put(i,prev2);
            }
            else
            {
                current=prev1+prev2;
                spiralTree.put(i,current);
                prev1=prev2;
                prev2=current;
            }
        }
        return spiralTree;
    }
}

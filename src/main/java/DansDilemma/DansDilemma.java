package DansDilemma;
import java.util.Set;
import java.util.HashSet;

public class DansDilemma {


    public Integer dilemmaOfTwo(Double input1, Double input2)
    {
        return dilemmaOfN(input1,input2);
    }

    private Set<Double> twoInputSetMaker(Double input1,Double input2)
    {
        Set<Double> uniqueNums=new HashSet<Double>();
        uniqueNums.add(input1+input2);
        uniqueNums.add(input1-input2);
        uniqueNums.add(input1*input2);
        if(input2!=0)
        {
            uniqueNums.add(input1 / input2);
        }
        uniqueNums.add(input2+input1);
        uniqueNums.add(input2-input1);
        uniqueNums.add(input2*input1);
        if(input1!=0)
        {
            uniqueNums.add(input2 / input1);
        }

        return uniqueNums;
    }

    private Set<Double> mergeSets(Set<Double>input1,Set<Double>input2)
    {
        Set<Double>mergedSet=input1;
        for (Double num:input2)
        {
          mergedSet.add(num);
        }

        return mergedSet;
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3)
    {
        return dilemmaOfN(input1,input2,input3);
    }

    public Integer dilemmaOfN(Double... args)
    {
        Set<Double> numbers=new HashSet<Double>();
        for(int i=1;i<args.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                    Set<Double> temp=twoInputSetMaker(args[i],args[j]);
                    numbers=mergeSets(numbers,temp);
            }
        }
        return numbers.size();
    }


}



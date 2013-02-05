package flames;

public class sample
{
    public String compute(String str1,String str2)
    {
       int i=0,j=0,cnt=0;
        String ret=null;
        while(i!=str1.length())
        {
            j=0;
            while(j!=str2.length())
            {
                if((str1.charAt(i)==str2.charAt(j))&&(str1.charAt(i)!='*'))
                {
                    char old1=(char)str1.charAt(i);
                    char new1=(char)'*';
                    str1=str1.replace(old1,new1);
                    str2=str2.replace(old1,new1);
                }
                j++;
            }
            i++;
        }
        i=0;
        while(i!=str1.length())
        {
            if(str1.charAt(i)!='*')
                cnt++;
            i++;
        }
        j=0;
        while(j!=str2.length())
        {
            if(str2.charAt(j)!='*')
                cnt++;            
            j++;
        }       
        //System.out.println("Unmatched Characters are:"+cnt);
        String flames="flames";
        j=0;
        int k=0,cnt1=0;
        int flength=flames.length();
        while(k<5)
        {
            while(cnt1<cnt)
            {
                if(flames.charAt(j%flength)!='*')
                {
                    j=(j+1)%(flength);
                    cnt1++;
                }
                else
                    j=(j+1)%(flength);
            }
            int index=(j-1)%flength;
            if(index==-1) index=flength-1;
            flames=flames.replace(flames.charAt(index),'*');
            k++;
            cnt1=0;
        }
        //System.out.println(flames);
        char result=' ';
        for(i=0;i<6;i++)
        {
          if(flames.charAt(i)!='*')
          {
             result=flames.charAt(i);
             break;
          }
        }
        switch(result)
        {
            case 'f':ret="FRIENDSHIP";
                     break;
            case 'l':ret="LOVE";
                     break;
            case 'a':ret="ATTRACTION";
                     break;
            case 'm':ret="MARRIAGE";
                     break;
            case 'e':ret="ENIMIES";
                     break;
            case 's':ret="SISTERS";
                     break;
            case ' ':ret="NOT MATCHED";
                     break;
        }
        return ret;
    }
}
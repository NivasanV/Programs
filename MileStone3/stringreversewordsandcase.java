class Main{
    public static String reverseWordsAndCase(String input1,int input2){
        String output1="";
	String[] words=input1.split("\\s");
String[] words1=new String[words.length];
int i;

boolean c=true;
        switch(input2)
        {
        case 0:
        for(i=0;i<=words.length-1;i++)
        {
            StringBuffer inp1=new StringBuffer(words[i]);
            inp1.reverse();
        words1[i]=inp1.toString();
        output1=output1.concat(words1[i]+" ");
        }
        
            System.out.println(output1.trim());
            break;
        case 1:
            
            for(i=0;i<words.length;i++)
            {StringBuffer inp1=new StringBuffer(words[i]);
                
                inp1.reverse();
            words1[i]=inp1.toString();	
            }int j;
            for(i=0;i<words1.length;i++)
                
            {
                for(j=0;j<words1[i].length();j++)
            {int a;
            char b=words[i].charAt(j);
            a=(int)b;
            if(a>=65 && a<=90)
            {char temp=Character.toUpperCase(words1[i].charAt(j));
             
                words1[i]=words1[i].replace(words1[i].charAt(j),temp);
            }
             else if(a>=97 && a<=122)
             {
                char temp=Character.toLowerCase(words1[i].charAt(j));
                words1[i]=words1[i].replace(words1[i].charAt(j), temp);
            }
             else
             {
                 
             }
                 }
            }	
            
            for(i=0;i<=words1.length-1;i++)
            {
                
            output1=output1.concat(words1[i]+" ");
            }
        
            break;
            default:
                break;
        }	
        output1=output1.trim();
        return output1;
        }
    public static void main(String[] args) {
        System.out.println(reverseWordsAndCase("Wipro Technologies, Banglore",1));
    }    
}

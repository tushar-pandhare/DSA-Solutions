class Solution {
public:
    string rle(string s)
    {
        string res;
        int count=1;
        for(int i=0;i<s.size();i++)
        {
            if(s[i]==s[i+1]){count++;}
            else
            {
                string t=to_string(count);
                for(int j=0;j<t.size();j++)
                {
                    res.push_back(t[j]);
                }
                res.push_back(s[i]);
                count=1;
            }     
        }
        //string t=to_string(count);
        //for(int j=0;j<t.size();j++)
              //  {
                 //   res.push_back(t[j]);
               // }
       // res.push_back(s[s.size()-1]);
        return res;
    }

    string countAndSay(int n) {
        if(n==1)return "1";

        return rle(countAndSay(n-1));
    }
};
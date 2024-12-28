#include<iostream>
#include<vector>
using namespace std;

int main()
{   
  int num;
    cout<<"Enter the element to find : ";
    cin>>num;
    vector <int> v1={21,22,2121,212,2222,2332};

    for(int i=0;i<=v1.size()-1;i++){ 
            cout<<v1[i]<<" ";
    }
    for(int i=0;i<=v1.size()-1;i++){
        if(v1[i]==num){
            cout<<"Element found at index "<<i;
            break;
        }
        cout<<endl;
    }




    return 0;
}
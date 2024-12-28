#include <iostream>
using namespace std;


class Node{
    public:
    int data;
    Node * next;

    Node( int a) {

        this->data = a;
        this->next=NULL;

    }
};

// Whenever we have to create new node then we must call the class Node 

void insertBegin(Node* &head, int data){
    // creating new Node 
    Node* n1 = new Node(data);
    n1 -> next = head ;
    head = n1;
}

// Lets Traverse the Linked list

void traverselink(Node* &head){
    Node* temp = head;
    while(temp != NULL){
        cout<< temp -> data << " --- " ;
        temp = temp -> next;
    }
    if(temp == NULL){
        cout<<" NULL ";
    }
}





int main(){


    cout<<"Enter the Head and Data : ";
    int b;
    cin>>b;

    //Creation of Object!!
    Node * node1 = new Node(b);
    // cout<<"Data of Node 1 : " << node1->data << endl;
    // cout<<"Next Address of Node2 1 : " << node1->next << endl;

    cout<<"Enter the Data of Next Node: ";
    int da1;
    cin>>da1;
    
    // Head is Node1 then
    insertBegin(node1 , da1);
    traverselink(node1);

}
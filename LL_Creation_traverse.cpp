#include <iostream>
using namespace std;

struct Node {
    int data;
    Node *next;
};

void linkedListTraversal(Node *ptr) {
    while (ptr != nullptr) {
        cout << "Element: " << ptr->data << endl;
        ptr = ptr->next;
    }
}

int main() {
    Node *head = new Node();
    Node *second = new Node();
    Node *third = new Node();
    Node *fourth = new Node();

    // Link first and second nodes
    head->data = 7;
    head->next = second;

    // Link second and third nodes
    second->data = 11;
    second->next = third;

    // Link third and fourth nodes
    third->data = 41;
    third->next = fourth;

    // Terminate the list at the fourth node
    fourth->data = 66;
    fourth->next = nullptr;

    linkedListTraversal(head);

    // Free the allocated memory
    delete head;
    delete second;
    delete third;
    delete fourth;

    return 0;
}

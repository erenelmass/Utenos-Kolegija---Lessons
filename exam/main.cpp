#include <iostream>
#include <fstream> //add file read/write library
#include <vector> //add vector library

using namespace std;

struct node { //creating the linked list
    int data; //data item
    node *next; //address of another node
};
node *firstNodeAddress = NULL; //declaring the first element as NULL

void display (node *firstNodeAddress){ //displaying of the linked list
    node *listNode=firstNodeAddress; //pointing the listNode to the fist node
    cout<<"Linked list: ";
    while(listNode){ //while the list is not ended it keeps listing
        cout<< listNode->data<<" ";
        listNode=listNode->next; //when one element is done goes to the next one
    }
}

void insertNodeAtTheStart(int n){ //inserting the first element of the linked list
    node *listNode = new node; //pointing listNode as a new node
    listNode ->data = n; //declaring the data to the n veriable
    listNode ->next = firstNodeAddress; //declaring the next element as the first address
    firstNodeAddress = listNode;
}

void insertNodeAtTheEnd (int n){ //inserting the next elements of the linked list
    node *listNode = new node; //pointing listNode as a new node
    listNode ->data = n; //declaring the data to the n veriable
    listNode ->next =NULL; //declaring the next on as NULL
    if(firstNodeAddress == NULL){ //checks if there is a element as the next one
        firstNodeAddress = listNode;
    }
    else{
        node *temporary = firstNodeAddress; //creating a temporary node
        while(temporary ->next != NULL){ //going to the next one while the next one is not NULL
            temporary = temporary ->next; //declaring the next one to the temporary node
        }
        temporary ->next = listNode; //declaring the elements to the node list
    }
}

int main()
{
    vector<int> numbers; //creating a vector to hold the element in numbers.txt
    ifstream in("numbers.txt",ios::in); //opening the file and reading the numbers.txt
    int number;
    while(in >> number){ //shifts to the next number inside the file
        numbers.push_back(number); //adding the numbers the vector
    }
    in.close(); //closing the file

    insertNodeAtTheStart(numbers[0]); //inserting the first element of the vector the first address of the linked list
    for(int i=1; i<10; i++){ //going through 10 element of the file and adding them the linked list
        insertNodeAtTheEnd(numbers[i]);
    }
    display(firstNodeAddress); //displaying the linked list
    int vectorSize = numbers.size(); //declaring a veriable as vectorSize to hold the size of the vector
    cout<<"\nSize of the 'numbers' vector: "<<vectorSize; //displaying the size of the vector
    cout << "\nVector numbers: ";
    for(int i=0; i<numbers.size();i++){//displaying the elements of vector
        cout<<numbers[i]<<" ";
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Lab_03;

/**
 *
 * @author User
 */
public class Linkedlist {
public  class Node{
Node next;
int data;
Node(int data){
this.next=null;
this.data=data;}}  
private Node head;
Linkedlist (){
this.head= null;}
public void Delete(){
if(head==null){
System.out.println("the list is empty");
System.out.println("the number is inserted");}}
public void startBeg(int data){
Node newNode =new Node(data);
newNode.next=head;
head=newNode;
System.out.println("Inserted");}
public void printall(){
Node current= head;
while(current != null){
System.out.println(current.data+" -->");
current=current.next;}}
public void deleteFromBeginning() {
if(head != null) {
head=head.next;} 
else{
System.out.println("List is empty");}}
public void deleteFromEnd(){
if(head == null) {
System.out.println("List is empty");} 
else if(head.next == null) {
head = null;} 
else {
Node current=head;
while(current.next.next !=null) {
current=current.next;}
current.next = null;}}
public boolean search(int key) {
Node current=head;
while(current !=null) {
if(current.data==key) {
            return true;
        }
        current = current.next;}
    return false;}
public static void main(String args[]){
Linkedlist list=new Linkedlist ();
list.startBeg(10);
list.startBeg(20);
list.startBeg(30);
list.printall();
list.deleteFromBeginning();
list.printall();
list.search(10);
list.printall();
list.deleteFromEnd();
list.printall();}}    


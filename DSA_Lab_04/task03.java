/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Lab_04;

/**
 *
 * @author User
 */

//  Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
public int getDecimalValue(ListNode head) {
int ans=0;
while(head!=null){
ans=2*ans+head.val;
 head=head.next;}
return ans;}}
public class task03 {
    public static void main(String[] args) {
        
    }
}

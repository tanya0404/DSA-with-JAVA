

// 83. Remove Duplicates from Sorted List

// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         if(head==null) return null;
//        ListNode slow=head;
//        ListNode fast=head.next;

//        while(fast!=null){
//         if(slow.val==fast.val){
//             slow.next=fast.next;
//         }
//         else{
//             slow=slow.next;
//         }
//         fast=fast.next;
//        }
//        return head;
//     }
// }



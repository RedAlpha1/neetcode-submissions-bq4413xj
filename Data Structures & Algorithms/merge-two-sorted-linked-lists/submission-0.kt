/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var dummy = ListNode(-1)
        var current = dummy

        var p1 = list1
        var p2 = list2

        while(p1!=null && p2!=null){
            if(p1.`val`<=p2.`val`){
                current.next = p1
                p1 = p1.next
            }else{
                current.next = p2
                p2 = p2.next
            }
            current = current.next!!
        }

        current.next = p1?:p2

        return dummy.next

    }
}



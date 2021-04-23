package com.testing.linkedlist;

/**
 * @Classname ListNode
 * @Description 类型说明
 * @Date 2021/4/18 12:34
 * @Created by 测试园
 */
public class ListNode {
    public static void main(String[] args) {
        String[] arr={"快手","字节","腾讯","百度"};
        ListNode listNode = arrayToList(arr);
        System.out.println(listNode.data);
    }
    String data;
    ListNode next;
    public ListNode(String data){
        this.data=data;
    }

    public static ListNode arrayToList(String[] arr){
        if(arr.length==0){
            return null;
        }
        ListNode root=new ListNode(arr[0]);
        ListNode pre=root;
        for(int i=1;i<arr.length;i++){
            ListNode  node=new ListNode(arr[i]);
            //创建连接关系
            pre.next=node;
            pre=node;
        }
        return root;
    }

}

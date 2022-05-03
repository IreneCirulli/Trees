package com.company;

public class TreeNode {

    private String value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(String item, Object initValue, Object initRight) {
        this.value = (String) initValue;
        this.left = null;
        this.right = null;
    }

    public TreeNode(String initValue, TreeNode initLeft, TreeNode initRight) {
        this.value = initValue;
        this.left = initLeft;
        this.right = initRight;
    }

    public String getValue(){
        return value;
    }

    public TreeNode getLeft(){
        return left;
    }

    public TreeNode getRight(){
        return right;
    }

    public void setValue(String TheNewValue) {
        this.value = TheNewValue;
    }

    public void setLeft(TreeNode TheNewLeft) {
        this.left = TheNewLeft;
    }

    public void setRight(TreeNode TheNewRight) {
        this.right = TheNewRight;
    }
}

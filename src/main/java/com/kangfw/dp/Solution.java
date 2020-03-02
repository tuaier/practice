package com.kangfw.dp;

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

class Solution {
    public static int res = 0;
    public int maxAncestorDiff(TreeNode root) {

        maxlr(root, root.val);

        TreeNode lc = null;
        TreeNode rc = null;
        if (root != null) {
            lc = root.left;
            rc = root.right;
        }

        if (lc != null) {
            maxlr(lc, lc.val);
            lc = lc.left;
            maxAncestorDiff(lc);
        }

        if (rc != null) {
            maxlr(rc, rc.val);
            rc = rc.right;
            maxAncestorDiff(rc);
        }
        return res;
    }

     public void maxlr(TreeNode start, int ss) {
        TreeNode lc = null;
        TreeNode rc = null;
        if (start != null) {
            lc = start.left;
            rc = start.right;
        }

        if (lc != null) {
            int temp = Math.abs(ss - lc.val);
            res = temp > res ? temp : res;
            lc = lc.left;
            maxlr(lc, ss);
        }

        if (rc != null) {
            int temp = Math.abs(ss - rc.val);
            res = temp > res ? temp : res;
            rc = rc.right;
            maxlr(rc, ss);
        }
    }
}
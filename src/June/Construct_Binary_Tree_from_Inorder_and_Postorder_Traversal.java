package June;
/*
* 106. 从中序与后序遍历序列构造二叉树
* 递归逻辑：
* 第一步：如果数组大小为零的话，说明是空节点了。
* 第二步：如果不为空，那么取后序数组最后一个元素作为头节点元素。
* 第三步：找到后序数组最后一个元素在中序数组的位置，作为切割点
* 第四步：切割中序数组，切成中序左数组和中序右数组 （顺序别搞反了，一定是先切中序数组）
* 第五步：切割后序数组，切成后序左数组和后序右数组
* 第六步：递归处理左区间和右区间
* */

public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, postorder);
    }
    public TreeNode build(int[] inorder, int[] postorder){
        if(inorder.length == 0) return null;
        TreeNode treeNode = new TreeNode(postorder[postorder.length - 1]);
        int midNode = postorder[postorder.length - 1];
        int node_num = 0;
        for (int i = 0; i < inorder.length; i++){
            if (inorder[i] == midNode) {
                node_num = i;
                break;
            }
        }
        int [] left_inorder = new int[node_num];
        int [] left_postorder = new int[node_num];
        int [] right_inorder = new int[inorder.length - 1 - node_num];
        int [] right_postorder = new int[inorder.length - 1 - node_num];
        for (int i = 0; i < node_num; i++){
            left_inorder[i] = inorder[i];
            left_postorder[i] = postorder[i];
        }
        for (int i = node_num + 1; i < inorder.length; i++) right_inorder[i - node_num - 1] = inorder[i];
        for (int i = node_num; i < inorder.length - 1; i++) right_postorder[i - node_num] = postorder[i];
        treeNode.left = build(left_inorder, left_postorder);
        treeNode.right = build(right_inorder, right_postorder);
        return treeNode;

    }
}

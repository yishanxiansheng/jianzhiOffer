package jianZhiOfferDemo;
import java.util.*;

import dataStructure.TreeNode;
/**
 * 二叉树中和为某一值的路径
 * @author Administrator
 *
 */
public class findPath { 
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null){ 
        	return result;
        }
        list.add(root.val);
        target = target - root.val;
        if(target == 0 && root.childLeft == null && root.childLeft == null){
            result.add(new ArrayList<Integer>(list));
        }
        FindPath(root.childLeft, target);
        FindPath(root.childRight, target);
        list.remove(list.size()-1);
        return result;
    }

}
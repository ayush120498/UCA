package binaryTrees;
import java.util.Queue; 
import java.util.TreeMap; 
import java.util.LinkedList; 
import java.util.Map; 
import java.util.Map.Entry; 
 
class Nodes { 
	int data; 
	Nodes left, right; 

	public Nodes(int data) { 
		this.data = data; 
		left = right = null; 
	} 
} 

class TopView { 
	Nodes root; 

	public TopView() { 
		root = null; 
	} 
	 
	private void TopViewTraversal(Nodes root) { 
		class QueueObj { 
			Nodes node; 
			int hd; 

			QueueObj(Nodes node, int hd) { 
				this.node = node; 
				this.hd = hd; 
			} 
		} 
		Queue<QueueObj> q = new LinkedList<QueueObj>(); 
		Map<Integer, Nodes> topViewMap = new TreeMap<Integer, Nodes>(); 

		if (root == null) { 
			return; 
		} else { 
			q.add(new QueueObj(root, 0)); 
		} 

		System.out.println("The top view of the tree is : "); 
		
		while (!q.isEmpty()) { 
			QueueObj tmpNode = q.poll(); 
			if (!topViewMap.containsKey(tmpNode.hd)) { 
				topViewMap.put(tmpNode.hd, tmpNode.node); 
			} 

			if (tmpNode.node.left != null) { 
				q.add(new QueueObj(tmpNode.node.left, tmpNode.hd - 1)); 
			} 
			if (tmpNode.node.right != null) { 
				q.add(new QueueObj(tmpNode.node.right, tmpNode.hd + 1)); 
			} 

		} 
		for (Entry<Integer, Nodes> entry : topViewMap.entrySet()) { 
			System.out.print(entry.getValue().data+" ");   
		} 
	} 
	
	public static void main(String[] args) 
	{ 
	
		TopView tree = new TopView(); 
		tree.root = new Nodes(1); 
		tree.root.left = new Nodes(2); 
		tree.root.right = new Nodes(3); 
		tree.root.left.right = new Nodes(4); 
		tree.root.left.right.right = new Nodes(5); 
		tree.root.left.right.right.right = new Nodes(6); 
		tree.TopViewTraversal(tree.root); 
	} 
	
} 

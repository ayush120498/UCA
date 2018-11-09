package binaryTrees;
class SuNode{
	Student st;
	SuNode left,right;
	public  SuNode(Student stu){
		st=stu;
		left=null;
		right=null;
		
	}
}
 class Student implements Comparable<Student>{
	int roll;
	String name;
	float cgpa;
	Student(){
		roll=0;
		name=null;
		cgpa=0.0f;
	}
	Student(int roll,String name,float cgpa){
		
		this.roll=roll;
		this.name=name;
		this.cgpa=cgpa;
	}
	
	public String toString() {
		return roll+" "+name+" "+cgpa+"\n";
	}
	public int compareTo(Student s1) {
		Integer j=this.roll;
		Integer i=s1.roll;
		return i.compareTo(j);
		 
	}
}

public class BST {
	SuNode root=null;
	BST(){
	root=null;
	}
	 SuNode createBst(SuNode root,Student data) {
		
		if(root==null) {
			
			return createNode(data);
		}
		int x=data.compareTo(root.st);
		if(x>=1) {
			root.left=createBst(root.left,data);
		}
		if(x<1) {
			root.right=createBst(root.right,data);
		}
		return root;
	}
	SuNode createNode(Student data){
		SuNode nn=new SuNode(data);
		return nn;
	}
	static void inorder(SuNode root) {
		
		if(root==null) {
			return ;
		}
		else {
			inorder(root.left);
			System.out.print(root.st);
			inorder(root.right);
			
			
		}
	}
	public static void main(String args[]) {
		
		BST tree=new BST();
		tree.root=tree.createBst(tree.root,new Student(20,"Ayush",10.0f));
		tree.root=tree.createBst(tree.root,new Student(10,"sv",10.0f));
		tree.root=tree.createBst(tree.root,new Student(15,"sakshya",10.0f));
		tree.root=tree.createBst(tree.root,new Student(5,"dharya",10.0f));
		tree.root=tree.createBst(tree.root,new Student(30,"chandan",10.0f));
		tree.root=tree.createBst(tree.root,new Student(25,"priyesh",10.0f));
		
		inorder(tree.root);
	
	}
}

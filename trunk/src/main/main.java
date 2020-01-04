package main;

import libs.*;
import libs.draw.Document;

public class main {

	public static void main(String[] args) {
		factory_test();
	}
	
	/**
	 * 01 Singleton 配信時のテストコード
	 */
	public static void singleton_test() {
		//Singleton foo = new Singleton();
		
		Singleton foo = Singleton.getInstance();
		System.out.println("main関数1回目");
		foo.Debug();
		
		System.out.println("");
		System.out.println("main関数2回目");
		foo = Singleton.getInstance();
		foo.Debug();
		
		Bar();
		
		//Foo.Delete();
		
		System.out.println("");
		System.out.println("main関数3回目");
		Singleton foo2 = Singleton.getInstance();
		foo2.Debug();
		
		Bar();
		
		System.out.println("main関数4回目");
		foo.Debug();
	}
	
	static void Bar() {
		System.out.println("");
		System.out.println("Bar関数内");
		Singleton foo = Singleton.getInstance();
		foo.Debug();
	}

	/**
	 * 02 iterator 配信のテストコード
	 */
	public static void iterator_test() {
		List list = new List();
		
		list.add( new Node() );//0
		list.add( new Node() );//1
		list.add( new Node() );//2
		list.add( new Node() );//3
		list.add( new Node() );//4
		
		list.remove(2);
		list.insert(0, new Node() );
		list.insert(-1, new Node() );
		
		Node tmp = (Node)list.get(2);
		tmp.name = "this is Node.";
		
		System.out.println( "list(0).id : " + ((Node)list.get(0)).name );
		System.out.println( "list(1).id : " + ((Node)list.get(1)).name );
		System.out.println( "list(2).id : " + ((Node)list.get(2)).name );
		System.out.println( "list(3).id : " + ((Node)list.get(3)).name );
		System.out.println( "list(4).id : " + ((Node)list.get(4)).name );
		/*
		Iterator it = new Iterator();
		System.out.println( "it.id : " + it.getId() );
		it.setNext( new Iterator() );
		System.out.println( "it.next.id : " + it.getNext().getId() );
		*/
	}
	
	/**
	 * 03 Factoryパターンのテスト
	 */
	public static void factory_test() {
		Document doc = new Document();
		doc.Render();
	}
}

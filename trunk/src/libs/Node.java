package libs;
/**
 * 配列要素に名前要素を追加した派生クラス
 * @author Takemi
 */
public class Node extends Iterator{
	public String name;
	public Node() {
		super();
		name = "" + _id;
	}
}
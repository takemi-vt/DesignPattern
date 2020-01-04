package libs.draw;

/**
 * 複数行テキスト
 * @author Takemi
 */
public class Text extends DrawObject {
	
	public String text = "";
	
	/**
	 * コンストラクト
	 */
	public Text() {
		super();
		objectType = "Text";
		text = "Text " + _id ;
	}
	
	protected void Draw() {
		System.out.println("Text Draw ID " + _id + " text: " + text );
	}
}

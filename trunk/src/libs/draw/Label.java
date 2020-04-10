package libs.draw;

/**
 * 単行テキスト
 * @author Takemi
 *
 */
public class Label extends DrawObject {
	
	public String text = "";
	
	/**
	 * コンストラクト
	 */
	public Label() {
		super();
		
		text = "Label " + _id ;
	}
	
	
	protected void Draw() {
		System.out.println("Label Draw ID " + _id + " text: " + text );
	}
}

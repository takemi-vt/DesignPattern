package libs.draw;

/**
 * �����s�e�L�X�g
 * @author Takemi
 */
public class Text extends DrawObject {
	
	public String text = "";
	
	/**
	 * �R���X�g���N�g
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

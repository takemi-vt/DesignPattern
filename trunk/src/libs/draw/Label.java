package libs.draw;

/**
 * �P�s�e�L�X�g
 * @author Takemi
 *
 */
public class Label extends DrawObject {
	
	public String text = "";
	
	/**
	 * �R���X�g���N�g
	 */
	public Label() {
		super();
		
		text = "Label " + _id ;
	}
	
	
	protected void Draw() {
		System.out.println("Label Draw ID " + _id + " text: " + text );
	}
}

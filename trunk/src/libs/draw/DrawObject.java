package libs.draw;

import libs.Iterator;

/**
 * �`��I�u�W�F�N�g�N���X�̊��N���X
 * @author Takemi
 */
public class DrawObject extends Iterator {
	
		/**
	 * �`��J�nX���W
	 */
	public int x;
	
	/**
	 * �`��J�nY���W
	 */
	public int y;
	
	/**
	 * �`��G���A��
	 */
	public int width;
	
	/**
	 * �`��G���A����
	 */
	public int height;
	
	/**
	 * �`��t���O
	 */
	public boolean drawFlag = true;
	
	protected String objectType;
	
	/**
	 * �R���X�g���N�^
	 */
	public DrawObject() {
		super();
		x = 0;
		y = 0;
		width = 0;
		height= 0;
		objectType = "DrawObject";
	}
	
	public int getRight() { return x + width; }
	public int getLeft() { return x ; }
	public int getTop() { return y; }
	public int getBottom() { return y + height; }
	
	/**
	 * IF�֐�
	 */
	public void Render() {
		if( !drawFlag ) return;
		Draw();
	}
	
	/**
	 * �p����ŕ`�揈��������
	 */
	protected void Draw() {
		System.out.println("DrawObject Draw�֐�: ID " + _id );
	}
}

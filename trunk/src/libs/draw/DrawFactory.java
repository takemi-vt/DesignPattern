package libs.draw;

public class DrawFactory {
	
	/**
	 * �`��N���X�C���X�^���X���쐬���ăC���X�^���X���擾����
	 * @param objectName
	 * @return
	 */
	public static DrawObject factory( String objectName ) {
		DrawObject tmp = null;
		
		switch( objectName ) {
			case "Label":
				tmp = new Label();
				break;
				
			case "Text":
				tmp = new Text();
				break;
				
			default:
				tmp = new DrawObject();
		}
		
		//�@�K�v�ł���΃N���X�̏������������s��
		
		return tmp;
	}
}
